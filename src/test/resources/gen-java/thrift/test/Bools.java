/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package thrift.test;

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

import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

public class Bools implements TBase<Bools, Bools._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("Bools");

  private static final TField IM_TRUE_FIELD_DESC = new TField("im_true", TType.BOOL, (short)1);
  private static final TField IM_FALSE_FIELD_DESC = new TField("im_false", TType.BOOL, (short)2);

  public boolean im_true;
  public boolean im_false;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    IM_TRUE((short)1, "im_true"),
    IM_FALSE((short)2, "im_false");

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
        case 1: // IM_TRUE
          return IM_TRUE;
        case 2: // IM_FALSE
          return IM_FALSE;
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
  private static final int __IM_TRUE_ISSET_ID = 0;
  private static final int __IM_FALSE_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.IM_TRUE, new FieldMetaData("im_true", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.BOOL)));
    tmpMap.put(_Fields.IM_FALSE, new FieldMetaData("im_false", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(Bools.class, metaDataMap);
  }

  public Bools() {
  }

  public Bools(
    boolean im_true,
    boolean im_false)
  {
    this();
    this.im_true = im_true;
    setIm_trueIsSet(true);
    this.im_false = im_false;
    setIm_falseIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Bools(Bools other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.im_true = other.im_true;
    this.im_false = other.im_false;
  }

  public Bools deepCopy() {
    return new Bools(this);
  }

  @Override
  public void clear() {
    setIm_trueIsSet(false);
    this.im_true = false;
    setIm_falseIsSet(false);
    this.im_false = false;
  }

  public boolean isIm_true() {
    return this.im_true;
  }

  public Bools setIm_true(boolean im_true) {
    this.im_true = im_true;
    setIm_trueIsSet(true);
    return this;
  }

  public void unsetIm_true() {
    __isset_bit_vector.clear(__IM_TRUE_ISSET_ID);
  }

  /** Returns true if field im_true is set (has been asigned a value) and false otherwise */
  public boolean isSetIm_true() {
    return __isset_bit_vector.get(__IM_TRUE_ISSET_ID);
  }

  public void setIm_trueIsSet(boolean value) {
    __isset_bit_vector.set(__IM_TRUE_ISSET_ID, value);
  }

  public boolean isIm_false() {
    return this.im_false;
  }

  public Bools setIm_false(boolean im_false) {
    this.im_false = im_false;
    setIm_falseIsSet(true);
    return this;
  }

  public void unsetIm_false() {
    __isset_bit_vector.clear(__IM_FALSE_ISSET_ID);
  }

  /** Returns true if field im_false is set (has been asigned a value) and false otherwise */
  public boolean isSetIm_false() {
    return __isset_bit_vector.get(__IM_FALSE_ISSET_ID);
  }

  public void setIm_falseIsSet(boolean value) {
    __isset_bit_vector.set(__IM_FALSE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case IM_TRUE:
      if (value == null) {
        unsetIm_true();
      } else {
        setIm_true((Boolean)value);
      }
      break;

    case IM_FALSE:
      if (value == null) {
        unsetIm_false();
      } else {
        setIm_false((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case IM_TRUE:
      return new Boolean(isIm_true());

    case IM_FALSE:
      return new Boolean(isIm_false());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case IM_TRUE:
      return isSetIm_true();
    case IM_FALSE:
      return isSetIm_false();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Bools)
      return this.equals((Bools)that);
    return false;
  }

  public boolean equals(Bools that) {
    if (that == null)
      return false;

    boolean this_present_im_true = true;
    boolean that_present_im_true = true;
    if (this_present_im_true || that_present_im_true) {
      if (!(this_present_im_true && that_present_im_true))
        return false;
      if (this.im_true != that.im_true)
        return false;
    }

    boolean this_present_im_false = true;
    boolean that_present_im_false = true;
    if (this_present_im_false || that_present_im_false) {
      if (!(this_present_im_false && that_present_im_false))
        return false;
      if (this.im_false != that.im_false)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(Bools other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Bools typedOther = (Bools)other;

    lastComparison = Boolean.valueOf(isSetIm_true()).compareTo(typedOther.isSetIm_true());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIm_true()) {
      lastComparison = TBaseHelper.compareTo(this.im_true, typedOther.im_true);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIm_false()).compareTo(typedOther.isSetIm_false());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIm_false()) {
      lastComparison = TBaseHelper.compareTo(this.im_false, typedOther.im_false);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // IM_TRUE
          if (field.type == TType.BOOL) {
            this.im_true = iprot.readBool();
            setIm_trueIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // IM_FALSE
          if (field.type == TType.BOOL) {
            this.im_false = iprot.readBool();
            setIm_falseIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(IM_TRUE_FIELD_DESC);
    oprot.writeBool(this.im_true);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(IM_FALSE_FIELD_DESC);
    oprot.writeBool(this.im_false);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Bools(");
    boolean first = true;

    sb.append("im_true:");
    sb.append(this.im_true);
    first = false;
    if (!first) sb.append(", ");
    sb.append("im_false:");
    sb.append(this.im_false);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

