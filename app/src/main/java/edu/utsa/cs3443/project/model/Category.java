package edu.utsa.cs3443.project.model;

import androidx.annotation.NonNull;

public abstract class Category {
    private String type;
    private String name;

    public Category(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Type: " + getType() + ", Name: " + getName() + ", Value: " + getValue();
    }

    public abstract double getValue();

    public abstract void setValue(double value);
}
