package edu.utsa.cs3443.project.model;

public class IncomeCategory extends Category {

    private double value;

    public IncomeCategory(String type, String name, double value) {
        super(type, name);
        this.value = value;
    }

    @Override
    public double getValue() {
        return value;
    }

    @Override
    public void setValue(double value) {
        this.value = value;
    }
}

