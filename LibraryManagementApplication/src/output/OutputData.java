package output;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;  
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;  
import org.w3c.dom.Node;  
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.*;
import javax.xml.transform.*;

public class OutputData {
	
	private static Element setBooksAttribute(String name, String value, Document doc) {
		Text attributeText = doc.createTextNode(value);
		Element attributeName = doc.createElement(name);
		attributeName.appendChild(attributeText);
		return attributeName;
	}
	
	public static void main(String[] args) {
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		
			DocumentBuilder builder = null;
			try {
				builder = dbf.newDocumentBuilder();
			} catch (ParserConfigurationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Document doc = builder.newDocument();
			Element root = doc.createElement("library");
			doc.appendChild(root);
			Element shelf = doc.createElement("shelf1");
			root.appendChild(shelf);
			Element category = doc.createElement("category");
			shelf.appendChild(category);
			category.setTextContent("fantasy");
			Element book = doc.createElement("book");
			book.setAttribute("id", "bk101");
			category.appendChild(book);
			book.appendChild(setBooksAttribute("title","The color of magic",doc));
			book.appendChild(setBooksAttribute("author","Terry Pratchett",doc));
			book.appendChild(setBooksAttribute("price","44.95",doc));
			book.appendChild(setBooksAttribute("publish_date","2000-10-01",doc));
			
			Element book2 = doc.createElement("book");
			book2.setAttribute("id", "bk102");
			category.appendChild(book2);
			book2.appendChild(setBooksAttribute("title","The fifth season",doc));
			book2.appendChild(setBooksAttribute("author","NK Jemisin",doc));
			book2.appendChild(setBooksAttribute("price","5.95",doc));
			book2.appendChild(setBooksAttribute("publish_date","2000-12-16",doc));
		
			Element book3 = doc.createElement("book");
			book3.setAttribute("id", "bk103");
			category.appendChild(book3);
			book3.appendChild(setBooksAttribute("title","The lord of the rings ",doc));
			book3.appendChild(setBooksAttribute("author","JRR Tolkien ",doc));
			book3.appendChild(setBooksAttribute("price","5.95 ",doc));
			book3.appendChild(setBooksAttribute("publish_date"," 2000-11-17",doc));
		
			
			Element book4 = doc.createElement("book");
			book4.setAttribute("id", "bk104");
			category.appendChild(book4);
			book4.appendChild(setBooksAttribute("title"," The name of the wind",doc));
			book4.appendChild(setBooksAttribute("author","Patrick Rothfuss ",doc));
			book4.appendChild(setBooksAttribute("price","5.95  ",doc));
			book4.appendChild(setBooksAttribute("publish_date"," 2001-03-10",doc));
			
			Element book5 = doc.createElement("book");
			book5.setAttribute("id", "bk105");
			category.appendChild(book5);
			book5.appendChild(setBooksAttribute("title","American gods ",doc));
			book5.appendChild(setBooksAttribute("author","Neil Gaiman ",doc));
			book5.appendChild(setBooksAttribute("price","5.95 ",doc));
			book5.appendChild(setBooksAttribute("publish_date","2001-09-10 ",doc));
			
			Element shelf2 = doc.createElement("shelf2");
			root.appendChild(shelf2);
			Element category2 = doc.createElement("category");
			shelf2.appendChild(category2);
			category2.setTextContent("programming");
			
			
			
			Element book6 = doc.createElement("book");
			book6.setAttribute("id", "bk106");
			category2.appendChild(book6);
			book6.appendChild(setBooksAttribute("title","Types and Programming Languages ",doc));
			book6.appendChild(setBooksAttribute("author","C. Pierce ",doc));
			book6.appendChild(setBooksAttribute("price","4.95  ",doc));
			book6.appendChild(setBooksAttribute("publish_date","2000-09-02 ",doc));
			
			
			Element book7 = doc.createElement("book");
			book7.setAttribute("id", "bk107");
			category2.appendChild(book7);
			book7.appendChild(setBooksAttribute("title","Algorithms ",doc));
			book7.appendChild(setBooksAttribute("author","Robert Sedgewick and Kevin Wayne ",doc));
			book7.appendChild(setBooksAttribute("price","4.95 ",doc));
			book7.appendChild(setBooksAttribute("publish_date","2000-11-02 ",doc));
			
			Element book8 = doc.createElement("book");
			book8.setAttribute("id", "bk108");
			category2.appendChild(book8);
			book8.appendChild(setBooksAttribute("title","Introduction to Computer Science Using Python ",doc));
			book8.appendChild(setBooksAttribute("author","Charles Dierbach ",doc));
			book8.appendChild(setBooksAttribute("price","4.95 ",doc));
			book8.appendChild(setBooksAttribute("publish_date","2000-12-06  ",doc));
			
			Element book9 = doc.createElement("book");
			book9.setAttribute("id", "bk109");
			category2.appendChild(book9);
			book9.appendChild(setBooksAttribute("title","JavaScript: The Good Parts ",doc));
			book9.appendChild(setBooksAttribute("author","Douglas Crockford ",doc));
			book9.appendChild(setBooksAttribute("price","6.95 ",doc));
			book9.appendChild(setBooksAttribute("publish_date","2000-11-02 ",doc));
			
			Element book10 = doc.createElement("book");
			book10.setAttribute("id", "bk110");
			category2.appendChild(book10);
			book10.appendChild(setBooksAttribute("title","The Pragmatic Programmer ",doc));
			book10.appendChild(setBooksAttribute("author","Andrew Hunt and David Thomas ",doc));
			book10.appendChild(setBooksAttribute("price","36.95 ",doc));
			book10.appendChild(setBooksAttribute("publish_date","2000-12-09 ",doc));
			
			Element book11 = doc.createElement("book");
			book11.setAttribute("id", "bk111");
			category2.appendChild(book11);
			book11.appendChild(setBooksAttribute("title","Modern Operating Systems ",doc));
			book11.appendChild(setBooksAttribute("author","Andrew S. Tanenbaum ",doc));
			book11.appendChild(setBooksAttribute("price","36.95 ",doc));
			book11.appendChild(setBooksAttribute("publish_date","2000-12-01 ",doc));
			
			Element shelf3 = doc.createElement("shelf3");
			root.appendChild(shelf3);
			Element category3 = doc.createElement("category");
			shelf3.appendChild(category3);
			category3.setTextContent("psychology");
			
			Element book12 = doc.createElement("book");
			book12.setAttribute("id", "bk112");
			category3.appendChild(book12);
			book12.appendChild(setBooksAttribute("title","Thinking Fast And Slow ",doc));
			book12.appendChild(setBooksAttribute("author","Daniel Kahneman ",doc));
			book12.appendChild(setBooksAttribute("price"," 36.95 ",doc));
			book12.appendChild(setBooksAttribute("publish_date","2002-12-01 ",doc));
			
			Element book13 = doc.createElement("book");
			book13.setAttribute("id", "bk113");
			category3.appendChild(book13);
			book13.appendChild(setBooksAttribute("title","The Power of Habit ",doc));
			book13.appendChild(setBooksAttribute("author","Charles Duhigg ",doc));
			book13.appendChild(setBooksAttribute("price","12.90 ",doc));
			book13.appendChild(setBooksAttribute("publish_date","2005-12-05 ",doc));
			
			Element book14 = doc.createElement("book");
			book14.setAttribute("id", "bk114");
			category3.appendChild(book14);
			book14.appendChild(setBooksAttribute("title","Predictably Irrational ",doc));
			book14.appendChild(setBooksAttribute("author","Dan Ariely ",doc));
			book14.appendChild(setBooksAttribute("price","15.95 ",doc));
			book14.appendChild(setBooksAttribute("publish_date"," 2005-12-12 ",doc));
			
			Element book15 = doc.createElement("book");
			book15.setAttribute("id", "bk115");
			category3.appendChild(book15);
			book15.appendChild(setBooksAttribute("title"," Influence: The Psychology ",doc));
			book15.appendChild(setBooksAttribute("author","Robert Cialdini ",doc));
			book15.appendChild(setBooksAttribute("price","10.95 ",doc));
			book15.appendChild(setBooksAttribute("publish_date","2000-09-06 ",doc));
			
			Element shelf4 = doc.createElement("shelf4");
			root.appendChild(shelf4);
			Element category4 = doc.createElement("category");
			shelf4.appendChild(category4);
			category4.setTextContent("romance");
			
			Element book16 = doc.createElement("book");
			book16.setAttribute("id", "bk116");
			category4.appendChild(book16);
			book16.appendChild(setBooksAttribute("title","Vision in White ",doc));
			book16.appendChild(setBooksAttribute("author","Nora Roberts ",doc));
			book16.appendChild(setBooksAttribute("price","10.95 ",doc));
			book16.appendChild(setBooksAttribute("publish_date","2000-09-06 ",doc));
			
			Element book17 = doc.createElement("book");
			book17.setAttribute("id", "bk117");
			category4.appendChild(book17);
			book17.appendChild(setBooksAttribute("title","The Notebook ",doc));
			book17.appendChild(setBooksAttribute("author","Nicolas Sparks ",doc));
			book17.appendChild(setBooksAttribute("price","30.45 ",doc));
			book17.appendChild(setBooksAttribute("publish_date","1999-10-02  ",doc));
			
			Element book18 = doc.createElement("book");
			book18.setAttribute("id", "bk118");
			category4.appendChild(book18);
			book18.appendChild(setBooksAttribute("title","Tonight And Forever ",doc));
			book18.appendChild(setBooksAttribute("author","Brenda Jackson ",doc));
			book18.appendChild(setBooksAttribute("price","30.50 ",doc));
			book18.appendChild(setBooksAttribute("publish_date","1998-11-02  ",doc));
			
			Element shelf5 = doc.createElement("shelf5");
			root.appendChild(shelf5);
			Element category5 = doc.createElement("category");
			shelf5.appendChild(category5);
			category5.setTextContent("adventure");
			
			Element book19 = doc.createElement("book");
			book19.setAttribute("id", "bk119");
			category5.appendChild(book19);
			book19.appendChild(setBooksAttribute("title","The Odyssey ",doc));
			book19.appendChild(setBooksAttribute("author","Homer ",doc));
			book19.appendChild(setBooksAttribute("price","40.50 ",doc));
			book19.appendChild(setBooksAttribute("publish_date","1998-10-05 ",doc));
			
			Element book20 = doc.createElement("book");
			book20.setAttribute("id", "bk120");
			category5.appendChild(book20);
			book20.appendChild(setBooksAttribute("title","Gulliver's Travels ",doc));
			book20.appendChild(setBooksAttribute("author","Jonathan Swift ",doc));
			book20.appendChild(setBooksAttribute("price","35.80 ",doc));
			book20.appendChild(setBooksAttribute("publish_date","1999-08-05  ",doc));
			
			Element book21 = doc.createElement("book");
			book21.setAttribute("id", "bk121");
			category5.appendChild(book21);
			book21.appendChild(setBooksAttribute("title","Moby-Dick ",doc));
			book21.appendChild(setBooksAttribute("author","Herman Melville ",doc));
			book21.appendChild(setBooksAttribute("price","19.50 ",doc));
			book21.appendChild(setBooksAttribute("publish_date","1998-12-11 ",doc));
			
			Element book22 = doc.createElement("book");
			book22.setAttribute("id", "bk122");
			category5.appendChild(book22);
			book22.appendChild(setBooksAttribute("title","Treasure Island ",doc));
			book22.appendChild(setBooksAttribute("author","Robert Louis Stevenson ",doc));
			book22.appendChild(setBooksAttribute("price","21.50 ",doc));
			book22.appendChild(setBooksAttribute("publish_date","2000-10-02 ",doc));
			
			Element book23 = doc.createElement("book");
			book23.setAttribute("id", "bk123");
			category5.appendChild(book23);
			book23.appendChild(setBooksAttribute("title","King Solomon's Mines ",doc));
			book23.appendChild(setBooksAttribute("author","H. Rider Haggard ",doc));
			book23.appendChild(setBooksAttribute("price","17.95 ",doc));
			book23.appendChild(setBooksAttribute("publish_date","1998-09-10 ",doc));
			
			
			
			DOMSource source = new DOMSource(doc);
			String path = "/Users/juliaflorea/eclipse-workspace/LibraryManagementApplication/src/output/Output.xml";
			File f = new File(path);
			Result result = new StreamResult(f);
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			try {
				Transformer transformer = transformerFactory.newTransformer();
				transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
				transformer.setOutputProperty(OutputKeys.INDENT, "yes");
				transformer.transform(source, result);
				System.out.println("Data written successfully to file " + path);
					
				
				
			} catch (TransformerConfigurationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (TransformerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	}
	

}


