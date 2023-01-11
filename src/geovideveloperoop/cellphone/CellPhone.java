package geovideveloperoop.cellphone;

public class CellPhone {
    private String make;
    private String model;
    private Display display;

    public CellPhone(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void turnON(){
        initDisplay();
    }

    private void initDisplay(){
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
