http://techtipsjava.blogspot.in/2012/06/marshalling-and-unmarshalling-data.html

JAXB stands for Java architecture for XML binding.
JAXB is a Java Api for for Marshalling and UnMarshalling XML Data.

Note: idea is that you bind an XML Schema to an object and then use this schema-bound object to marshall or unmarshall XML Data.

Marshalling: Convert a Java object into a String(XML file).
Unmarshalling: Convert XML content(String) into a Java Object.
--------------------------------------------------------------------------------------------------------------------------

Steps:
1- Create an XSD file that describes structure of your XML document.
2- Execute xjc(JAXB Compiler=XML to Java Compiler) command from command prompt and pass package and .xsd file as parameters.

Generate java beans from xsd file:
	Note: xjc is present in c/Program Files/Java/jdk1.8.0_91/bin/xjc (%JAVA_HOME% directory)
	Note: gensrc direcotry should exists.
	1)	xjc resources\jaxb\xsd\contact.xsd -d gensrc -p com.chahar.core.jaxb.contact
	2)  xjc resources\jaxb\xsd\employee.xsd -d gensrc -p com.chahar.core.jaxb.employee
	3)  xjc -wsdl C:\study\projects\codingWorkspace\aop\resources\jaxb\wsdl\currencyconvertor.wsdl -d C:\study\projects\codingWorkspace\aop\gensrc -p com.chahar.core.jaxb.wsdl.currencyconverter
	
Note: XJC tool generate beans from xsd(xml schema) & wsdl document BOTH.
-----------------------------------------------------------------------------------------------------------------------
Reference:
1) https://docs.oracle.com/cd/E19575-01/819-3669/6n5sg7bj5/index.html
2) http://techtipsjava.blogspot.in/2012/06/marshalling-and-unmarshalling-data.html

3) https://en.wikipedia.org/wiki/Java_Architecture_for_XML_Binding
	