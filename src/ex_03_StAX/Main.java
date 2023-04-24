package ex_03_StAX;

import javax.xml.stream.*;
import javax.xml.stream.events.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        try{
            XMLInputFactory factory = XMLInputFactory.newFactory();

            Reader reader = new FileReader("I:\\HW_Web-services\\Lesson_02_SOAP\\src\\ex_03_StAX\\electric_tools.xml");

            XMLEventReader xmlEventReader = factory.createXMLEventReader(reader);

            while(xmlEventReader.hasNext()) {
                XMLEvent xmlEvent = xmlEventReader.nextEvent();

                switch (xmlEvent.getEventType()){
                    case XMLStreamReader.START_ELEMENT:
                        StartElement startElement = xmlEvent.asStartElement();
                        String qName = startElement.getName().toString();
                        Iterator iterator = startElement.getAttributes();

                        switch (qName){
                            case "power_tools":
                                System.out.println("Start: power_tools...");
                                break;
                            case "model":
                                System.out.println("\tStart Element - model: ");
                                break;
                            case "name":
                                System.out.println("\t\tname: " + xmlEventReader.getElementText());
                                break;
                            case "brand":
                                System.out.println("\t\tbrand: " + xmlEventReader.getElementText());
                                break;
                            case "origin":
                                System.out.println("\t\torigin: " + xmlEventReader.getElementText());
                                break;
                            case "handy":
                                System.out.println("\t\thandy: " + xmlEventReader.getElementText());
                                break;
                            case "technical_data":
                                System.out.println("\t\ttechnical_data: " );
                                break;
                            case "vitality":
                                System.out.println("\t\t\tvitality: " + xmlEventReader.getElementText());
                                break;
                            case "energy":
                                System.out.print("\t\t\tenergy ");
                                while (iterator.hasNext()){
                                    Attribute attribute = (Attribute) iterator.next();
                                    System.out.print(attribute.getName() + " = " + attribute.getValue());
                                }
                                System.out.println(" " + xmlEventReader.getElementText());
                                break;
                            case "power":
                                System.out.print("\t\t\tpower ");
                                while (iterator.hasNext()){
                                    Attribute attribute = (Attribute) iterator.next();
                                    System.out.print(attribute.getName() + " = " + attribute.getValue());
                                }
                                System.out.println(" " + xmlEventReader.getElementText());
                                break;
                            case "turnover":
                                System.out.print("\t\t\tturnover ");
                                while (iterator.hasNext()){
                                    Attribute attribute = (Attribute) iterator.next();
                                    System.out.print(attribute.getName() + " = " + attribute.getValue());
                                }
                                System.out.println(" " + xmlEventReader.getElementText());
                                break;
                            case "rotation":
                                System.out.print("\t\t\trotation ");
                                while (iterator.hasNext()){
                                    Attribute attribute = (Attribute) iterator.next();
                                    System.out.print(attribute.getName() + " = " + attribute.getValue());
                                }
                                System.out.println(" " + xmlEventReader.getElementText());
                                break;
                            case "acoustic":
                                System.out.print("\t\t\tacoustic ");
                                while (iterator.hasNext()){
                                    Attribute attribute = (Attribute) iterator.next();
                                    System.out.print(attribute.getName() + " = " + attribute.getValue());
                                }
                                System.out.println(" " + xmlEventReader.getElementText());
                                break;
                            case "material":
                                System.out.println("\t\tmaterial: " + xmlEventReader.getElementText());
                                break;
                        }
                }

                switch (xmlEvent.getEventType()) {

                    case XMLStreamConstants.END_ELEMENT:
                        EndElement endElement = xmlEvent.asEndElement();

                        if (endElement.getName().toString().equalsIgnoreCase("model")) {
                            System.out.println("\tEnd Element: model");
                            System.out.println(" ");

                        } else if (endElement.getName().toString().equalsIgnoreCase("power_tools")) {
                            System.out.println("End: power_tools...");
                        }
                }
            }

        }catch(FileNotFoundException ex) {
            ex.printStackTrace();
        }catch (XMLStreamException ex){
            ex.printStackTrace();
        }
    }
}
