package parsers;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.jcabi.xml.XML;
import com.jcabi.xml.XSL;
import com.jcabi.xml.XSLDocument;


public class XslTransformer {
	
	
	
	public static final XSL STYLESHEET = XSLDocument.make(
		    XslTransformer.class.getResourceAsStream("superfile.xml")
		  );

		
	
	
	public void transformToXsl(File xml) throws ParserConfigurationException {
		
		String text = STYLESHEET.applyTo((XML) new File(""));
		
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
		Document document = documentBuilder.newDocument();
		Element rootElement = document.createElement("xsl:stylesheet");
		document.appendChild(rootElement); 
		Element em = document.createElement("xsl:template");
		em.setAttribute("match", "/");
		System.out.println(em.toString());
	}

}
