package edu.utsa.cs3443.project.model;

import androidx.annotation.NonNull;

public abstract class Category {
    private String name;
    public Category(String n) {
        name = n;
    }
    @Override
    public String toString() {
        return "Type: " + getName();
    }

    public String getName() {
        return name;
    }
    public abstract double getValue();
    public abstract void setValue(double newExpenseNumber);


    //public abstract void getValue();
    //public abstract void getValue(double percentage);
}
