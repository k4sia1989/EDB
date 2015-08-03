<%@page import="org.wiztools.xsdgen.XsdGen" %>
<%@page import="java.io.File" %>
<%@page import="java.io.FileOutputStream" %>
<%@page import="javax.xml.transform.Transformer" %>
<%@page import="javax.xml.transform.TransformerFactory" %>
<%@page import="javax.xml.transform.stream.StreamSource" %>
<%@page import="javax.xml.transform.stream.StreamResult" %>

<html>
<body>
<h2>Hello World!</h2>
<h3><%
//XsdGen gen = new XsdGen();
//ClassLoader classLoader = getClass().getClassLoader();
//File file = new File(classLoader.getResource("superfile.xml").getFile());
//gen.parse(file);
//File parentDict = file.getParentFile();
//File out2 = new File(parentDict, "out.xsd");
//out2.createNewFile();
//gen.write(new FileOutputStream(out2));

TransformerFactory tFactory = TransformerFactory.newInstance();
	Transformer transformer = tFactory.newTransformer(new StreamSource("foo.xsl"));
	transformer.transform(new StreamSource("superfile.xml"), new StreamResult(new FileOutputStream("foo.html")));%></h3>
</body>
</html>
