class Mobile {
    private String model;
    private int battery;

    public void setModel(String model) {
        this.model = model;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public String getModel() {
        return model;
    }

    public int getBattery() {
        return battery;
    }
}

public class TestMobile {
    public static void main(String[] args) {
        Mobile m = new Mobile();

        m.setModel("Samsung");
        m.setBattery(5000);

        System.out.println("Model: " + m.getModel());
        System.out.println("Battery: " + m.getBattery() + "mAh");
    }
}