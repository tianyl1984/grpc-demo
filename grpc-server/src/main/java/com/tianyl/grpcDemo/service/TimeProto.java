// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: demo.proto

package com.tianyl.grpcDemo.service;

public final class TimeProto {
  private TimeProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpcDemo_TimeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpcDemo_TimeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpcDemo_TimeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpcDemo_TimeResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\ndemo.proto\022\010grpcDemo\"\033\n\013TimeRequest\022\014\n" +
      "\004name\030\001 \001(\t\"\033\n\014TimeResponse\022\013\n\003msg\030\001 \001(\t" +
      "2F\n\013TimeService\0227\n\004time\022\025.grpcDemo.TimeR" +
      "equest\032\026.grpcDemo.TimeResponse\"\000B*\n\033com." +
      "tianyl.grpcDemo.serviceB\tTimeProtoP\001b\006pr" +
      "oto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_grpcDemo_TimeRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_grpcDemo_TimeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpcDemo_TimeRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_grpcDemo_TimeResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_grpcDemo_TimeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpcDemo_TimeResponse_descriptor,
        new java.lang.String[] { "Msg", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
