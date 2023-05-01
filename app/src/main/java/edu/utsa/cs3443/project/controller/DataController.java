package edu.utsa.cs3443.project.controller;

import edu.utsa.cs3443.project.model.CategoryTracker;

public class DataController {

    private CategoryTracker categoryTracker;

    private static DataController dataController;

    private DataController() {
        categoryTracker = CategoryTracker.getCategoryTrackerInstance();
    }

    public static DataController getDataControllerInstance() {
        if (dataController == null) {
            dataController = new DataController();
        }
        return dataController;
    }

    public void addCategory(String type, String name, double value) {
        categoryTracker.addCategory(type, name, value);
    }

    public double getCategoryValue(String type, String name) {
        return categoryTracker.getCategoryValue(type, name);
    }

    public void setCategoryValue(String type, String name, double value) {
        categoryTracker.setCategoryValue(type, name, value);
    }

    public double getCategoryIncome(String name) {
        return categoryTracker.getCategoryIncome(name);
    }

    public double getCategoryExpense(String name) {
        return categoryTracker.getCategoryExpense(name);
    }
}
