/*
 * XML Type:  artistType
 * Namespace: schema.audioserver.mindbadger.com
 * Java type: com.mindbadger.audioserver.schema.ArtistType
 *
 * Automatically generated - do not modify.
 */
package com.mindbadger.audioserver.schema.impl;
/**
 * An XML artistType(@schema.audioserver.mindbadger.com).
 *
 * This is a complex type.
 */
public class ArtistTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.mindbadger.audioserver.schema.ArtistType
{
    private static final long serialVersionUID = 1L;
    
    public ArtistTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALBUM$0 = 
        new javax.xml.namespace.QName("", "album");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName ID$4 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets a List of "album" elements
     */
    public java.util.List<com.mindbadger.audioserver.schema.AlbumType> getAlbumList()
    {
        final class AlbumList extends java.util.AbstractList<com.mindbadger.audioserver.schema.AlbumType>
        {
            public com.mindbadger.audioserver.schema.AlbumType get(int i)
                { return ArtistTypeImpl.this.getAlbumArray(i); }
            
            public com.mindbadger.audioserver.schema.AlbumType set(int i, com.mindbadger.audioserver.schema.AlbumType o)
            {
                com.mindbadger.audioserver.schema.AlbumType old = ArtistTypeImpl.this.getAlbumArray(i);
                ArtistTypeImpl.this.setAlbumArray(i, o);
                return old;
            }
            
            public void add(int i, com.mindbadger.audioserver.schema.AlbumType o)
                { ArtistTypeImpl.this.insertNewAlbum(i).set(o); }
            
            public com.mindbadger.audioserver.schema.AlbumType remove(int i)
            {
                com.mindbadger.audioserver.schema.AlbumType old = ArtistTypeImpl.this.getAlbumArray(i);
                ArtistTypeImpl.this.removeAlbum(i);
                return old;
            }
            
            public int size()
                { return ArtistTypeImpl.this.sizeOfAlbumArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AlbumList();
        }
    }
    
    /**
     * Gets array of all "album" elements
     * @deprecated
     */
    public com.mindbadger.audioserver.schema.AlbumType[] getAlbumArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.mindbadger.audioserver.schema.AlbumType> targetList = new java.util.ArrayList<com.mindbadger.audioserver.schema.AlbumType>();
            get_store().find_all_element_users(ALBUM$0, targetList);
            com.mindbadger.audioserver.schema.AlbumType[] result = new com.mindbadger.audioserver.schema.AlbumType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "album" element
     */
    public com.mindbadger.audioserver.schema.AlbumType getAlbumArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.mindbadger.audioserver.schema.AlbumType target = null;
            target = (com.mindbadger.audioserver.schema.AlbumType)get_store().find_element_user(ALBUM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "album" element
     */
    public int sizeOfAlbumArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALBUM$0);
        }
    }
    
    /**
     * Sets array of all "album" element
     */
    public void setAlbumArray(com.mindbadger.audioserver.schema.AlbumType[] albumArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(albumArray, ALBUM$0);
        }
    }
    
    /**
     * Sets ith "album" element
     */
    public void setAlbumArray(int i, com.mindbadger.audioserver.schema.AlbumType album)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.mindbadger.audioserver.schema.AlbumType target = null;
            target = (com.mindbadger.audioserver.schema.AlbumType)get_store().find_element_user(ALBUM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(album);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "album" element
     */
    public com.mindbadger.audioserver.schema.AlbumType insertNewAlbum(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.mindbadger.audioserver.schema.AlbumType target = null;
            target = (com.mindbadger.audioserver.schema.AlbumType)get_store().insert_element_user(ALBUM$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "album" element
     */
    public com.mindbadger.audioserver.schema.AlbumType addNewAlbum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.mindbadger.audioserver.schema.AlbumType target = null;
            target = (com.mindbadger.audioserver.schema.AlbumType)get_store().add_element_user(ALBUM$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "album" element
     */
    public void removeAlbum(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALBUM$0, i);
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
}
