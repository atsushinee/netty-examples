// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Student.proto

package com.lichunorz.grpc.gen;

public final class StudentProto {
  private StudentProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_lichunorz_grpc_MyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_lichunorz_grpc_MyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_lichunorz_grpc_MyResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_lichunorz_grpc_MyResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_lichunorz_grpc_Age_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_lichunorz_grpc_Age_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_lichunorz_grpc_Ages_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_lichunorz_grpc_Ages_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_lichunorz_grpc_Student_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_lichunorz_grpc_Student_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_lichunorz_grpc_StudentList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_lichunorz_grpc_StudentList_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rStudent.proto\022\022com.lichunorz.grpc\"\035\n\tM" +
      "yRequest\022\020\n\010username\030\001 \001(\t\"\036\n\nMyResponse" +
      "\022\020\n\010realname\030\002 \001(\t\"\022\n\003Age\022\013\n\003age\030\001 \001(\005\"," +
      "\n\004Ages\022$\n\003age\030\001 \003(\0132\027.com.lichunorz.grpc" +
      ".Age\"2\n\007Student\022\013\n\003age\030\001 \001(\005\022\014\n\004name\030\002 \001" +
      "(\t\022\014\n\004city\030\003 \001(\t\"?\n\013StudentList\0220\n\013stude" +
      "ntList\030\001 \003(\0132\033.com.lichunorz.grpc.Studen" +
      "t2\217\002\n\016StudentService\022X\n\025getRealNameByUse" +
      "rname\022\035.com.lichunorz.grpc.MyRequest\032\036.c" +
      "om.lichunorz.grpc.MyResponse\"\000\022L\n\020getStu" +
      "dentsByAge\022\027.com.lichunorz.grpc.Age\032\033.co" +
      "m.lichunorz.grpc.Student\"\0000\001\022U\n\024getStude" +
      "ntListByAges\022\030.com.lichunorz.grpc.Ages\032\037" +
      ".com.lichunorz.grpc.StudentList\"\000(\001B(\n\026c" +
      "om.lichunorz.grpc.genB\014StudentProtoP\001b\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_lichunorz_grpc_MyRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_lichunorz_grpc_MyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_lichunorz_grpc_MyRequest_descriptor,
        new java.lang.String[] { "Username", });
    internal_static_com_lichunorz_grpc_MyResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_lichunorz_grpc_MyResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_lichunorz_grpc_MyResponse_descriptor,
        new java.lang.String[] { "Realname", });
    internal_static_com_lichunorz_grpc_Age_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_lichunorz_grpc_Age_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_lichunorz_grpc_Age_descriptor,
        new java.lang.String[] { "Age", });
    internal_static_com_lichunorz_grpc_Ages_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_lichunorz_grpc_Ages_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_lichunorz_grpc_Ages_descriptor,
        new java.lang.String[] { "Age", });
    internal_static_com_lichunorz_grpc_Student_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_lichunorz_grpc_Student_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_lichunorz_grpc_Student_descriptor,
        new java.lang.String[] { "Age", "Name", "City", });
    internal_static_com_lichunorz_grpc_StudentList_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_com_lichunorz_grpc_StudentList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_lichunorz_grpc_StudentList_descriptor,
        new java.lang.String[] { "StudentList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
