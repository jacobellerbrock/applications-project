package edu.utsa.cs3443.project.model;

import androidx.annotation.NonNull;

import edu.utsa.cs3443.project.controller.IncomeController;

public class Savings extends Category {

    private String name;
    private double percentage;
    private double value;

    public Savings(String type, String name, double p) {
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

    public void setValue(double income, IncomeController.Time time) {
        if (time == IncomeController.Time.MONTHLY)
            value = (getPercentage() / 100) * income;
        else
            value = (income / 12) * (getPercentage() / 100);
    }


    public double getValue() {
        return value;
    }

    @Override
    public void setValue(double value) {
        this.value = value;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public double getPercentage() {
        return percentage;
    }
}
