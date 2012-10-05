/*
 * XML Type:  albumType
 * Namespace: schema.audioserver.mindbadger.com
 * Java type: com.mindbadger.audioserver.schema.AlbumType
 *
 * Automatically generated - do not modify.
 */
package com.mindbadger.audioserver.schema;


/**
 * An XML albumType(@schema.audioserver.mindbadger.com).
 *
 * This is a complex type.
 */
public interface AlbumType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AlbumType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C09A41979E5E4F2B4F3049610A3E9B4").resolveHandle("albumtype0036type");
    
    /**
     * Gets a List of "track" elements
     */
    java.util.List<com.mindbadger.audioserver.schema.TrackType> getTrackList();
    
    /**
     * Gets array of all "track" elements
     * @deprecated
     */
    com.mindbadger.audioserver.schema.TrackType[] getTrackArray();
    
    /**
     * Gets ith "track" element
     */
    com.mindbadger.audioserver.schema.TrackType getTrackArray(int i);
    
    /**
     * Returns number of "track" element
     */
    int sizeOfTrackArray();
    
    /**
     * Sets array of all "track" element
     */
    void setTrackArray(com.mindbadger.audioserver.schema.TrackType[] trackArray);
    
    /**
     * Sets ith "track" element
     */
    void setTrackArray(int i, com.mindbadger.audioserver.schema.TrackType track);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "track" element
     */
    com.mindbadger.audioserver.schema.TrackType insertNewTrack(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "track" element
     */
    com.mindbadger.audioserver.schema.TrackType addNewTrack();
    
    /**
     * Removes the ith "track" element
     */
    void removeTrack(int i);
    
    /**
     * Gets the "name" attribute
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" attribute
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * True if has "name" attribute
     */
    boolean isSetName();
    
    /**
     * Sets the "name" attribute
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" attribute
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Unsets the "name" attribute
     */
    void unsetName();
    
    /**
     * Gets the "id" attribute
     */
    long getId();
    
    /**
     * Gets (as xml) the "id" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetId();
    
    /**
     * True if has "id" attribute
     */
    boolean isSetId();
    
    /**
     * Sets the "id" attribute
     */
    void setId(long id);
    
    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.apache.xmlbeans.XmlUnsignedInt id);
    
    /**
     * Unsets the "id" attribute
     */
    void unsetId();
    
    /**
     * Gets the "albumArtLocation" attribute
     */
    java.lang.String getAlbumArtLocation();
    
    /**
     * Gets (as xml) the "albumArtLocation" attribute
     */
    org.apache.xmlbeans.XmlString xgetAlbumArtLocation();
    
    /**
     * True if has "albumArtLocation" attribute
     */
    boolean isSetAlbumArtLocation();
    
    /**
     * Sets the "albumArtLocation" attribute
     */
    void setAlbumArtLocation(java.lang.String albumArtLocation);
    
    /**
     * Sets (as xml) the "albumArtLocation" attribute
     */
    void xsetAlbumArtLocation(org.apache.xmlbeans.XmlString albumArtLocation);
    
    /**
     * Unsets the "albumArtLocation" attribute
     */
    void unsetAlbumArtLocation();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.mindbadger.audioserver.schema.AlbumType newInstance() {
          return (com.mindbadger.audioserver.schema.AlbumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.mindbadger.audioserver.schema.AlbumType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.mindbadger.audioserver.schema.AlbumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.mindbadger.audioserver.schema.AlbumType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.mindbadger.audioserver.schema.AlbumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.mindbadger.audioserver.schema.AlbumType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.mindbadger.audioserver.schema.AlbumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.mindbadger.audioserver.schema.AlbumType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.mindbadger.audioserver.schema.AlbumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.mindbadger.audioserver.schema.AlbumType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.mindbadger.audioserver.schema.AlbumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.mindbadger.audioserver.schema.AlbumType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.mindbadger.audioserver.schema.AlbumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.mindbadger.audioserver.schema.AlbumType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.mindbadger.audioserver.schema.AlbumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.mindbadger.audioserver.schema.AlbumType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.mindbadger.audioserver.schema.AlbumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.mindbadger.audioserver.schema.AlbumType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.mindbadger.audioserver.schema.AlbumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.mindbadger.audioserver.schema.AlbumType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.mindbadger.audioserver.schema.AlbumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.mindbadger.audioserver.schema.AlbumType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.mindbadger.audioserver.schema.AlbumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.mindbadger.audioserver.schema.AlbumType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.mindbadger.audioserver.schema.AlbumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.mindbadger.audioserver.schema.AlbumType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.mindbadger.audioserver.schema.AlbumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.mindbadger.audioserver.schema.AlbumType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.mindbadger.audioserver.schema.AlbumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.mindbadger.audioserver.schema.AlbumType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.mindbadger.audioserver.schema.AlbumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.mindbadger.audioserver.schema.AlbumType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.mindbadger.audioserver.schema.AlbumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.mindbadger.audioserver.schema.AlbumType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.mindbadger.audioserver.schema.AlbumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
