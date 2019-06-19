WSDL (Web Services Description Language).
WSDL is an XML document that describes a web service.

SOAP(Simple Object Access Protocol) is an XML-based protocol that lets you exchange info over a particular protocol (can be HTTP or SMTP, for example) between applications.
and uses XML for its messaging format to relay the information.

REST(Representational State Transfer) is an architectural style of networked systems.
It's not a standard itself, but does use standards such as HTTP, URL, XML, etc.
REST uses HTTP to send messages to services.
SOAP is a spec, REST is a style

XSD (XML schema definition) defines the element in an XML document.
It can be used to verify if the elements in the xml document adheres to the description in which the content is* to be placed.
WSDL is specific type of XML document which describes the web service. WSDL itself adheres to a XSD.

Generate java beans from wsdl file.
	Note: gensrc direcotry should exists.
	wsdl file=currencyconvertor.wsdl
	
	Generate beans from wsdl file:
		xjc -wsdl C:\study\projects\aop\resources\jaxb\wsdl\currencyconvertor.wsdl -d C:\study\projects\aop\gensrc -p com.chahar.core.jaxb.wsdl.currencyconverter
		xjc -wsdl http://www.webservicex.com/currencyconvertor.asmx?WSDL -d C:\study\projects\aop\gensrc -p com.chahar.core.jaxb.wsdl.currencyconverter
		
Note: SOAP UI Software: test wsdl file by sending request & receive response.

Question: Soap vs REST?
Ans: 
http://www.softwaretestinghelp.com/soapui-interview-questions-and-answers/

SOAP is a protocol and REST is architecture. It allows us to send SOAP envelops to REST based applications.
REST supports different message formats but SOAP permits XML only.
REST services are faster and easy to handle.
SOAP is tied with SMTP and HTTP protocols whereas REST relies on HTTP only.
SOAP is more secure and structured format.
REST does not depend on any specific standards as it supports various messaging formats like JSON, CSV and XML.
SOAP web services allow us to build the client with RESTful services.
SOAP was introduced for distributed computing.
After REST�s entry, it accommodated the web by its performance and scalability as it is a light weight component.
REST is stateless whereas SOAP is a statefull specification.
REST uses Uniform Resource Identifier (URI) and it has the methods like GET, PUT, POST and DELETE to expose their resources.
SOAP uses named operations and interfaces to achieve its business logics.
----------------------------------------------------------------------------------------------------------

Reference:
	https://www.soapui.org/soap-and-wsdl/getting-started.html
	https://www.soapui.org/soap-and-wsdl/working-with-wsdls.html
