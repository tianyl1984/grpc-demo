package com.tianyl.grpcDemo.service;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.0)",
    comments = "Source: demo.proto")
public class TimeServiceGrpc {

  private TimeServiceGrpc() {}

  public static final String SERVICE_NAME = "grpcDemo.TimeService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.tianyl.grpcDemo.service.TimeRequest,
      com.tianyl.grpcDemo.service.TimeResponse> METHOD_TIME =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "grpcDemo.TimeService", "time"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.tianyl.grpcDemo.service.TimeRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.tianyl.grpcDemo.service.TimeResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TimeServiceStub newStub(io.grpc.Channel channel) {
    return new TimeServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TimeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TimeServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static TimeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TimeServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class TimeServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void time(com.tianyl.grpcDemo.service.TimeRequest request,
        io.grpc.stub.StreamObserver<com.tianyl.grpcDemo.service.TimeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_TIME, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_TIME,
            asyncUnaryCall(
              new MethodHandlers<
                com.tianyl.grpcDemo.service.TimeRequest,
                com.tianyl.grpcDemo.service.TimeResponse>(
                  this, METHODID_TIME)))
          .build();
    }
  }

  /**
   */
  public static final class TimeServiceStub extends io.grpc.stub.AbstractStub<TimeServiceStub> {
    private TimeServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TimeServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TimeServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TimeServiceStub(channel, callOptions);
    }

    /**
     */
    public void time(com.tianyl.grpcDemo.service.TimeRequest request,
        io.grpc.stub.StreamObserver<com.tianyl.grpcDemo.service.TimeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_TIME, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TimeServiceBlockingStub extends io.grpc.stub.AbstractStub<TimeServiceBlockingStub> {
    private TimeServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TimeServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TimeServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TimeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.tianyl.grpcDemo.service.TimeResponse time(com.tianyl.grpcDemo.service.TimeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_TIME, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TimeServiceFutureStub extends io.grpc.stub.AbstractStub<TimeServiceFutureStub> {
    private TimeServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TimeServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TimeServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TimeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tianyl.grpcDemo.service.TimeResponse> time(
        com.tianyl.grpcDemo.service.TimeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_TIME, getCallOptions()), request);
    }
  }

  private static final int METHODID_TIME = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TimeServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(TimeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TIME:
          serviceImpl.time((com.tianyl.grpcDemo.service.TimeRequest) request,
              (io.grpc.stub.StreamObserver<com.tianyl.grpcDemo.service.TimeResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_TIME);
  }

}
