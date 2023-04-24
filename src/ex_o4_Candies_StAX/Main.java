package ex_o4_Candies_StAX;

import ex_01_SAX.entity.ElectricTool;

import javax.xml.stream.*;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        try{
            XMLInputFactory factory = XMLInputFactory.newFactory();

            Reader reader = new FileReader("I:\\HW_Web-services\\Lesson_02_SOAP\\src\\ex_o4_Candies_StAX\\candies.xml");

            XMLEventReader xmlEventReader = factory.createXMLEventReader(reader);

            while(xmlEventReader.hasNext()) {
                XMLEvent xmlEvent = xmlEventReader.nextEvent();


                switch (xmlEvent.getEventType()) {
                    case XMLStreamReader.START_ELEMENT:
                        StartElement startElement = xmlEvent.asStartElement();
                        String qName = startElement.getName().toString();
                        Iterator iterator = startElement.getAttributes();

                        switch (qName) {
                            case "candy":
                                System.out.println("\nStart Element 'candy'... ");
                                break;
                            case "name":
                                System.out.println("\tname: " + xmlEventReader.getElementText());
                                break;
                            case "brand":
                                System.out.println("\tbrand: " + xmlEventReader.getElementText());
                                break;
                            case "origin":
                                System.out.println("\torigin: " + xmlEventReader.getElementText());
                                break;
                            case "type":
                                System.out.println("\ttype: " + xmlEventReader.getElementText());
                                break;
                            case "data":
                                System.out.println("\tdata: ");
                                break;
                            case "description":
                                System.out.println("\t\tvitality: " + xmlEventReader.getElementText());
                                break;
                            case "composition":
                                System.out.println("\t\tcomposition: " + xmlEventReader.getElementText());
                                break;
                            case "weight":
                                System.out.println("\t\tweight: " + xmlEventReader.getElementText());
                                break;
                            case "nutritional_value":
                                System.out.print("\t\tnutritional_value: ");
                                while (iterator.hasNext()) {
                                    Attribute attribute = (Attribute) iterator.next();
                                    System.out.print(attribute.getName() + " = " + attribute.getValue());
                                }
                                System.out.println(" " + xmlEventReader.getElementText());
                                break;
                            case "energy":
                                System.out.print("\t\tenergy: ");
                                while (iterator.hasNext()) {
                                    Attribute attribute = (Attribute) iterator.next();
                                    System.out.print(attribute.getName() + " = " + attribute.getValue());
                                }
                                System.out.println(" " + xmlEventReader.getElementText());
                                break;
                            case "shelf_life":
                                System.out.println("\tshelf_life: " + xmlEventReader.getElementText());
                                break;
                        }

                }
                switch (xmlEvent.getEventType()) {

                    case XMLStreamConstants.END_ELEMENT:
                        EndElement endElement = xmlEvent.asEndElement();

                        if (endElement.getName().toString().equalsIgnoreCase("candy")) {
                            System.out.println("End Element 'candy'.");
                        }
                }
            }


        }catch(FileNotFoundException ex){
            ex.printStackTrace();
        }catch(XMLStreamException ex){
            ex.printStackTrace();
        }
    }
}
