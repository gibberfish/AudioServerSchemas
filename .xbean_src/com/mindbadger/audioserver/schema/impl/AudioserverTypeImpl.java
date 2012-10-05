/*
 * XML Type:  audioserverType
 * Namespace: schema.audioserver.mindbadger.com
 * Java type: com.mindbadger.audioserver.schema.AudioserverType
 *
 * Automatically generated - do not modify.
 */
package com.mindbadger.audioserver.schema.impl;
/**
 * An XML audioserverType(@schema.audioserver.mindbadger.com).
 *
 * This is a complex type.
 */
public class AudioserverTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.mindbadger.audioserver.schema.AudioserverType
{
    private static final long serialVersionUID = 1L;
    
    public AudioserverTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARTIST$0 = 
        new javax.xml.namespace.QName("", "artist");
    private static final javax.xml.namespace.QName LASTUPDATED$2 = 
        new javax.xml.namespace.QName("", "lastUpdated");
    
    
    /**
     * Gets a List of "artist" elements
     */
    public java.util.List<com.mindbadger.audioserver.schema.ArtistType> getArtistList()
    {
        final class ArtistList extends java.util.AbstractList<com.mindbadger.audioserver.schema.ArtistType>
        {
            public com.mindbadger.audioserver.schema.ArtistType get(int i)
                { return AudioserverTypeImpl.this.getArtistArray(i); }
            
            public com.mindbadger.audioserver.schema.ArtistType set(int i, com.mindbadger.audioserver.schema.ArtistType o)
            {
                com.mindbadger.audioserver.schema.ArtistType old = AudioserverTypeImpl.this.getArtistArray(i);
                AudioserverTypeImpl.this.setArtistArray(i, o);
                return old;
            }
            
            public void add(int i, com.mindbadger.audioserver.schema.ArtistType o)
                { AudioserverTypeImpl.this.insertNewArtist(i).set(o); }
            
            public com.mindbadger.audioserver.schema.ArtistType remove(int i)
            {
                com.mindbadger.audioserver.schema.ArtistType old = AudioserverTypeImpl.this.getArtistArray(i);
                AudioserverTypeImpl.this.removeArtist(i);
                return old;
            }
            
            public int size()
                { return AudioserverTypeImpl.this.sizeOfArtistArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ArtistList();
        }
    }
    
    /**
     * Gets array of all "artist" elements
     * @deprecated
     */
    public com.mindbadger.audioserver.schema.ArtistType[] getArtistArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.mindbadger.audioserver.schema.ArtistType> targetList = new java.util.ArrayList<com.mindbadger.audioserver.schema.ArtistType>();
            get_store().find_all_element_users(ARTIST$0, targetList);
            com.mindbadger.audioserver.schema.ArtistType[] result = new com.mindbadger.audioserver.schema.ArtistType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "artist" element
     */
    public com.mindbadger.audioserver.schema.ArtistType getArtistArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.mindbadger.audioserver.schema.ArtistType target = null;
            target = (com.mindbadger.audioserver.schema.ArtistType)get_store().find_element_user(ARTIST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "artist" element
     */
    public int sizeOfArtistArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARTIST$0);
        }
    }
    
    /**
     * Sets array of all "artist" element
     */
    public void setArtistArray(com.mindbadger.audioserver.schema.ArtistType[] artistArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(artistArray, ARTIST$0);
        }
    }
    
    /**
     * Sets ith "artist" element
     */
    public void setArtistArray(int i, com.mindbadger.audioserver.schema.ArtistType artist)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.mindbadger.audioserver.schema.ArtistType target = null;
            target = (com.mindbadger.audioserver.schema.ArtistType)get_store().find_element_user(ARTIST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(artist);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "artist" element
     */
    public com.mindbadger.audioserver.schema.ArtistType insertNewArtist(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.mindbadger.audioserver.schema.ArtistType target = null;
            target = (com.mindbadger.audioserver.schema.ArtistType)get_store().insert_element_user(ARTIST$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "artist" element
     */
    public com.mindbadger.audioserver.schema.ArtistType addNewArtist()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.mindbadger.audioserver.schema.ArtistType target = null;
            target = (com.mindbadger.audioserver.schema.ArtistType)get_store().add_element_user(ARTIST$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "artist" element
     */
    public void removeArtist(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARTIST$0, i);
        }
    }
    
    /**
     * Gets the "lastUpdated" attribute
     */
    public java.util.Calendar getLastUpdated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LASTUPDATED$2);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "lastUpdated" attribute
     */
    public org.apache.xmlbeans.XmlDateTime xgetLastUpdated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(LASTUPDATED$2);
            return target;
        }
    }
    
    /**
     * True if has "lastUpdated" attribute
     */
    public boolean isSetLastUpdated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LASTUPDATED$2) != null;
        }
    }
    
    /**
     * Sets the "lastUpdated" attribute
     */
    public void setLastUpdated(java.util.Calendar lastUpdated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LASTUPDATED$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LASTUPDATED$2);
            }
            target.setCalendarValue(lastUpdated);
        }
    }
    
    /**
     * Sets (as xml) the "lastUpdated" attribute
     */
    public void xsetLastUpdated(org.apache.xmlbeans.XmlDateTime lastUpdated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(LASTUPDATED$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(LASTUPDATED$2);
            }
            target.set(lastUpdated);
        }
    }
    
    /**
     * Unsets the "lastUpdated" attribute
     */
    public void unsetLastUpdated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LASTUPDATED$2);
        }
    }
}
