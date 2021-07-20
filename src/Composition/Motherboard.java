package Composition;

public class Motherboard {
    private String model;
    private String manufacturer;
    private int ram;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manufacturer, int ram, int cardSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ram = ram;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram(String programName){
        System.out.println(programName);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRam() {
        return ram;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }
}
