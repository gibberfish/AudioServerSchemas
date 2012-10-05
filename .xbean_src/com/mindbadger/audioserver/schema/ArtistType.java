/*
 * XML Type:  artistType
 * Namespace: schema.audioserver.mindbadger.com
 * Java type: com.mindbadger.audioserver.schema.ArtistType
 *
 * Automatically generated - do not modify.
 */
package com.mindbadger.audioserver.schema;


/**
 * An XML artistType(@schema.audioserver.mindbadger.com).
 *
 * This is a complex type.
 */
public interface ArtistType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ArtistType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C09A41979E5E4F2B4F3049610A3E9B4").resolveHandle("artisttypee200type");
    
    /**
     * Gets a List of "album" elements
     */
    java.util.List<com.mindbadger.audioserver.schema.AlbumType> getAlbumList();
    
    /**
     * Gets array of all "album" elements
     * @deprecated
     */
    com.mindbadger.audioserver.schema.AlbumType[] getAlbumArray();
    
    /**
     * Gets ith "album" element
     */
    com.mindbadger.audioserver.schema.AlbumType getAlbumArray(int i);
    
    /**
     * Returns number of "album" element
     */
    int sizeOfAlbumArray();
    
    /**
     * Sets array of all "album" element
     */
    void setAlbumArray(com.mindbadger.audioserver.schema.AlbumType[] albumArray);
    
    /**
     * Sets ith "album" element
     */
    void setAlbumArray(int i, com.mindbadger.audioserver.schema.AlbumType album);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "album" element
     */
    com.mindbadger.audioserver.schema.AlbumType insertNewAlbum(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "album" element
     */
    com.mindbadger.audioserver.schema.AlbumType addNewAlbum();
    
    /**
     * Removes the ith "album" element
     */
    void removeAlbum(int i);
    
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
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.mindbadger.audioserver.schema.ArtistType newInstance() {
          return (com.mindbadger.audioserver.schema.ArtistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.mindbadger.audioserver.schema.ArtistType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.mindbadger.audioserver.schema.ArtistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.mindbadger.audioserver.schema.ArtistType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.mindbadger.audioserver.schema.ArtistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.mindbadger.audioserver.schema.ArtistType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.mindbadger.audioserver.schema.ArtistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.mindbadger.audioserver.schema.ArtistType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.mindbadger.audioserver.schema.ArtistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.mindbadger.audioserver.schema.ArtistType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.mindbadger.audioserver.schema.ArtistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.mindbadger.audioserver.schema.ArtistType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.mindbadger.audioserver.schema.ArtistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.mindbadger.audioserver.schema.ArtistType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.mindbadger.audioserver.schema.ArtistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.mindbadger.audioserver.schema.ArtistType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.mindbadger.audioserver.schema.ArtistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.mindbadger.audioserver.schema.ArtistType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.mindbadger.audioserver.schema.ArtistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.mindbadger.audioserver.schema.ArtistType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.mindbadger.audioserver.schema.ArtistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.mindbadger.audioserver.schema.ArtistType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.mindbadger.audioserver.schema.ArtistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.mindbadger.audioserver.schema.ArtistType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.mindbadger.audioserver.schema.ArtistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.mindbadger.audioserver.schema.ArtistType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.mindbadger.audioserver.schema.ArtistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.mindbadger.audioserver.schema.ArtistType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.mindbadger.audioserver.schema.ArtistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.mindbadger.audioserver.schema.ArtistType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.mindbadger.audioserver.schema.ArtistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.mindbadger.audioserver.schema.ArtistType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.mindbadger.audioserver.schema.ArtistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.mindbadger.audioserver.schema.ArtistType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.mindbadger.audioserver.schema.ArtistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
