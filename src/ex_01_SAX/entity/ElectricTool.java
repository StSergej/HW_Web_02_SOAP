package ex_01_SAX.entity;

public class ElectricTool {

    private String name;
    private String brand;
    private String origin;
    private String handy;
    private String vitality;
    private String material;
    private String consumption;
    private String requirement;
    private String frequency;
    private String moment;
    private String power;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getHandy() {
        return handy;
    }

    public void setHandy(String handy) {
        this.handy = handy;
    }

    public String getVitality() {
        return vitality;
    }

    public void setVitality(String vitality) {
        this.vitality = vitality;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getConsumption() {
        return consumption;
    }

    public void setConsumption(String consumption) {
        this.consumption = consumption;
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getMoment() {
        return moment;
    }

    public void setMoment(String moment) {
        this.moment = moment;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }



    @Override
    public String toString() {
        return "ElectricTool{" + "name='" + name + ", brand='" + brand +
                ", origin='" + origin + ", handy='" + handy + ", vitality='" + vitality +
                ", material='" + material + ", consumption='" + consumption +
                ", requirement=" + requirement + ", frequency=" + frequency +
                ", moment=" + moment + ", power=" + power + '}';
    }
}
