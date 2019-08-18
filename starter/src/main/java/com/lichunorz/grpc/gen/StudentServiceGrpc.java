package com.lichunorz.grpc.gen;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.23.0)",
    comments = "Source: Student.proto")
public final class StudentServiceGrpc {

  private StudentServiceGrpc() {}

  public static final String SERVICE_NAME = "com.lichunorz.grpc.StudentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.lichunorz.grpc.gen.MyRequest,
      com.lichunorz.grpc.gen.MyResponse> getGetRealNameByUsernameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getRealNameByUsername",
      requestType = com.lichunorz.grpc.gen.MyRequest.class,
      responseType = com.lichunorz.grpc.gen.MyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.lichunorz.grpc.gen.MyRequest,
      com.lichunorz.grpc.gen.MyResponse> getGetRealNameByUsernameMethod() {
    io.grpc.MethodDescriptor<com.lichunorz.grpc.gen.MyRequest, com.lichunorz.grpc.gen.MyResponse> getGetRealNameByUsernameMethod;
    if ((getGetRealNameByUsernameMethod = StudentServiceGrpc.getGetRealNameByUsernameMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getGetRealNameByUsernameMethod = StudentServiceGrpc.getGetRealNameByUsernameMethod) == null) {
          StudentServiceGrpc.getGetRealNameByUsernameMethod = getGetRealNameByUsernameMethod =
              io.grpc.MethodDescriptor.<com.lichunorz.grpc.gen.MyRequest, com.lichunorz.grpc.gen.MyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getRealNameByUsername"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lichunorz.grpc.gen.MyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lichunorz.grpc.gen.MyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("getRealNameByUsername"))
              .build();
        }
      }
    }
    return getGetRealNameByUsernameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.lichunorz.grpc.gen.Age,
      com.lichunorz.grpc.gen.Student> getGetStudentsByAgeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getStudentsByAge",
      requestType = com.lichunorz.grpc.gen.Age.class,
      responseType = com.lichunorz.grpc.gen.Student.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.lichunorz.grpc.gen.Age,
      com.lichunorz.grpc.gen.Student> getGetStudentsByAgeMethod() {
    io.grpc.MethodDescriptor<com.lichunorz.grpc.gen.Age, com.lichunorz.grpc.gen.Student> getGetStudentsByAgeMethod;
    if ((getGetStudentsByAgeMethod = StudentServiceGrpc.getGetStudentsByAgeMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getGetStudentsByAgeMethod = StudentServiceGrpc.getGetStudentsByAgeMethod) == null) {
          StudentServiceGrpc.getGetStudentsByAgeMethod = getGetStudentsByAgeMethod =
              io.grpc.MethodDescriptor.<com.lichunorz.grpc.gen.Age, com.lichunorz.grpc.gen.Student>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getStudentsByAge"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lichunorz.grpc.gen.Age.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lichunorz.grpc.gen.Student.getDefaultInstance()))
              .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("getStudentsByAge"))
              .build();
        }
      }
    }
    return getGetStudentsByAgeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.lichunorz.grpc.gen.Ages,
      com.lichunorz.grpc.gen.StudentList> getGetStudentListByAgesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getStudentListByAges",
      requestType = com.lichunorz.grpc.gen.Ages.class,
      responseType = com.lichunorz.grpc.gen.StudentList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.lichunorz.grpc.gen.Ages,
      com.lichunorz.grpc.gen.StudentList> getGetStudentListByAgesMethod() {
    io.grpc.MethodDescriptor<com.lichunorz.grpc.gen.Ages, com.lichunorz.grpc.gen.StudentList> getGetStudentListByAgesMethod;
    if ((getGetStudentListByAgesMethod = StudentServiceGrpc.getGetStudentListByAgesMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getGetStudentListByAgesMethod = StudentServiceGrpc.getGetStudentListByAgesMethod) == null) {
          StudentServiceGrpc.getGetStudentListByAgesMethod = getGetStudentListByAgesMethod =
              io.grpc.MethodDescriptor.<com.lichunorz.grpc.gen.Ages, com.lichunorz.grpc.gen.StudentList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getStudentListByAges"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lichunorz.grpc.gen.Ages.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lichunorz.grpc.gen.StudentList.getDefaultInstance()))
              .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("getStudentListByAges"))
              .build();
        }
      }
    }
    return getGetStudentListByAgesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.lichunorz.grpc.gen.MyRequest,
      com.lichunorz.grpc.gen.MyResponse> getTalkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "talk",
      requestType = com.lichunorz.grpc.gen.MyRequest.class,
      responseType = com.lichunorz.grpc.gen.MyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.lichunorz.grpc.gen.MyRequest,
      com.lichunorz.grpc.gen.MyResponse> getTalkMethod() {
    io.grpc.MethodDescriptor<com.lichunorz.grpc.gen.MyRequest, com.lichunorz.grpc.gen.MyResponse> getTalkMethod;
    if ((getTalkMethod = StudentServiceGrpc.getTalkMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getTalkMethod = StudentServiceGrpc.getTalkMethod) == null) {
          StudentServiceGrpc.getTalkMethod = getTalkMethod =
              io.grpc.MethodDescriptor.<com.lichunorz.grpc.gen.MyRequest, com.lichunorz.grpc.gen.MyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "talk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lichunorz.grpc.gen.MyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lichunorz.grpc.gen.MyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("talk"))
              .build();
        }
      }
    }
    return getTalkMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StudentServiceStub newStub(io.grpc.Channel channel) {
    return new StudentServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StudentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new StudentServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StudentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new StudentServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class StudentServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getRealNameByUsername(com.lichunorz.grpc.gen.MyRequest request,
        io.grpc.stub.StreamObserver<com.lichunorz.grpc.gen.MyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRealNameByUsernameMethod(), responseObserver);
    }

    /**
     */
    public void getStudentsByAge(com.lichunorz.grpc.gen.Age request,
        io.grpc.stub.StreamObserver<com.lichunorz.grpc.gen.Student> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStudentsByAgeMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.lichunorz.grpc.gen.Ages> getStudentListByAges(
        io.grpc.stub.StreamObserver<com.lichunorz.grpc.gen.StudentList> responseObserver) {
      return asyncUnimplementedStreamingCall(getGetStudentListByAgesMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.lichunorz.grpc.gen.MyRequest> talk(
        io.grpc.stub.StreamObserver<com.lichunorz.grpc.gen.MyResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getTalkMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetRealNameByUsernameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.lichunorz.grpc.gen.MyRequest,
                com.lichunorz.grpc.gen.MyResponse>(
                  this, METHODID_GET_REAL_NAME_BY_USERNAME)))
          .addMethod(
            getGetStudentsByAgeMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.lichunorz.grpc.gen.Age,
                com.lichunorz.grpc.gen.Student>(
                  this, METHODID_GET_STUDENTS_BY_AGE)))
          .addMethod(
            getGetStudentListByAgesMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.lichunorz.grpc.gen.Ages,
                com.lichunorz.grpc.gen.StudentList>(
                  this, METHODID_GET_STUDENT_LIST_BY_AGES)))
          .addMethod(
            getTalkMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.lichunorz.grpc.gen.MyRequest,
                com.lichunorz.grpc.gen.MyResponse>(
                  this, METHODID_TALK)))
          .build();
    }
  }

  /**
   */
  public static final class StudentServiceStub extends io.grpc.stub.AbstractStub<StudentServiceStub> {
    private StudentServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StudentServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StudentServiceStub(channel, callOptions);
    }

    /**
     */
    public void getRealNameByUsername(com.lichunorz.grpc.gen.MyRequest request,
        io.grpc.stub.StreamObserver<com.lichunorz.grpc.gen.MyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRealNameByUsernameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getStudentsByAge(com.lichunorz.grpc.gen.Age request,
        io.grpc.stub.StreamObserver<com.lichunorz.grpc.gen.Student> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetStudentsByAgeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.lichunorz.grpc.gen.Ages> getStudentListByAges(
        io.grpc.stub.StreamObserver<com.lichunorz.grpc.gen.StudentList> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getGetStudentListByAgesMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.lichunorz.grpc.gen.MyRequest> talk(
        io.grpc.stub.StreamObserver<com.lichunorz.grpc.gen.MyResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getTalkMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class StudentServiceBlockingStub extends io.grpc.stub.AbstractStub<StudentServiceBlockingStub> {
    private StudentServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StudentServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StudentServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.lichunorz.grpc.gen.MyResponse getRealNameByUsername(com.lichunorz.grpc.gen.MyRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetRealNameByUsernameMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.lichunorz.grpc.gen.Student> getStudentsByAge(
        com.lichunorz.grpc.gen.Age request) {
      return blockingServerStreamingCall(
          getChannel(), getGetStudentsByAgeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class StudentServiceFutureStub extends io.grpc.stub.AbstractStub<StudentServiceFutureStub> {
    private StudentServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StudentServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StudentServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lichunorz.grpc.gen.MyResponse> getRealNameByUsername(
        com.lichunorz.grpc.gen.MyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRealNameByUsernameMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_REAL_NAME_BY_USERNAME = 0;
  private static final int METHODID_GET_STUDENTS_BY_AGE = 1;
  private static final int METHODID_GET_STUDENT_LIST_BY_AGES = 2;
  private static final int METHODID_TALK = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StudentServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StudentServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_REAL_NAME_BY_USERNAME:
          serviceImpl.getRealNameByUsername((com.lichunorz.grpc.gen.MyRequest) request,
              (io.grpc.stub.StreamObserver<com.lichunorz.grpc.gen.MyResponse>) responseObserver);
          break;
        case METHODID_GET_STUDENTS_BY_AGE:
          serviceImpl.getStudentsByAge((com.lichunorz.grpc.gen.Age) request,
              (io.grpc.stub.StreamObserver<com.lichunorz.grpc.gen.Student>) responseObserver);
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
        case METHODID_GET_STUDENT_LIST_BY_AGES:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getStudentListByAges(
              (io.grpc.stub.StreamObserver<com.lichunorz.grpc.gen.StudentList>) responseObserver);
        case METHODID_TALK:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.talk(
              (io.grpc.stub.StreamObserver<com.lichunorz.grpc.gen.MyResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class StudentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StudentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.lichunorz.grpc.gen.StudentProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StudentService");
    }
  }

  private static final class StudentServiceFileDescriptorSupplier
      extends StudentServiceBaseDescriptorSupplier {
    StudentServiceFileDescriptorSupplier() {}
  }

  private static final class StudentServiceMethodDescriptorSupplier
      extends StudentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StudentServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (StudentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StudentServiceFileDescriptorSupplier())
              .addMethod(getGetRealNameByUsernameMethod())
              .addMethod(getGetStudentsByAgeMethod())
              .addMethod(getGetStudentListByAgesMethod())
              .addMethod(getTalkMethod())
              .build();
        }
      }
    }
    return result;
  }
}
