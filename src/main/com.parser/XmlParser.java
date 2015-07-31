import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamSource;


public class XmlParser {
	
	public static void parse(String xmlfile){
	
	TransformerFactory tFactory = TransformerFactory.newInstance();
	Transformer transformer = tFactory.newTransformer(new StreamSource("foo.xsl"));
	transformer.transform(xmlSource, "foo.html");
	}

}
