package geovideveloperoop.cellphone;

public class CellPhone {
    private String make;
    private String model;
    private Display display;
    private RadioModule radioModule;

    public CellPhone(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void turnON() {
        initDisplay();
        radioModule = new RadioModule();
    }

    public void call(String number) {
        radioModule.call(number);
    }

    private void initDisplay() {
        display = new Display();
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Display getDisplay() {
        return display;
    }
}
