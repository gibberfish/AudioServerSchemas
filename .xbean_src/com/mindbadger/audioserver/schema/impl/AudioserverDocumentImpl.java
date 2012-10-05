/*
 * An XML document type.
 * Localname: audioserver
 * Namespace: schema.audioserver.mindbadger.com
 * Java type: com.mindbadger.audioserver.schema.AudioserverDocument
 *
 * Automatically generated - do not modify.
 */
package com.mindbadger.audioserver.schema.impl;
/**
 * A document containing one audioserver(@schema.audioserver.mindbadger.com) element.
 *
 * This is a complex type.
 */
public class AudioserverDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.mindbadger.audioserver.schema.AudioserverDocument
{
    private static final long serialVersionUID = 1L;
    
    public AudioserverDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUDIOSERVER$0 = 
        new javax.xml.namespace.QName("schema.audioserver.mindbadger.com", "audioserver");
    
    
    /**
     * Gets the "audioserver" element
     */
    public com.mindbadger.audioserver.schema.AudioserverType getAudioserver()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.mindbadger.audioserver.schema.AudioserverType target = null;
            target = (com.mindbadger.audioserver.schema.AudioserverType)get_store().find_element_user(AUDIOSERVER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "audioserver" element
     */
    public void setAudioserver(com.mindbadger.audioserver.schema.AudioserverType audioserver)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.mindbadger.audioserver.schema.AudioserverType target = null;
            target = (com.mindbadger.audioserver.schema.AudioserverType)get_store().find_element_user(AUDIOSERVER$0, 0);
            if (target == null)
            {
                target = (com.mindbadger.audioserver.schema.AudioserverType)get_store().add_element_user(AUDIOSERVER$0);
            }
            target.set(audioserver);
        }
    }
    
    /**
     * Appends and returns a new empty "audioserver" element
     */
    public com.mindbadger.audioserver.schema.AudioserverType addNewAudioserver()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.mindbadger.audioserver.schema.AudioserverType target = null;
            target = (com.mindbadger.audioserver.schema.AudioserverType)get_store().add_element_user(AUDIOSERVER$0);
            return target;
        }
    }
}
