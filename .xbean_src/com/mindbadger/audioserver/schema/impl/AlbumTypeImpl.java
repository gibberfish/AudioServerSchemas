/*
 * XML Type:  albumType
 * Namespace: schema.audioserver.mindbadger.com
 * Java type: com.mindbadger.audioserver.schema.AlbumType
 *
 * Automatically generated - do not modify.
 */
package com.mindbadger.audioserver.schema.impl;
/**
 * An XML albumType(@schema.audioserver.mindbadger.com).
 *
 * This is a complex type.
 */
public class AlbumTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.mindbadger.audioserver.schema.AlbumType
{
    private static final long serialVersionUID = 1L;
    
    public AlbumTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRACK$0 = 
        new javax.xml.namespace.QName("", "track");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName ID$4 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName ALBUMARTLOCATION$6 = 
        new javax.xml.namespace.QName("", "albumArtLocation");
    
    
    /**
     * Gets a List of "track" elements
     */
    public java.util.List<com.mindbadger.audioserver.schema.TrackType> getTrackList()
    {
        final class TrackList extends java.util.AbstractList<com.mindbadger.audioserver.schema.TrackType>
        {
            public com.mindbadger.audioserver.schema.TrackType get(int i)
                { return AlbumTypeImpl.this.getTrackArray(i); }
            
            public com.mindbadger.audioserver.schema.TrackType set(int i, com.mindbadger.audioserver.schema.TrackType o)
            {
                com.mindbadger.audioserver.schema.TrackType old = AlbumTypeImpl.this.getTrackArray(i);
                AlbumTypeImpl.this.setTrackArray(i, o);
                return old;
            }
            
            public void add(int i, com.mindbadger.audioserver.schema.TrackType o)
                { AlbumTypeImpl.this.insertNewTrack(i).set(o); }
            
            public com.mindbadger.audioserver.schema.TrackType remove(int i)
            {
                com.mindbadger.audioserver.schema.TrackType old = AlbumTypeImpl.this.getTrackArray(i);
                AlbumTypeImpl.this.removeTrack(i);
                return old;
            }
            
            public int size()
                { return AlbumTypeImpl.this.sizeOfTrackArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TrackList();
        }
    }
    
    /**
     * Gets array of all "track" elements
     * @deprecated
     */
    public com.mindbadger.audioserver.schema.TrackType[] getTrackArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.mindbadger.audioserver.schema.TrackType> targetList = new java.util.ArrayList<com.mindbadger.audioserver.schema.TrackType>();
            get_store().find_all_element_users(TRACK$0, targetList);
            com.mindbadger.audioserver.schema.TrackType[] result = new com.mindbadger.audioserver.schema.TrackType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "track" element
     */
    public com.mindbadger.audioserver.schema.TrackType getTrackArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.mindbadger.audioserver.schema.TrackType target = null;
            target = (com.mindbadger.audioserver.schema.TrackType)get_store().find_element_user(TRACK$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "track" element
     */
    public int sizeOfTrackArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRACK$0);
        }
    }
    
    /**
     * Sets array of all "track" element
     */
    public void setTrackArray(com.mindbadger.audioserver.schema.TrackType[] trackArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(trackArray, TRACK$0);
        }
    }
    
    /**
     * Sets ith "track" element
     */
    public void setTrackArray(int i, com.mindbadger.audioserver.schema.TrackType track)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.mindbadger.audioserver.schema.TrackType target = null;
            target = (com.mindbadger.audioserver.schema.TrackType)get_store().find_element_user(TRACK$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(track);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "track" element
     */
    public com.mindbadger.audioserver.schema.TrackType insertNewTrack(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.mindbadger.audioserver.schema.TrackType target = null;
            target = (com.mindbadger.audioserver.schema.TrackType)get_store().insert_element_user(TRACK$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "track" element
     */
    public com.mindbadger.audioserver.schema.TrackType addNewTrack()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.mindbadger.audioserver.schema.TrackType target = null;
            target = (com.mindbadger.audioserver.schema.TrackType)get_store().add_element_user(TRACK$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "track" element
     */
    public void removeTrack(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRACK$0, i);
        }
    }
    
    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" attribute
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
            return target;
        }
    }
    
    /**
     * True if has "name" attribute
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NAME$2) != null;
        }
    }
    
    /**
     * Sets the "name" attribute
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$2);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$2);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "name" attribute
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NAME$2);
        }
    }
    
    /**
     * Gets the "id" attribute
     */
    public long getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(ID$4);
            return target;
        }
    }
    
    /**
     * True if has "id" attribute
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$4) != null;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(long id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$4);
            }
            target.setLongValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.apache.xmlbeans.XmlUnsignedInt id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(ID$4);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "id" attribute
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$4);
        }
    }
    
    /**
     * Gets the "albumArtLocation" attribute
     */
    public java.lang.String getAlbumArtLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALBUMARTLOCATION$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "albumArtLocation" attribute
     */
    public org.apache.xmlbeans.XmlString xgetAlbumArtLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ALBUMARTLOCATION$6);
            return target;
        }
    }
    
    /**
     * True if has "albumArtLocation" attribute
     */
    public boolean isSetAlbumArtLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ALBUMARTLOCATION$6) != null;
        }
    }
    
    /**
     * Sets the "albumArtLocation" attribute
     */
    public void setAlbumArtLocation(java.lang.String albumArtLocation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALBUMARTLOCATION$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALBUMARTLOCATION$6);
            }
            target.setStringValue(albumArtLocation);
        }
    }
    
    /**
     * Sets (as xml) the "albumArtLocation" attribute
     */
    public void xsetAlbumArtLocation(org.apache.xmlbeans.XmlString albumArtLocation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ALBUMARTLOCATION$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ALBUMARTLOCATION$6);
            }
            target.set(albumArtLocation);
        }
    }
    
    /**
     * Unsets the "albumArtLocation" attribute
     */
    public void unsetAlbumArtLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ALBUMARTLOCATION$6);
        }
    }
}
