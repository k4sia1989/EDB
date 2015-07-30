<%@page import="org.wiztools.xsdgen.XsdGen" %>
<%@page import="java.io.File" %>
<%@page import="java.io.FileOutputStream" %>
<html>
<body>
<h2>Hello World!</h2>
<h3><%
XsdGen gen = new XsdGen();
ClassLoader classLoader = getClass().getClassLoader();
File file = new File(classLoader.getResource("superfile.xml").getFile());
boolean a = file.exists();
System.out.println("----------" + a);
gen.parse(file);
File parentDict = file.getParentFile();
File out2 = new File(parentDict, "out.xsd");
out2.createNewFile();
gen.write(new FileOutputStream(out2)); %></h3>
</body>
</html>
