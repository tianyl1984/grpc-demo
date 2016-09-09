package com.tianyl.grpcDemo.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.tianyl.grpcDemo.service.TimeRequest;
import com.tianyl.grpcDemo.service.TimeResponse;
import com.tianyl.grpcDemo.service.TimeServiceGrpc;

public class TimeServer {

	private int port = 5678;

	private Server server;

	public void start() throws IOException {
		server = ServerBuilder.forPort(port).addService(new TimeServiceImpl()).build().start();
		System.out.println("start on " + port + " ...");
		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				System.out.println("shutdown...");
				TimeServer.this.stop();
			}
		});
	}

	private void stop() {
		if (server != null) {
			server.shutdown();
		}
	}

	public static void main(String[] args) throws Exception {
		TimeServer ts = new TimeServer();
		ts.start();
		ts.blockUntilShutdown();
	}

	private void blockUntilShutdown() throws InterruptedException {
		if (server != null) {
			server.awaitTermination();
		}
	}

	private class TimeServiceImpl extends TimeServiceGrpc.TimeServiceImplBase {

		@Override
		public void time(TimeRequest request, StreamObserver<TimeResponse> responseObserver) {
			String name = request.getName();
			System.out.println("process request:" + name);
			String str = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
			TimeResponse timeResponse = TimeResponse.newBuilder().setMsg(name + ":" + str).build();
			responseObserver.onNext(timeResponse);
			responseObserver.onCompleted();
		}

	}
}
