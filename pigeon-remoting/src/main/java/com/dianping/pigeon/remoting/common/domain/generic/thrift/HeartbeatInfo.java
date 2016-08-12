/**
 * Autogenerated by Thrift Compiler (0.8.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.dianping.pigeon.remoting.common.domain.generic.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HeartbeatInfo implements org.apache.thrift.TBase<HeartbeatInfo, HeartbeatInfo._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("HeartbeatInfo");

  private static final org.apache.thrift.protocol.TField APPKEY_FIELD_DESC = new org.apache.thrift.protocol.TField("appkey", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField SEND_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("sendTime", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField LOAD_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("loadInfo", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.BOOL, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new HeartbeatInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new HeartbeatInfoTupleSchemeFactory());
  }

  public String appkey; // optional
  public long sendTime; // optional
  public LoadInfo loadInfo; // optional
  public boolean status; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    APPKEY((short)1, "appkey"),
    SEND_TIME((short)2, "sendTime"),
    LOAD_INFO((short)3, "loadInfo"),
    STATUS((short)4, "status");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // APPKEY
          return APPKEY;
        case 2: // SEND_TIME
          return SEND_TIME;
        case 3: // LOAD_INFO
          return LOAD_INFO;
        case 4: // STATUS
          return STATUS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __SENDTIME_ISSET_ID = 0;
  private static final int __STATUS_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);
  private _Fields optionals[] = {_Fields.APPKEY,_Fields.SEND_TIME,_Fields.LOAD_INFO};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.APPKEY, new org.apache.thrift.meta_data.FieldMetaData("appkey", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SEND_TIME, new org.apache.thrift.meta_data.FieldMetaData("sendTime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.LOAD_INFO, new org.apache.thrift.meta_data.FieldMetaData("loadInfo", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, LoadInfo.class)));
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(HeartbeatInfo.class, metaDataMap);
  }

  public HeartbeatInfo() {
  }

  public HeartbeatInfo(
    boolean status)
  {
    this();
    this.status = status;
    setStatusIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public HeartbeatInfo(HeartbeatInfo other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetAppkey()) {
      this.appkey = other.appkey;
    }
    this.sendTime = other.sendTime;
    if (other.isSetLoadInfo()) {
      this.loadInfo = new LoadInfo(other.loadInfo);
    }
    this.status = other.status;
  }

  public HeartbeatInfo deepCopy() {
    return new HeartbeatInfo(this);
  }

  @Override
  public void clear() {
    this.appkey = null;
    setSendTimeIsSet(false);
    this.sendTime = 0;
    this.loadInfo = null;
    setStatusIsSet(false);
    this.status = false;
  }

  public String getAppkey() {
    return this.appkey;
  }

  public HeartbeatInfo setAppkey(String appkey) {
    this.appkey = appkey;
    return this;
  }

  public void unsetAppkey() {
    this.appkey = null;
  }

  /** Returns true if field appkey is set (has been assigned a value) and false otherwise */
  public boolean isSetAppkey() {
    return this.appkey != null;
  }

  public void setAppkeyIsSet(boolean value) {
    if (!value) {
      this.appkey = null;
    }
  }

  public long getSendTime() {
    return this.sendTime;
  }

  public HeartbeatInfo setSendTime(long sendTime) {
    this.sendTime = sendTime;
    setSendTimeIsSet(true);
    return this;
  }

  public void unsetSendTime() {
    __isset_bit_vector.clear(__SENDTIME_ISSET_ID);
  }

  /** Returns true if field sendTime is set (has been assigned a value) and false otherwise */
  public boolean isSetSendTime() {
    return __isset_bit_vector.get(__SENDTIME_ISSET_ID);
  }

  public void setSendTimeIsSet(boolean value) {
    __isset_bit_vector.set(__SENDTIME_ISSET_ID, value);
  }

  public LoadInfo getLoadInfo() {
    return this.loadInfo;
  }

  public HeartbeatInfo setLoadInfo(LoadInfo loadInfo) {
    this.loadInfo = loadInfo;
    return this;
  }

  public void unsetLoadInfo() {
    this.loadInfo = null;
  }

  /** Returns true if field loadInfo is set (has been assigned a value) and false otherwise */
  public boolean isSetLoadInfo() {
    return this.loadInfo != null;
  }

  public void setLoadInfoIsSet(boolean value) {
    if (!value) {
      this.loadInfo = null;
    }
  }

  public boolean isStatus() {
    return this.status;
  }

  public HeartbeatInfo setStatus(boolean status) {
    this.status = status;
    setStatusIsSet(true);
    return this;
  }

  public void unsetStatus() {
    __isset_bit_vector.clear(__STATUS_ISSET_ID);
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return __isset_bit_vector.get(__STATUS_ISSET_ID);
  }

  public void setStatusIsSet(boolean value) {
    __isset_bit_vector.set(__STATUS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case APPKEY:
      if (value == null) {
        unsetAppkey();
      } else {
        setAppkey((String)value);
      }
      break;

    case SEND_TIME:
      if (value == null) {
        unsetSendTime();
      } else {
        setSendTime((Long)value);
      }
      break;

    case LOAD_INFO:
      if (value == null) {
        unsetLoadInfo();
      } else {
        setLoadInfo((LoadInfo)value);
      }
      break;

    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case APPKEY:
      return getAppkey();

    case SEND_TIME:
      return Long.valueOf(getSendTime());

    case LOAD_INFO:
      return getLoadInfo();

    case STATUS:
      return Boolean.valueOf(isStatus());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case APPKEY:
      return isSetAppkey();
    case SEND_TIME:
      return isSetSendTime();
    case LOAD_INFO:
      return isSetLoadInfo();
    case STATUS:
      return isSetStatus();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof HeartbeatInfo)
      return this.equals((HeartbeatInfo)that);
    return false;
  }

  public boolean equals(HeartbeatInfo that) {
    if (that == null)
      return false;

    boolean this_present_appkey = true && this.isSetAppkey();
    boolean that_present_appkey = true && that.isSetAppkey();
    if (this_present_appkey || that_present_appkey) {
      if (!(this_present_appkey && that_present_appkey))
        return false;
      if (!this.appkey.equals(that.appkey))
        return false;
    }

    boolean this_present_sendTime = true && this.isSetSendTime();
    boolean that_present_sendTime = true && that.isSetSendTime();
    if (this_present_sendTime || that_present_sendTime) {
      if (!(this_present_sendTime && that_present_sendTime))
        return false;
      if (this.sendTime != that.sendTime)
        return false;
    }

    boolean this_present_loadInfo = true && this.isSetLoadInfo();
    boolean that_present_loadInfo = true && that.isSetLoadInfo();
    if (this_present_loadInfo || that_present_loadInfo) {
      if (!(this_present_loadInfo && that_present_loadInfo))
        return false;
      if (!this.loadInfo.equals(that.loadInfo))
        return false;
    }

    boolean this_present_status = true;
    boolean that_present_status = true;
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (this.status != that.status)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(HeartbeatInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    HeartbeatInfo typedOther = (HeartbeatInfo)other;

    lastComparison = Boolean.valueOf(isSetAppkey()).compareTo(typedOther.isSetAppkey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAppkey()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.appkey, typedOther.appkey);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSendTime()).compareTo(typedOther.isSetSendTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSendTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sendTime, typedOther.sendTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLoadInfo()).compareTo(typedOther.isSetLoadInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLoadInfo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.loadInfo, typedOther.loadInfo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStatus()).compareTo(typedOther.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, typedOther.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("HeartbeatInfo(");
    boolean first = true;

    if (isSetAppkey()) {
      sb.append("appkey:");
      if (this.appkey == null) {
        sb.append("null");
      } else {
        sb.append(this.appkey);
      }
      first = false;
    }
    if (isSetSendTime()) {
      if (!first) sb.append(", ");
      sb.append("sendTime:");
      sb.append(this.sendTime);
      first = false;
    }
    if (isSetLoadInfo()) {
      if (!first) sb.append(", ");
      sb.append("loadInfo:");
      if (this.loadInfo == null) {
        sb.append("null");
      } else {
        sb.append(this.loadInfo);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("status:");
    sb.append(this.status);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'status' because it's a primitive and you chose the non-beans generator.
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class HeartbeatInfoStandardSchemeFactory implements SchemeFactory {
    public HeartbeatInfoStandardScheme getScheme() {
      return new HeartbeatInfoStandardScheme();
    }
  }

  private static class HeartbeatInfoStandardScheme extends StandardScheme<HeartbeatInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, HeartbeatInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // APPKEY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.appkey = iprot.readString();
              struct.setAppkeyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SEND_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.sendTime = iprot.readI64();
              struct.setSendTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // LOAD_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.loadInfo = new LoadInfo();
              struct.loadInfo.read(iprot);
              struct.setLoadInfoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.status = iprot.readBool();
              struct.setStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetStatus()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'status' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, HeartbeatInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.appkey != null) {
        if (struct.isSetAppkey()) {
          oprot.writeFieldBegin(APPKEY_FIELD_DESC);
          oprot.writeString(struct.appkey);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetSendTime()) {
        oprot.writeFieldBegin(SEND_TIME_FIELD_DESC);
        oprot.writeI64(struct.sendTime);
        oprot.writeFieldEnd();
      }
      if (struct.loadInfo != null) {
        if (struct.isSetLoadInfo()) {
          oprot.writeFieldBegin(LOAD_INFO_FIELD_DESC);
          struct.loadInfo.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldBegin(STATUS_FIELD_DESC);
      oprot.writeBool(struct.status);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class HeartbeatInfoTupleSchemeFactory implements SchemeFactory {
    public HeartbeatInfoTupleScheme getScheme() {
      return new HeartbeatInfoTupleScheme();
    }
  }

  private static class HeartbeatInfoTupleScheme extends TupleScheme<HeartbeatInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, HeartbeatInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeBool(struct.status);
      BitSet optionals = new BitSet();
      if (struct.isSetAppkey()) {
        optionals.set(0);
      }
      if (struct.isSetSendTime()) {
        optionals.set(1);
      }
      if (struct.isSetLoadInfo()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetAppkey()) {
        oprot.writeString(struct.appkey);
      }
      if (struct.isSetSendTime()) {
        oprot.writeI64(struct.sendTime);
      }
      if (struct.isSetLoadInfo()) {
        struct.loadInfo.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, HeartbeatInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.status = iprot.readBool();
      struct.setStatusIsSet(true);
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.appkey = iprot.readString();
        struct.setAppkeyIsSet(true);
      }
      if (incoming.get(1)) {
        struct.sendTime = iprot.readI64();
        struct.setSendTimeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.loadInfo = new LoadInfo();
        struct.loadInfo.read(iprot);
        struct.setLoadInfoIsSet(true);
      }
    }
  }

}

