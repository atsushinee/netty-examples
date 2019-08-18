// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Student.proto

package com.lichunorz.grpc.gen;

/**
 * Protobuf type {@code com.lichunorz.grpc.Ages}
 */
public  final class Ages extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.lichunorz.grpc.Ages)
    AgesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Ages.newBuilder() to construct.
  private Ages(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Ages() {
    age_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Ages();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Ages(
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
              age_ = new java.util.ArrayList<com.lichunorz.grpc.gen.Age>();
              mutable_bitField0_ |= 0x00000001;
            }
            age_.add(
                input.readMessage(com.lichunorz.grpc.gen.Age.parser(), extensionRegistry));
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
        age_ = java.util.Collections.unmodifiableList(age_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.lichunorz.grpc.gen.StudentProto.internal_static_com_lichunorz_grpc_Ages_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.lichunorz.grpc.gen.StudentProto.internal_static_com_lichunorz_grpc_Ages_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.lichunorz.grpc.gen.Ages.class, com.lichunorz.grpc.gen.Ages.Builder.class);
  }

  public static final int AGE_FIELD_NUMBER = 1;
  private java.util.List<com.lichunorz.grpc.gen.Age> age_;
  /**
   * <code>repeated .com.lichunorz.grpc.Age age = 1;</code>
   */
  public java.util.List<com.lichunorz.grpc.gen.Age> getAgeList() {
    return age_;
  }
  /**
   * <code>repeated .com.lichunorz.grpc.Age age = 1;</code>
   */
  public java.util.List<? extends com.lichunorz.grpc.gen.AgeOrBuilder> 
      getAgeOrBuilderList() {
    return age_;
  }
  /**
   * <code>repeated .com.lichunorz.grpc.Age age = 1;</code>
   */
  public int getAgeCount() {
    return age_.size();
  }
  /**
   * <code>repeated .com.lichunorz.grpc.Age age = 1;</code>
   */
  public com.lichunorz.grpc.gen.Age getAge(int index) {
    return age_.get(index);
  }
  /**
   * <code>repeated .com.lichunorz.grpc.Age age = 1;</code>
   */
  public com.lichunorz.grpc.gen.AgeOrBuilder getAgeOrBuilder(
      int index) {
    return age_.get(index);
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
    for (int i = 0; i < age_.size(); i++) {
      output.writeMessage(1, age_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < age_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, age_.get(i));
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
    if (!(obj instanceof com.lichunorz.grpc.gen.Ages)) {
      return super.equals(obj);
    }
    com.lichunorz.grpc.gen.Ages other = (com.lichunorz.grpc.gen.Ages) obj;

    if (!getAgeList()
        .equals(other.getAgeList())) return false;
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
    if (getAgeCount() > 0) {
      hash = (37 * hash) + AGE_FIELD_NUMBER;
      hash = (53 * hash) + getAgeList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.lichunorz.grpc.gen.Ages parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.lichunorz.grpc.gen.Ages parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.lichunorz.grpc.gen.Ages parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.lichunorz.grpc.gen.Ages parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.lichunorz.grpc.gen.Ages parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.lichunorz.grpc.gen.Ages parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.lichunorz.grpc.gen.Ages parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.lichunorz.grpc.gen.Ages parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.lichunorz.grpc.gen.Ages parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.lichunorz.grpc.gen.Ages parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.lichunorz.grpc.gen.Ages parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.lichunorz.grpc.gen.Ages parseFrom(
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
  public static Builder newBuilder(com.lichunorz.grpc.gen.Ages prototype) {
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
   * Protobuf type {@code com.lichunorz.grpc.Ages}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.lichunorz.grpc.Ages)
      com.lichunorz.grpc.gen.AgesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.lichunorz.grpc.gen.StudentProto.internal_static_com_lichunorz_grpc_Ages_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.lichunorz.grpc.gen.StudentProto.internal_static_com_lichunorz_grpc_Ages_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.lichunorz.grpc.gen.Ages.class, com.lichunorz.grpc.gen.Ages.Builder.class);
    }

    // Construct using com.lichunorz.grpc.gen.Ages.newBuilder()
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
        getAgeFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (ageBuilder_ == null) {
        age_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        ageBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.lichunorz.grpc.gen.StudentProto.internal_static_com_lichunorz_grpc_Ages_descriptor;
    }

    @java.lang.Override
    public com.lichunorz.grpc.gen.Ages getDefaultInstanceForType() {
      return com.lichunorz.grpc.gen.Ages.getDefaultInstance();
    }

    @java.lang.Override
    public com.lichunorz.grpc.gen.Ages build() {
      com.lichunorz.grpc.gen.Ages result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.lichunorz.grpc.gen.Ages buildPartial() {
      com.lichunorz.grpc.gen.Ages result = new com.lichunorz.grpc.gen.Ages(this);
      int from_bitField0_ = bitField0_;
      if (ageBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          age_ = java.util.Collections.unmodifiableList(age_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.age_ = age_;
      } else {
        result.age_ = ageBuilder_.build();
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
      if (other instanceof com.lichunorz.grpc.gen.Ages) {
        return mergeFrom((com.lichunorz.grpc.gen.Ages)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.lichunorz.grpc.gen.Ages other) {
      if (other == com.lichunorz.grpc.gen.Ages.getDefaultInstance()) return this;
      if (ageBuilder_ == null) {
        if (!other.age_.isEmpty()) {
          if (age_.isEmpty()) {
            age_ = other.age_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAgeIsMutable();
            age_.addAll(other.age_);
          }
          onChanged();
        }
      } else {
        if (!other.age_.isEmpty()) {
          if (ageBuilder_.isEmpty()) {
            ageBuilder_.dispose();
            ageBuilder_ = null;
            age_ = other.age_;
            bitField0_ = (bitField0_ & ~0x00000001);
            ageBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAgeFieldBuilder() : null;
          } else {
            ageBuilder_.addAllMessages(other.age_);
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
      com.lichunorz.grpc.gen.Ages parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.lichunorz.grpc.gen.Ages) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.lichunorz.grpc.gen.Age> age_ =
      java.util.Collections.emptyList();
    private void ensureAgeIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        age_ = new java.util.ArrayList<com.lichunorz.grpc.gen.Age>(age_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.lichunorz.grpc.gen.Age, com.lichunorz.grpc.gen.Age.Builder, com.lichunorz.grpc.gen.AgeOrBuilder> ageBuilder_;

    /**
     * <code>repeated .com.lichunorz.grpc.Age age = 1;</code>
     */
    public java.util.List<com.lichunorz.grpc.gen.Age> getAgeList() {
      if (ageBuilder_ == null) {
        return java.util.Collections.unmodifiableList(age_);
      } else {
        return ageBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.lichunorz.grpc.Age age = 1;</code>
     */
    public int getAgeCount() {
      if (ageBuilder_ == null) {
        return age_.size();
      } else {
        return ageBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.lichunorz.grpc.Age age = 1;</code>
     */
    public com.lichunorz.grpc.gen.Age getAge(int index) {
      if (ageBuilder_ == null) {
        return age_.get(index);
      } else {
        return ageBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.lichunorz.grpc.Age age = 1;</code>
     */
    public Builder setAge(
        int index, com.lichunorz.grpc.gen.Age value) {
      if (ageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAgeIsMutable();
        age_.set(index, value);
        onChanged();
      } else {
        ageBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.lichunorz.grpc.Age age = 1;</code>
     */
    public Builder setAge(
        int index, com.lichunorz.grpc.gen.Age.Builder builderForValue) {
      if (ageBuilder_ == null) {
        ensureAgeIsMutable();
        age_.set(index, builderForValue.build());
        onChanged();
      } else {
        ageBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.lichunorz.grpc.Age age = 1;</code>
     */
    public Builder addAge(com.lichunorz.grpc.gen.Age value) {
      if (ageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAgeIsMutable();
        age_.add(value);
        onChanged();
      } else {
        ageBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.lichunorz.grpc.Age age = 1;</code>
     */
    public Builder addAge(
        int index, com.lichunorz.grpc.gen.Age value) {
      if (ageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAgeIsMutable();
        age_.add(index, value);
        onChanged();
      } else {
        ageBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.lichunorz.grpc.Age age = 1;</code>
     */
    public Builder addAge(
        com.lichunorz.grpc.gen.Age.Builder builderForValue) {
      if (ageBuilder_ == null) {
        ensureAgeIsMutable();
        age_.add(builderForValue.build());
        onChanged();
      } else {
        ageBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.lichunorz.grpc.Age age = 1;</code>
     */
    public Builder addAge(
        int index, com.lichunorz.grpc.gen.Age.Builder builderForValue) {
      if (ageBuilder_ == null) {
        ensureAgeIsMutable();
        age_.add(index, builderForValue.build());
        onChanged();
      } else {
        ageBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.lichunorz.grpc.Age age = 1;</code>
     */
    public Builder addAllAge(
        java.lang.Iterable<? extends com.lichunorz.grpc.gen.Age> values) {
      if (ageBuilder_ == null) {
        ensureAgeIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, age_);
        onChanged();
      } else {
        ageBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.lichunorz.grpc.Age age = 1;</code>
     */
    public Builder clearAge() {
      if (ageBuilder_ == null) {
        age_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        ageBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.lichunorz.grpc.Age age = 1;</code>
     */
    public Builder removeAge(int index) {
      if (ageBuilder_ == null) {
        ensureAgeIsMutable();
        age_.remove(index);
        onChanged();
      } else {
        ageBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.lichunorz.grpc.Age age = 1;</code>
     */
    public com.lichunorz.grpc.gen.Age.Builder getAgeBuilder(
        int index) {
      return getAgeFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.lichunorz.grpc.Age age = 1;</code>
     */
    public com.lichunorz.grpc.gen.AgeOrBuilder getAgeOrBuilder(
        int index) {
      if (ageBuilder_ == null) {
        return age_.get(index);  } else {
        return ageBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.lichunorz.grpc.Age age = 1;</code>
     */
    public java.util.List<? extends com.lichunorz.grpc.gen.AgeOrBuilder> 
         getAgeOrBuilderList() {
      if (ageBuilder_ != null) {
        return ageBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(age_);
      }
    }
    /**
     * <code>repeated .com.lichunorz.grpc.Age age = 1;</code>
     */
    public com.lichunorz.grpc.gen.Age.Builder addAgeBuilder() {
      return getAgeFieldBuilder().addBuilder(
          com.lichunorz.grpc.gen.Age.getDefaultInstance());
    }
    /**
     * <code>repeated .com.lichunorz.grpc.Age age = 1;</code>
     */
    public com.lichunorz.grpc.gen.Age.Builder addAgeBuilder(
        int index) {
      return getAgeFieldBuilder().addBuilder(
          index, com.lichunorz.grpc.gen.Age.getDefaultInstance());
    }
    /**
     * <code>repeated .com.lichunorz.grpc.Age age = 1;</code>
     */
    public java.util.List<com.lichunorz.grpc.gen.Age.Builder> 
         getAgeBuilderList() {
      return getAgeFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.lichunorz.grpc.gen.Age, com.lichunorz.grpc.gen.Age.Builder, com.lichunorz.grpc.gen.AgeOrBuilder> 
        getAgeFieldBuilder() {
      if (ageBuilder_ == null) {
        ageBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.lichunorz.grpc.gen.Age, com.lichunorz.grpc.gen.Age.Builder, com.lichunorz.grpc.gen.AgeOrBuilder>(
                age_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        age_ = null;
      }
      return ageBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.lichunorz.grpc.Ages)
  }

  // @@protoc_insertion_point(class_scope:com.lichunorz.grpc.Ages)
  private static final com.lichunorz.grpc.gen.Ages DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.lichunorz.grpc.gen.Ages();
  }

  public static com.lichunorz.grpc.gen.Ages getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Ages>
      PARSER = new com.google.protobuf.AbstractParser<Ages>() {
    @java.lang.Override
    public Ages parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Ages(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Ages> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Ages> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.lichunorz.grpc.gen.Ages getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
