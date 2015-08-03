

import java.io.File;

import javax.xml.transform.TransformerException;

public class TestXml {
	 public static void main(String[] args) throws TransformerException {
         final File xmlFile = new File("user.xml");
         final File xsltFile = new File("user.xsl");
         System.out.println(XmlTransformer.getTransformedHtml(xmlFile, xsltFile));
     }

}
