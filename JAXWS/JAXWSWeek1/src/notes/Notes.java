package notes;

public class Notes {

}

// Web Service ;
// JAXRS
// JAXWS -> Java api for xml web services ( big web services)

//https://docs.oracle.com/javaee/7/tutorial/webservices-intro001.htm#GIJVH

// temel nokta , farkli framworkler , farkli diller de olsa ortak calisma/ iletisim.

// JAXWS , XML messagelarinda SOAP yapisini/standardini kullanir.

// SOAP -> simple object access protocol

// Big web services use XML messages that follow the Simple Object Access Protocol (SOAP) 
// standard, an XML language defining a message architecture and message formats.

// XML Web Services use XML as the basis for communication between Web-based 
// services and clients of those services and inherit XML’s platform independence.
// jaxws spec

// JAXWS -> JAVA EE in bir bolumudur.
// https://jcp.org/en/jsr/detail?id=224

// Metro Project, Glassfish (reference implementation)
// Apache CXF
// Apache Axis2
// JBossWS
// IBM Websphere 
// oracle weblogic (applicaiton server icerisinde implemantation yer almaktadir.)


// SOAP , platform bagimsiz ,XML tabanli bir standard protokol.

//
// https://www.w3.org/TR/soap12/

// SOAP messagelari komplex bir yapiya sahiptir. bununla birlikte developer in bu komplex yapiyla ugrasmasina gerek yoktur.
// jaxws bizim icin soap mesajlarini olusturur/generate ve parse eder.

// ### WSDL(web service description language)
// WSDL , XML tabanli bir dokumandir. web service hakkindaki bilgiler bu yapida yer almaktadir.
// WSDL , bir service nasil erisebiliriz, hangi operationlari yapabiliriz bunlari tanimlar/gosterir.

// WSDL is "an XML format for describing network services as a set of endpoints operating 
// on messages containing either document-oriented or procedure-oriented information." 
// WSDL can be considered the defacto service description language for XML Web Services.
// jaxws spec

// https://www.w3.org/TR/wsdl

//WSDL can be used to describe the details of the contract, 
//which may include messages, operations, bindings, and the location of the web service.

//https://docs.oracle.com/javaee/7/tutorial/webservices-intro002.htm 


// ### WSDL elements
// 1)<definitions>
// WSDL dokumanin root elementidir. web service ismini tanimlar. targetNamespace , packaName ile iliskilidir.

//A WSDL document has a root wsdl:definitions element. 
//A wsdl:definitions element and its associated targetNamespace attribute 
//is mapped to a Java package.

// 2)<types>
//Web service te kullanilan data tiplerini belirtir.
// String , integer gibi tipler varsa types elementinde tanimlanmaz.
// complex tipler icin tanimlanir.

//<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema" version="1.0" targetNamespace="http://service/">
//<xs:complexType name="person">
//	<xs:sequence>
//		<xs:element name="id" type="xs:int"/>
//		<xs:element name="name" type="xs:string" minOccurs="0"/>
//		<xs:element name="surname" type="xs:string" minOccurs="0"/>
//	</xs:sequence>
//</xs:complexType>
//</xs:schema>

// jaxws tarafindan desteklenen types ;
// https://docs.oracle.com/javaee/7/tutorial/jaxws002.htm#BNAZC

// 3)<message>
// web service te tanimli metotlari ifade etmektedir.
// <part> elementi input parametrelerini ya da donus parametresini ifade eder.
//

//<message name="getWelcomeMessage">
//	<part name="name" type="xsd:string" />
//	<part name="surname" type="xsd:string" />
//</message>
//<message name="getWelcomeMessageResponse">
//	<part name="return" type="xsd:string" />
//</message>

// 4)<portType>
// <portType> icerisinde <input> , <output> elementleri yer alir.
// <message> elementindeki deger ile eslesir.

// A WSDL port type is a named set of abstract operation definitions.

// portType name="MessageWriter"
// portType icerisinde tanimli olan interface , SEI (service endpoint interface)
// SEI icerinde(interface icerisindeki) tanimli metotlar <operation> etiketi icerinde yer almaktadir.

// A Java interface mapped from a wsdl:portType is called a Service Endpoint Interface  or SEI for short.

// Each wsdl:operation in a wsdl:portType is mapped to a Java method in the corresponding Java service endpoint interface.

// SEI uzerinde @WebService annotationi  kullanilir.
// metotlari icin de @WebMethod annotationi kullanilir.

// A mapped SEI MUST be annotated with a javax.jws.WebService annotation.
// A mapped Java method MUST be annotated with a javax.jws.WebMethod annotation.

// 5)
// <bindin> elementi icerindse soap:binding gibi elementler yer alir.
// style olarak rpc, document olabilir ;
// encoded literal
// https://stackoverflow.com/questions/9062475/what-is-the-difference-between-document-style-and-rpc-style-communication

// 6) <service>
// soap:address elementi yer alir.
// burada location bilgisi yer alir. web service in publish edilecegi adress bilgisi.
