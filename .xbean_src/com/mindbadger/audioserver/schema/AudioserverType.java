/*
 * XML Type:  audioserverType
 * Namespace: schema.audioserver.mindbadger.com
 * Java type: com.mindbadger.audioserver.schema.AudioserverType
 *
 * Automatically generated - do not modify.
 */
package com.mindbadger.audioserver.schema;


/**
 * An XML audioserverType(@schema.audioserver.mindbadger.com).
 *
 * This is a complex type.
 */
public interface AudioserverType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AudioserverType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C09A41979E5E4F2B4F3049610A3E9B4").resolveHandle("audioservertype8fa0type");
    
    /**
     * Gets a List of "artist" elements
     */
    java.util.List<com.mindbadger.audioserver.schema.ArtistType> getArtistList();
    
    /**
     * Gets array of all "artist" elements
     * @deprecated
     */
    com.mindbadger.audioserver.schema.ArtistType[] getArtistArray();
    
    /**
     * Gets ith "artist" element
     */
    com.mindbadger.audioserver.schema.ArtistType getArtistArray(int i);
    
    /**
     * Returns number of "artist" element
     */
    int sizeOfArtistArray();
    
    /**
     * Sets array of all "artist" element
     */
    void setArtistArray(com.mindbadger.audioserver.schema.ArtistType[] artistArray);
    
    /**
     * Sets ith "artist" element
     */
    void setArtistArray(int i, com.mindbadger.audioserver.schema.ArtistType artist);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "artist" element
     */
    com.mindbadger.audioserver.schema.ArtistType insertNewArtist(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "artist" element
     */
    com.mindbadger.audioserver.schema.ArtistType addNewArtist();
    
    /**
     * Removes the ith "artist" element
     */
    void removeArtist(int i);
    
    /**
     * Gets the "lastUpdated" attribute
     */
    java.util.Calendar getLastUpdated();
    
    /**
     * Gets (as xml) the "lastUpdated" attribute
     */
    org.apache.xmlbeans.XmlDateTime xgetLastUpdated();
    
    /**
     * True if has "lastUpdated" attribute
     */
    boolean isSetLastUpdated();
    
    /**
     * Sets the "lastUpdated" attribute
     */
    void setLastUpdated(java.util.Calendar lastUpdated);
    
    /**
     * Sets (as xml) the "lastUpdated" attribute
     */
    void xsetLastUpdated(org.apache.xmlbeans.XmlDateTime lastUpdated);
    
    /**
     * Unsets the "lastUpdated" attribute
     */
    void unsetLastUpdated();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.mindbadger.audioserver.schema.AudioserverType newInstance() {
          return (com.mindbadger.audioserver.schema.AudioserverType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.mindbadger.audioserver.schema.AudioserverType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.mindbadger.audioserver.schema.AudioserverType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.mindbadger.audioserver.schema.AudioserverType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.mindbadger.audioserver.schema.AudioserverType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.mindbadger.audioserver.schema.AudioserverType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.mindbadger.audioserver.schema.AudioserverType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.mindbadger.audioserver.schema.AudioserverType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.mindbadger.audioserver.schema.AudioserverType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.mindbadger.audioserver.schema.AudioserverType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.mindbadger.audioserver.schema.AudioserverType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.mindbadger.audioserver.schema.AudioserverType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.mindbadger.audioserver.schema.AudioserverType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.mindbadger.audioserver.schema.AudioserverType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.mindbadger.audioserver.schema.AudioserverType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.mindbadger.audioserver.schema.AudioserverType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.mindbadger.audioserver.schema.AudioserverType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.mindbadger.audioserver.schema.AudioserverType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.mindbadger.audioserver.schema.AudioserverType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.mindbadger.audioserver.schema.AudioserverType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.mindbadger.audioserver.schema.AudioserverType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.mindbadger.audioserver.schema.AudioserverType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.mindbadger.audioserver.schema.AudioserverType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.mindbadger.audioserver.schema.AudioserverType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.mindbadger.audioserver.schema.AudioserverType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.mindbadger.audioserver.schema.AudioserverType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.mindbadger.audioserver.schema.AudioserverType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.mindbadger.audioserver.schema.AudioserverType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.mindbadger.audioserver.schema.AudioserverType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.mindbadger.audioserver.schema.AudioserverType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.mindbadger.audioserver.schema.AudioserverType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.mindbadger.audioserver.schema.AudioserverType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.mindbadger.audioserver.schema.AudioserverType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.mindbadger.audioserver.schema.AudioserverType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.mindbadger.audioserver.schema.AudioserverType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
