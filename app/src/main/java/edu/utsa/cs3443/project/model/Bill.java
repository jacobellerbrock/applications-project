package edu.utsa.cs3443.project.model;

import androidx.annotation.NonNull;

public class Bill extends Category {

    private String name;
    private double value;

    public Bill(String type, String name, double v) {
        super(type);
        this.name = name;
        value = v;
    }

    @NonNull
    @Override
    public String toString() {
        return  super.toString() + " Name: " + getName() + " Value: " + getValue();
    }

    public String getSubName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    @Override
    public void setValue(double newExpenseNumber) {
        value = newExpenseNumber;
    }
}
