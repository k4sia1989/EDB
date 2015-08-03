package parsers;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.StringWriter;
import java.util.Scanner;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;


public class XmlTransformer {
	
	public static void createXsl(File xmlFile){
		
		
	}
    public static String getTransformedHtml(File xmlFile, File xsltFile) throws TransformerException {
        byte[] xml = getStringFromFile(xmlFile).getBytes();
        byte[] xsl = getStringFromFile(xsltFile).getBytes();
        return getTransformedHtml(xml, xsl);
    }
    public static String getTransformedHtml(String xml, String xsl) throws TransformerException {
        return getTransformedHtml(xml.getBytes(), xsl.getBytes());
    }
    public static String getTransformedHtml(byte[] xml, byte[] xsl) throws TransformerException {
        Source srcXml = new StreamSource(new ByteArrayInputStream(xml));
        Source srcXsl = new StreamSource(new ByteArrayInputStream(xsl));
        StringWriter writer = new StringWriter();
        Result result = new StreamResult(writer);
        TransformerFactory tFactory = TransformerFactory.newInstance();
        Transformer transformer = tFactory.newTransformer(srcXsl);
        transformer.transform(srcXml, result);
        return writer.toString();
    }
    private static String getStringFromFile(File f) {
        StringBuilder sb = new StringBuilder(1000);
        try {
            Scanner sc = new Scanner(f);
            while (sc.hasNext()) {
                sb.append(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

}
