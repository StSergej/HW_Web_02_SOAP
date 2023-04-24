package ex_02_DOM;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;



public class ElToolsHelper {

    private static final String FileName = "I:\\HW_Web-services\\Lesson_02_SOAP\\src\\ex_02_DOM\\electric_tools.xml";

    private Document document;

    public ElToolsHelper() throws IOException, SAXException, ParserConfigurationException {

        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        dbFactory.setIgnoringElementContentWhitespace(true);

        DocumentBuilder docBuilder = dbFactory.newDocumentBuilder();
        document = docBuilder.parse(new File(FileName).toURI().toString());

        System.out.print("Root element: ");
        System.out.println(document.getDocumentElement().getNodeName());

    }

    public void getAllElTools(){

        NodeList nodeList = document.getElementsByTagName("model");

        for (int i = 0; i < nodeList.getLength(); i++){
            Node nNode = nodeList.item(i);
            Element elToolElement = (Element) nNode;

            System.out.print("\nElement: ");
            System.out.println(nNode.getNodeName());

            NodeList modelList1 = elToolElement.getElementsByTagName("name");
            System.out.print("\tname: ");
            System.out.println(modelList1.item(0).getFirstChild().getTextContent());

            NodeList modelList2 = elToolElement.getElementsByTagName("brand");
            System.out.print("\tbrand: ");
            System.out.println(modelList2.item(0).getFirstChild().getTextContent());

            NodeList modelList3 = elToolElement.getElementsByTagName("origin");
            System.out.print("\torigin: ");
            System.out.println(modelList3.item(0).getFirstChild().getTextContent());

            NodeList modelList4 = elToolElement.getElementsByTagName("handy");
            System.out.print("\thandy: ");
            System.out.println(modelList4.item(0).getFirstChild().getTextContent());

            NodeList modelList5 = elToolElement.getElementsByTagName("technical_data");
            System.out.println("\ttechnical_data - ");

            NodeList modelList6 = elToolElement.getElementsByTagName("vitality");
            System.out.print("\t\tvitality: ");
            System.out.println(modelList6.item(0).getFirstChild().getTextContent());

            NodeList modelList7 = elToolElement.getElementsByTagName("energy");
            System.out.print("\t\tenergy consumption = ");
            Element techData1 = (Element) modelList7.item(0);
            System.out.print(techData1.getAttribute("consumption"));
            System.out.println(" " + modelList7.item(0).getFirstChild().getTextContent());

            NodeList modelList8 = elToolElement.getElementsByTagName("power");
            System.out.print("\t\tpower requirement = ");
            Element techData2 = (Element) modelList8.item(0);
            System.out.print(techData2.getAttribute("requirement"));
            System.out.println(" " + modelList8.item(0).getFirstChild().getTextContent());

            NodeList modelList9 = elToolElement.getElementsByTagName("turnover");
            System.out.print("\t\tturnover frequency = ");
            Element techData3 = (Element) modelList9.item(0);
            System.out.print(techData3.getAttribute("frequency"));
            System.out.println(" " + modelList9.item(0).getFirstChild().getTextContent());

            NodeList modelList10 = elToolElement.getElementsByTagName("rotation");
            System.out.print("\t\trotation moment = ");
            Element techData4 = (Element) modelList10.item(0);
            System.out.print(techData4.getAttribute("moment"));
            System.out.println(" " + modelList10.item(0).getFirstChild().getTextContent());

            NodeList modelList11 = elToolElement.getElementsByTagName("acoustic");
            System.out.print("\t\tacoustic power = ");
            Element techData5 = (Element) modelList11.item(0);
            System.out.print(techData5.getAttribute("power"));
            System.out.println(" " + modelList11.item(0).getFirstChild().getTextContent());


            NodeList modelList12 = elToolElement.getElementsByTagName("material");
            System.out.print("\tmaterial: ");
            System.out.println(modelList12.item(0).getFirstChild().getTextContent());

        }
    }
}
