package Devices.Phones.Smartphones;

import Devices.Phones.Phone;

public class Smartphone extends Phone {
    private int devID;
    private String category;
    private String model;
    private double price;
    private int count;

    public Smartphone(int devID, String category, String model, double price, int count) {
        super(devID, category, model, price, count);
        this.devID = devID;
        this.category = category;
        this.model = model;
        this.price = price;
        this.count = count;
    }

    // Getters and setters
    public int getDevID() {
        return devID;
    }

    public void setDevID(int devID) {
        this.devID = devID;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}