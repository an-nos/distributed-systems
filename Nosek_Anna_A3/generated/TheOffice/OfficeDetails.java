//
// Copyright (c) ZeroC, Inc. All rights reserved.
//
//
// Ice version 3.7.5
//
// <auto-generated>
//
// Generated from file `office.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package TheOffice;

public class OfficeDetails implements java.lang.Cloneable,
                                      java.io.Serializable
{
    public long requestID;

    public DateTime expectedResponseDateTime;

    public OfficeDetails()
    {
        this.expectedResponseDateTime = new DateTime();
    }

    public OfficeDetails(long requestID, DateTime expectedResponseDateTime)
    {
        this.requestID = requestID;
        this.expectedResponseDateTime = expectedResponseDateTime;
    }

    public boolean equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        OfficeDetails r = null;
        if(rhs instanceof OfficeDetails)
        {
            r = (OfficeDetails)rhs;
        }

        if(r != null)
        {
            if(this.requestID != r.requestID)
            {
                return false;
            }
            if(this.expectedResponseDateTime != r.expectedResponseDateTime)
            {
                if(this.expectedResponseDateTime == null || r.expectedResponseDateTime == null || !this.expectedResponseDateTime.equals(r.expectedResponseDateTime))
                {
                    return false;
                }
            }

            return true;
        }

        return false;
    }

    public int hashCode()
    {
        int h_ = 5381;
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, "::TheOffice::OfficeDetails");
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, requestID);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, expectedResponseDateTime);
        return h_;
    }

    public OfficeDetails clone()
    {
        OfficeDetails c = null;
        try
        {
            c = (OfficeDetails)super.clone();
        }
        catch(CloneNotSupportedException ex)
        {
            assert false; // impossible
        }
        return c;
    }

    public void ice_writeMembers(com.zeroc.Ice.OutputStream ostr)
    {
        ostr.writeLong(this.requestID);
        DateTime.ice_write(ostr, this.expectedResponseDateTime);
    }

    public void ice_readMembers(com.zeroc.Ice.InputStream istr)
    {
        this.requestID = istr.readLong();
        this.expectedResponseDateTime = DateTime.ice_read(istr);
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, OfficeDetails v)
    {
        if(v == null)
        {
            _nullMarshalValue.ice_writeMembers(ostr);
        }
        else
        {
            v.ice_writeMembers(ostr);
        }
    }

    static public OfficeDetails ice_read(com.zeroc.Ice.InputStream istr)
    {
        OfficeDetails v = new OfficeDetails();
        v.ice_readMembers(istr);
        return v;
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, java.util.Optional<OfficeDetails> v)
    {
        if(v != null && v.isPresent())
        {
            ice_write(ostr, tag, v.get());
        }
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, OfficeDetails v)
    {
        if(ostr.writeOptional(tag, com.zeroc.Ice.OptionalFormat.VSize))
        {
            ostr.writeSize(32);
            ice_write(ostr, v);
        }
    }

    static public java.util.Optional<OfficeDetails> ice_read(com.zeroc.Ice.InputStream istr, int tag)
    {
        if(istr.readOptional(tag, com.zeroc.Ice.OptionalFormat.VSize))
        {
            istr.skipSize();
            return java.util.Optional.of(OfficeDetails.ice_read(istr));
        }
        else
        {
            return java.util.Optional.empty();
        }
    }

    private static final OfficeDetails _nullMarshalValue = new OfficeDetails();

    /** @hidden */
    public static final long serialVersionUID = 8267567769335604752L;
}