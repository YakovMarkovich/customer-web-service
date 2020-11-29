package main.java.m2m.entity;

public class AvgQuantityObject {
    private double avgValue;
    private long quantity;

    public double getAvgValue() {
        return avgValue;
    }

    public void setAvgValue(double avgValue) {
        this.avgValue = avgValue;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "AvgQuantityObject{" +
                "avgValue=" + avgValue +
                ", quantity=" + quantity +
                '}';
    }
}
