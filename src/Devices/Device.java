package Devices;

public class Device {
    private int devID;
    private String category;
    private String model;
    private double price;
    private int count;

    public Device(int devID, String category, String model, double price, int count) {
        this.devID = devID;
        this.category = category;
        this.model = model;
        this.price = price;
        this.count = count;
    }

    public int getDevID() {
        return devID;
    }

    public String getCategory() {
        return category;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }
}