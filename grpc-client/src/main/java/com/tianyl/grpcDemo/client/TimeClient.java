package com.tianyl.grpcDemo.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.concurrent.TimeUnit;

import com.tianyl.grpcDemo.service.TimeRequest;
import com.tianyl.grpcDemo.service.TimeResponse;
import com.tianyl.grpcDemo.service.TimeServiceGrpc;

public class TimeClient {

	private ManagedChannel channel;

	private TimeServiceGrpc.TimeServiceBlockingStub blockingStub;

	public TimeClient(String host, int port) {
		channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext(true).build();
		blockingStub = TimeServiceGrpc.newBlockingStub(channel);
	}

	public void shutdown() throws Exception {
		channel.shutdown().awaitTermination(3L, TimeUnit.SECONDS);
	}

	public static void main(String[] args) throws Exception {
		TimeClient tc = new TimeClient("127.0.0.1", 5678);
		TimeRequest request = TimeRequest.newBuilder().setName("张三").build();
		TimeResponse response = tc.blockingStub.time(request);
		System.out.println(response.getMsg());
		tc.shutdown();
	}

}
