package ex_01_SAX;

import ex_01_SAX.entity.ElectricTool;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;


import java.util.ArrayList;
import java.util.List;

public class ElToolHandler extends DefaultHandler {
    private List<ElectricTool> elToolsList;
    private String currentQName;
    private String currentAttribute;
    private ElectricTool currentElTool;

    public ElToolHandler() {
        elToolsList = new ArrayList<>();
    }

    @Override
    public  void startElement(String uri, String LocalName,
                              String qName, Attributes attributes){

        System.out.println("Start element: " + qName);
        currentQName = qName;

        if(attributes.getLength() > 0) {
            currentAttribute = attributes.getValue(0);
        }
    }

    @Override
    public void  characters(char[]ch, int start, int length){
        String value = new String(ch, start, length);
        System.out.println("Characters: " + value);

        switch (currentQName){
            case "name" :
                currentElTool = new ElectricTool();
                currentElTool.setName(value);
                break;
            case "brand" :
                currentElTool.setBrand(value);
                break;
            case "origin" :
                currentElTool.setOrigin(value);
                break;
            case "handy" :
                currentElTool.setHandy(value);
                break;
            case "vitality" :
                currentElTool.setVitality(value);
                break;
            case "energy" :
                currentElTool.setConsumption(currentAttribute);
                break;
            case "power" :
                currentElTool.setRequirement(currentAttribute);
                break;
            case "turnover" :
                currentElTool.setFrequency(currentAttribute);
                break;
            case "rotation" :
                currentElTool.setMoment(currentAttribute);
                break;
            case "acoustic" :
                currentElTool.setPower(currentAttribute);
                break;
            case "material" :
                currentElTool.setMaterial(value);
                break;
        }
    }

    @Override
    public  void endElement(String uri, String localName, String qName){
        System.out.println("End element: " + qName);
        currentQName = " ";

        if(qName.equals("model")){
            elToolsList.add(currentElTool);
        }
    }

    public List<ElectricTool> getElToolsList(){
        return elToolsList;
    }
}
