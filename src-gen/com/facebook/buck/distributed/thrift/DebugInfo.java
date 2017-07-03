/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.buck.distributed.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
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
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-06-29")
public class DebugInfo implements org.apache.thrift.TBase<DebugInfo, DebugInfo._Fields>, java.io.Serializable, Cloneable, Comparable<DebugInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DebugInfo");

  private static final org.apache.thrift.protocol.TField LOG_BOOK_FIELD_DESC = new org.apache.thrift.protocol.TField("logBook", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DebugInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DebugInfoTupleSchemeFactory());
  }

  public List<LogRecord> logBook; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    LOG_BOOK((short)1, "logBook");

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
        case 1: // LOG_BOOK
          return LOG_BOOK;
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
  private static final _Fields optionals[] = {_Fields.LOG_BOOK};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.LOG_BOOK, new org.apache.thrift.meta_data.FieldMetaData("logBook", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, LogRecord.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DebugInfo.class, metaDataMap);
  }

  public DebugInfo() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DebugInfo(DebugInfo other) {
    if (other.isSetLogBook()) {
      List<LogRecord> __this__logBook = new ArrayList<LogRecord>(other.logBook.size());
      for (LogRecord other_element : other.logBook) {
        __this__logBook.add(new LogRecord(other_element));
      }
      this.logBook = __this__logBook;
    }
  }

  public DebugInfo deepCopy() {
    return new DebugInfo(this);
  }

  @Override
  public void clear() {
    this.logBook = null;
  }

  public int getLogBookSize() {
    return (this.logBook == null) ? 0 : this.logBook.size();
  }

  public java.util.Iterator<LogRecord> getLogBookIterator() {
    return (this.logBook == null) ? null : this.logBook.iterator();
  }

  public void addToLogBook(LogRecord elem) {
    if (this.logBook == null) {
      this.logBook = new ArrayList<LogRecord>();
    }
    this.logBook.add(elem);
  }

  public List<LogRecord> getLogBook() {
    return this.logBook;
  }

  public DebugInfo setLogBook(List<LogRecord> logBook) {
    this.logBook = logBook;
    return this;
  }

  public void unsetLogBook() {
    this.logBook = null;
  }

  /** Returns true if field logBook is set (has been assigned a value) and false otherwise */
  public boolean isSetLogBook() {
    return this.logBook != null;
  }

  public void setLogBookIsSet(boolean value) {
    if (!value) {
      this.logBook = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case LOG_BOOK:
      if (value == null) {
        unsetLogBook();
      } else {
        setLogBook((List<LogRecord>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case LOG_BOOK:
      return getLogBook();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case LOG_BOOK:
      return isSetLogBook();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DebugInfo)
      return this.equals((DebugInfo)that);
    return false;
  }

  public boolean equals(DebugInfo that) {
    if (that == null)
      return false;

    boolean this_present_logBook = true && this.isSetLogBook();
    boolean that_present_logBook = true && that.isSetLogBook();
    if (this_present_logBook || that_present_logBook) {
      if (!(this_present_logBook && that_present_logBook))
        return false;
      if (!this.logBook.equals(that.logBook))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_logBook = true && (isSetLogBook());
    list.add(present_logBook);
    if (present_logBook)
      list.add(logBook);

    return list.hashCode();
  }

  @Override
  public int compareTo(DebugInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetLogBook()).compareTo(other.isSetLogBook());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLogBook()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.logBook, other.logBook);
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
    StringBuilder sb = new StringBuilder("DebugInfo(");
    boolean first = true;

    if (isSetLogBook()) {
      sb.append("logBook:");
      if (this.logBook == null) {
        sb.append("null");
      } else {
        sb.append(this.logBook);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class DebugInfoStandardSchemeFactory implements SchemeFactory {
    public DebugInfoStandardScheme getScheme() {
      return new DebugInfoStandardScheme();
    }
  }

  private static class DebugInfoStandardScheme extends StandardScheme<DebugInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DebugInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // LOG_BOOK
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.logBook = new ArrayList<LogRecord>(_list0.size);
                LogRecord _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new LogRecord();
                  _elem1.read(iprot);
                  struct.logBook.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setLogBookIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, DebugInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.logBook != null) {
        if (struct.isSetLogBook()) {
          oprot.writeFieldBegin(LOG_BOOK_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.logBook.size()));
            for (LogRecord _iter3 : struct.logBook)
            {
              _iter3.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DebugInfoTupleSchemeFactory implements SchemeFactory {
    public DebugInfoTupleScheme getScheme() {
      return new DebugInfoTupleScheme();
    }
  }

  private static class DebugInfoTupleScheme extends TupleScheme<DebugInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DebugInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetLogBook()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetLogBook()) {
        {
          oprot.writeI32(struct.logBook.size());
          for (LogRecord _iter4 : struct.logBook)
          {
            _iter4.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DebugInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.logBook = new ArrayList<LogRecord>(_list5.size);
          LogRecord _elem6;
          for (int _i7 = 0; _i7 < _list5.size; ++_i7)
          {
            _elem6 = new LogRecord();
            _elem6.read(iprot);
            struct.logBook.add(_elem6);
          }
        }
        struct.setLogBookIsSet(true);
      }
    }
  }

}

