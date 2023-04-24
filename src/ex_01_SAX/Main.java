package ex_01_SAX;

import ex_01_SAX.entity.ElectricTool;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();

        ElToolHandler handler = new ElToolHandler();

        File file = new File("I:\\HW_Web-services\\Lesson_02_SOAP\\src\\ex_01_SAX\\electric_tools.xml");
        parser.parse(file, handler);

        List<ElectricTool> electricTools = handler.getElToolsList();

        System.out.println("\nAll models: ");

        for (ElectricTool elTool : electricTools){
            System.out.println("\t" + "name='" + elTool.getName()+ "' brand='" + elTool.getBrand() +
                    "' origin='" + elTool.getOrigin() + "' handy='" + elTool.getHandy() +
                    "' \n\tvitality='" + elTool.getVitality() + "' energy consumption='" + elTool.getConsumption() +
                    "' power requirement='" + elTool.getRequirement() + "' turnover frequency='" + elTool.getFrequency() +
                    "' rotation moment='" + elTool.getMoment() + "' acoustic power='" + elTool.getPower() +
                    "' \n\tmaterial='" + elTool.getMaterial() + "'\n");
        }
    }
}
