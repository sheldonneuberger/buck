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
public class MultiGetBuildSlaveEventsResponse implements org.apache.thrift.TBase<MultiGetBuildSlaveEventsResponse, MultiGetBuildSlaveEventsResponse._Fields>, java.io.Serializable, Cloneable, Comparable<MultiGetBuildSlaveEventsResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("MultiGetBuildSlaveEventsResponse");

  private static final org.apache.thrift.protocol.TField RESPONSES_FIELD_DESC = new org.apache.thrift.protocol.TField("responses", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new MultiGetBuildSlaveEventsResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new MultiGetBuildSlaveEventsResponseTupleSchemeFactory());
  }

  public List<BuildSlaveEventsRange> responses; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    RESPONSES((short)1, "responses");

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
        case 1: // RESPONSES
          return RESPONSES;
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
  private static final _Fields optionals[] = {_Fields.RESPONSES};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RESPONSES, new org.apache.thrift.meta_data.FieldMetaData("responses", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, BuildSlaveEventsRange.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(MultiGetBuildSlaveEventsResponse.class, metaDataMap);
  }

  public MultiGetBuildSlaveEventsResponse() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MultiGetBuildSlaveEventsResponse(MultiGetBuildSlaveEventsResponse other) {
    if (other.isSetResponses()) {
      List<BuildSlaveEventsRange> __this__responses = new ArrayList<BuildSlaveEventsRange>(other.responses.size());
      for (BuildSlaveEventsRange other_element : other.responses) {
        __this__responses.add(new BuildSlaveEventsRange(other_element));
      }
      this.responses = __this__responses;
    }
  }

  public MultiGetBuildSlaveEventsResponse deepCopy() {
    return new MultiGetBuildSlaveEventsResponse(this);
  }

  @Override
  public void clear() {
    this.responses = null;
  }

  public int getResponsesSize() {
    return (this.responses == null) ? 0 : this.responses.size();
  }

  public java.util.Iterator<BuildSlaveEventsRange> getResponsesIterator() {
    return (this.responses == null) ? null : this.responses.iterator();
  }

  public void addToResponses(BuildSlaveEventsRange elem) {
    if (this.responses == null) {
      this.responses = new ArrayList<BuildSlaveEventsRange>();
    }
    this.responses.add(elem);
  }

  public List<BuildSlaveEventsRange> getResponses() {
    return this.responses;
  }

  public MultiGetBuildSlaveEventsResponse setResponses(List<BuildSlaveEventsRange> responses) {
    this.responses = responses;
    return this;
  }

  public void unsetResponses() {
    this.responses = null;
  }

  /** Returns true if field responses is set (has been assigned a value) and false otherwise */
  public boolean isSetResponses() {
    return this.responses != null;
  }

  public void setResponsesIsSet(boolean value) {
    if (!value) {
      this.responses = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case RESPONSES:
      if (value == null) {
        unsetResponses();
      } else {
        setResponses((List<BuildSlaveEventsRange>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RESPONSES:
      return getResponses();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case RESPONSES:
      return isSetResponses();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof MultiGetBuildSlaveEventsResponse)
      return this.equals((MultiGetBuildSlaveEventsResponse)that);
    return false;
  }

  public boolean equals(MultiGetBuildSlaveEventsResponse that) {
    if (that == null)
      return false;

    boolean this_present_responses = true && this.isSetResponses();
    boolean that_present_responses = true && that.isSetResponses();
    if (this_present_responses || that_present_responses) {
      if (!(this_present_responses && that_present_responses))
        return false;
      if (!this.responses.equals(that.responses))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_responses = true && (isSetResponses());
    list.add(present_responses);
    if (present_responses)
      list.add(responses);

    return list.hashCode();
  }

  @Override
  public int compareTo(MultiGetBuildSlaveEventsResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetResponses()).compareTo(other.isSetResponses());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResponses()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.responses, other.responses);
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
    StringBuilder sb = new StringBuilder("MultiGetBuildSlaveEventsResponse(");
    boolean first = true;

    if (isSetResponses()) {
      sb.append("responses:");
      if (this.responses == null) {
        sb.append("null");
      } else {
        sb.append(this.responses);
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

  private static class MultiGetBuildSlaveEventsResponseStandardSchemeFactory implements SchemeFactory {
    public MultiGetBuildSlaveEventsResponseStandardScheme getScheme() {
      return new MultiGetBuildSlaveEventsResponseStandardScheme();
    }
  }

  private static class MultiGetBuildSlaveEventsResponseStandardScheme extends StandardScheme<MultiGetBuildSlaveEventsResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, MultiGetBuildSlaveEventsResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RESPONSES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list162 = iprot.readListBegin();
                struct.responses = new ArrayList<BuildSlaveEventsRange>(_list162.size);
                BuildSlaveEventsRange _elem163;
                for (int _i164 = 0; _i164 < _list162.size; ++_i164)
                {
                  _elem163 = new BuildSlaveEventsRange();
                  _elem163.read(iprot);
                  struct.responses.add(_elem163);
                }
                iprot.readListEnd();
              }
              struct.setResponsesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, MultiGetBuildSlaveEventsResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.responses != null) {
        if (struct.isSetResponses()) {
          oprot.writeFieldBegin(RESPONSES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.responses.size()));
            for (BuildSlaveEventsRange _iter165 : struct.responses)
            {
              _iter165.write(oprot);
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

  private static class MultiGetBuildSlaveEventsResponseTupleSchemeFactory implements SchemeFactory {
    public MultiGetBuildSlaveEventsResponseTupleScheme getScheme() {
      return new MultiGetBuildSlaveEventsResponseTupleScheme();
    }
  }

  private static class MultiGetBuildSlaveEventsResponseTupleScheme extends TupleScheme<MultiGetBuildSlaveEventsResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, MultiGetBuildSlaveEventsResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetResponses()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetResponses()) {
        {
          oprot.writeI32(struct.responses.size());
          for (BuildSlaveEventsRange _iter166 : struct.responses)
          {
            _iter166.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, MultiGetBuildSlaveEventsResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list167 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.responses = new ArrayList<BuildSlaveEventsRange>(_list167.size);
          BuildSlaveEventsRange _elem168;
          for (int _i169 = 0; _i169 < _list167.size; ++_i169)
          {
            _elem168 = new BuildSlaveEventsRange();
            _elem168.read(iprot);
            struct.responses.add(_elem168);
          }
        }
        struct.setResponsesIsSet(true);
      }
    }
  }

}

