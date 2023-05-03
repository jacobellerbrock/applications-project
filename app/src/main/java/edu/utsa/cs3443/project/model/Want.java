package edu.utsa.cs3443.project.model;

import androidx.annotation.NonNull;

public class Want extends Category {

    private String name;
    private double percentage;
    private double value;

    public Want(String type, String name, double p) {
        super(type);
        this.name = name;
        percentage = p;
        value = -1;
    }

    @NonNull
    @Override
    public String toString() {
        return super.toString() + " Name: " + getName() + " Value: " + getValue();
    }

    public String getSubName() {
        return name;
    }

    public void setValue(double income) {
        value = (percentage / 100) * income;
    }

    public double getValue() {
        return value;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public double getPercentage() {
        return percentage;
    }
}
