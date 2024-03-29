// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Student.proto

package com.lichunorz.grpc.gen;

/**
 * Protobuf type {@code com.lichunorz.grpc.StudentList}
 */
public  final class StudentList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.lichunorz.grpc.StudentList)
    StudentListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StudentList.newBuilder() to construct.
  private StudentList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StudentList() {
    studentList_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StudentList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StudentList(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              studentList_ = new java.util.ArrayList<com.lichunorz.grpc.gen.Student>();
              mutable_bitField0_ |= 0x00000001;
            }
            studentList_.add(
                input.readMessage(com.lichunorz.grpc.gen.Student.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        studentList_ = java.util.Collections.unmodifiableList(studentList_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.lichunorz.grpc.gen.StudentProto.internal_static_com_lichunorz_grpc_StudentList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.lichunorz.grpc.gen.StudentProto.internal_static_com_lichunorz_grpc_StudentList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.lichunorz.grpc.gen.StudentList.class, com.lichunorz.grpc.gen.StudentList.Builder.class);
  }

  public static final int STUDENTLIST_FIELD_NUMBER = 1;
  private java.util.List<com.lichunorz.grpc.gen.Student> studentList_;
  /**
   * <code>repeated .com.lichunorz.grpc.Student studentList = 1;</code>
   */
  public java.util.List<com.lichunorz.grpc.gen.Student> getStudentListList() {
    return studentList_;
  }
  /**
   * <code>repeated .com.lichunorz.grpc.Student studentList = 1;</code>
   */
  public java.util.List<? extends com.lichunorz.grpc.gen.StudentOrBuilder> 
      getStudentListOrBuilderList() {
    return studentList_;
  }
  /**
   * <code>repeated .com.lichunorz.grpc.Student studentList = 1;</code>
   */
  public int getStudentListCount() {
    return studentList_.size();
  }
  /**
   * <code>repeated .com.lichunorz.grpc.Student studentList = 1;</code>
   */
  public com.lichunorz.grpc.gen.Student getStudentList(int index) {
    return studentList_.get(index);
  }
  /**
   * <code>repeated .com.lichunorz.grpc.Student studentList = 1;</code>
   */
  public com.lichunorz.grpc.gen.StudentOrBuilder getStudentListOrBuilder(
      int index) {
    return studentList_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < studentList_.size(); i++) {
      output.writeMessage(1, studentList_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < studentList_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, studentList_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.lichunorz.grpc.gen.StudentList)) {
      return super.equals(obj);
    }
    com.lichunorz.grpc.gen.StudentList other = (com.lichunorz.grpc.gen.StudentList) obj;

    if (!getStudentListList()
        .equals(other.getStudentListList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getStudentListCount() > 0) {
      hash = (37 * hash) + STUDENTLIST_FIELD_NUMBER;
      hash = (53 * hash) + getStudentListList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.lichunorz.grpc.gen.StudentList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.lichunorz.grpc.gen.StudentList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.lichunorz.grpc.gen.StudentList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.lichunorz.grpc.gen.StudentList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.lichunorz.grpc.gen.StudentList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.lichunorz.grpc.gen.StudentList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.lichunorz.grpc.gen.StudentList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.lichunorz.grpc.gen.StudentList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.lichunorz.grpc.gen.StudentList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.lichunorz.grpc.gen.StudentList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.lichunorz.grpc.gen.StudentList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.lichunorz.grpc.gen.StudentList parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.lichunorz.grpc.gen.StudentList prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.lichunorz.grpc.StudentList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.lichunorz.grpc.StudentList)
      com.lichunorz.grpc.gen.StudentListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.lichunorz.grpc.gen.StudentProto.internal_static_com_lichunorz_grpc_StudentList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.lichunorz.grpc.gen.StudentProto.internal_static_com_lichunorz_grpc_StudentList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.lichunorz.grpc.gen.StudentList.class, com.lichunorz.grpc.gen.StudentList.Builder.class);
    }

    // Construct using com.lichunorz.grpc.gen.StudentList.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getStudentListFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (studentListBuilder_ == null) {
        studentList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        studentListBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.lichunorz.grpc.gen.StudentProto.internal_static_com_lichunorz_grpc_StudentList_descriptor;
    }

    @java.lang.Override
    public com.lichunorz.grpc.gen.StudentList getDefaultInstanceForType() {
      return com.lichunorz.grpc.gen.StudentList.getDefaultInstance();
    }

    @java.lang.Override
    public com.lichunorz.grpc.gen.StudentList build() {
      com.lichunorz.grpc.gen.StudentList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.lichunorz.grpc.gen.StudentList buildPartial() {
      com.lichunorz.grpc.gen.StudentList result = new com.lichunorz.grpc.gen.StudentList(this);
      int from_bitField0_ = bitField0_;
      if (studentListBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          studentList_ = java.util.Collections.unmodifiableList(studentList_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.studentList_ = studentList_;
      } else {
        result.studentList_ = studentListBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.lichunorz.grpc.gen.StudentList) {
        return mergeFrom((com.lichunorz.grpc.gen.StudentList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.lichunorz.grpc.gen.StudentList other) {
      if (other == com.lichunorz.grpc.gen.StudentList.getDefaultInstance()) return this;
      if (studentListBuilder_ == null) {
        if (!other.studentList_.isEmpty()) {
          if (studentList_.isEmpty()) {
            studentList_ = other.studentList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureStudentListIsMutable();
            studentList_.addAll(other.studentList_);
          }
          onChanged();
        }
      } else {
        if (!other.studentList_.isEmpty()) {
          if (studentListBuilder_.isEmpty()) {
            studentListBuilder_.dispose();
            studentListBuilder_ = null;
            studentList_ = other.studentList_;
            bitField0_ = (bitField0_ & ~0x00000001);
            studentListBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getStudentListFieldBuilder() : null;
          } else {
            studentListBuilder_.addAllMessages(other.studentList_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.lichunorz.grpc.gen.StudentList parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.lichunorz.grpc.gen.StudentList) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.lichunorz.grpc.gen.Student> studentList_ =
      java.util.Collections.emptyList();
    private void ensureStudentListIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        studentList_ = new java.util.ArrayList<com.lichunorz.grpc.gen.Student>(studentList_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.lichunorz.grpc.gen.Student, com.lichunorz.grpc.gen.Student.Builder, com.lichunorz.grpc.gen.StudentOrBuilder> studentListBuilder_;

    /**
     * <code>repeated .com.lichunorz.grpc.Student studentList = 1;</code>
     */
    public java.util.List<com.lichunorz.grpc.gen.Student> getStudentListList() {
      if (studentListBuilder_ == null) {
        return java.util.Collections.unmodifiableList(studentList_);
      } else {
        return studentListBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.lichunorz.grpc.Student studentList = 1;</code>
     */
    public int getStudentListCount() {
      if (studentListBuilder_ == null) {
        return studentList_.size();
      } else {
        return studentListBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.lichunorz.grpc.Student studentList = 1;</code>
     */
    public com.lichunorz.grpc.gen.Student getStudentList(int index) {
      if (studentListBuilder_ == null) {
        return studentList_.get(index);
      } else {
        return studentListBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.lichunorz.grpc.Student studentList = 1;</code>
     */
    public Builder setStudentList(
        int index, com.lichunorz.grpc.gen.Student value) {
      if (studentListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStudentListIsMutable();
        studentList_.set(index, value);
        onChanged();
      } else {
        studentListBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.lichunorz.grpc.Student studentList = 1;</code>
     */
    public Builder setStudentList(
        int index, com.lichunorz.grpc.gen.Student.Builder builderForValue) {
      if (studentListBuilder_ == null) {
        ensureStudentListIsMutable();
        studentList_.set(index, builderForValue.build());
        onChanged();
      } else {
        studentListBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.lichunorz.grpc.Student studentList = 1;</code>
     */
    public Builder addStudentList(com.lichunorz.grpc.gen.Student value) {
      if (studentListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStudentListIsMutable();
        studentList_.add(value);
        onChanged();
      } else {
        studentListBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.lichunorz.grpc.Student studentList = 1;</code>
     */
    public Builder addStudentList(
        int index, com.lichunorz.grpc.gen.Student value) {
      if (studentListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStudentListIsMutable();
        studentList_.add(index, value);
        onChanged();
      } else {
        studentListBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.lichunorz.grpc.Student studentList = 1;</code>
     */
    public Builder addStudentList(
        com.lichunorz.grpc.gen.Student.Builder builderForValue) {
      if (studentListBuilder_ == null) {
        ensureStudentListIsMutable();
        studentList_.add(builderForValue.build());
        onChanged();
      } else {
        studentListBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.lichunorz.grpc.Student studentList = 1;</code>
     */
    public Builder addStudentList(
        int index, com.lichunorz.grpc.gen.Student.Builder builderForValue) {
      if (studentListBuilder_ == null) {
        ensureStudentListIsMutable();
        studentList_.add(index, builderForValue.build());
        onChanged();
      } else {
        studentListBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.lichunorz.grpc.Student studentList = 1;</code>
     */
    public Builder addAllStudentList(
        java.lang.Iterable<? extends com.lichunorz.grpc.gen.Student> values) {
      if (studentListBuilder_ == null) {
        ensureStudentListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, studentList_);
        onChanged();
      } else {
        studentListBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.lichunorz.grpc.Student studentList = 1;</code>
     */
    public Builder clearStudentList() {
      if (studentListBuilder_ == null) {
        studentList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        studentListBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.lichunorz.grpc.Student studentList = 1;</code>
     */
    public Builder removeStudentList(int index) {
      if (studentListBuilder_ == null) {
        ensureStudentListIsMutable();
        studentList_.remove(index);
        onChanged();
      } else {
        studentListBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.lichunorz.grpc.Student studentList = 1;</code>
     */
    public com.lichunorz.grpc.gen.Student.Builder getStudentListBuilder(
        int index) {
      return getStudentListFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.lichunorz.grpc.Student studentList = 1;</code>
     */
    public com.lichunorz.grpc.gen.StudentOrBuilder getStudentListOrBuilder(
        int index) {
      if (studentListBuilder_ == null) {
        return studentList_.get(index);  } else {
        return studentListBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.lichunorz.grpc.Student studentList = 1;</code>
     */
    public java.util.List<? extends com.lichunorz.grpc.gen.StudentOrBuilder> 
         getStudentListOrBuilderList() {
      if (studentListBuilder_ != null) {
        return studentListBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(studentList_);
      }
    }
    /**
     * <code>repeated .com.lichunorz.grpc.Student studentList = 1;</code>
     */
    public com.lichunorz.grpc.gen.Student.Builder addStudentListBuilder() {
      return getStudentListFieldBuilder().addBuilder(
          com.lichunorz.grpc.gen.Student.getDefaultInstance());
    }
    /**
     * <code>repeated .com.lichunorz.grpc.Student studentList = 1;</code>
     */
    public com.lichunorz.grpc.gen.Student.Builder addStudentListBuilder(
        int index) {
      return getStudentListFieldBuilder().addBuilder(
          index, com.lichunorz.grpc.gen.Student.getDefaultInstance());
    }
    /**
     * <code>repeated .com.lichunorz.grpc.Student studentList = 1;</code>
     */
    public java.util.List<com.lichunorz.grpc.gen.Student.Builder> 
         getStudentListBuilderList() {
      return getStudentListFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.lichunorz.grpc.gen.Student, com.lichunorz.grpc.gen.Student.Builder, com.lichunorz.grpc.gen.StudentOrBuilder> 
        getStudentListFieldBuilder() {
      if (studentListBuilder_ == null) {
        studentListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.lichunorz.grpc.gen.Student, com.lichunorz.grpc.gen.Student.Builder, com.lichunorz.grpc.gen.StudentOrBuilder>(
                studentList_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        studentList_ = null;
      }
      return studentListBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.lichunorz.grpc.StudentList)
  }

  // @@protoc_insertion_point(class_scope:com.lichunorz.grpc.StudentList)
  private static final com.lichunorz.grpc.gen.StudentList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.lichunorz.grpc.gen.StudentList();
  }

  public static com.lichunorz.grpc.gen.StudentList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StudentList>
      PARSER = new com.google.protobuf.AbstractParser<StudentList>() {
    @java.lang.Override
    public StudentList parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StudentList(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StudentList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StudentList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.lichunorz.grpc.gen.StudentList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

