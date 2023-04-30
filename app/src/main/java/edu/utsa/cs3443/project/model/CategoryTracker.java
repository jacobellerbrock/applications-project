package edu.utsa.cs3443.project.model;

import java.util.HashMap;
import java.util.Map;

public class CategoryTracker {

    private Map<String, Map<String, Category>> categories;

    private static CategoryTracker categoryTracker;

    private CategoryTracker() {
        categories = new HashMap<>();
    }

    public static CategoryTracker getCategoryTrackerInstance() {
        if (categoryTracker == null) {
            categoryTracker = new CategoryTracker();
        }
        return categoryTracker;
    }

    public void addCategory(String type, String name, double value) {
        if (!categories.containsKey(type)) {
            categories.put(type, new HashMap<>());
        }
        Category category;
        if (type.equals("Income")) {
            category = new IncomeCategory(type, name, value);
        } else if (type.equals("Bill")) {
            category = new Bill(type, name, value);
        } else if (type.equals("Savings")) {
            category = new Savings(type, name, value);
        } else {
            category = new Want(type, name, value);
        }
        categories.get(type).put(name, category);
    }

    public double getCategoryValue(String type, String name) {
        if (categories.containsKey(type) && categories.get(type).containsKey(name)) {
            return categories.get(type).get(name).getValue();
        }
        return -1;
    }

    public void setCategoryValue(String type, String name, double value) {
        if (categories.containsKey(type) && categories.get(type).containsKey(name)) {
            categories.get(type).get(name).setValue(value);
        }
    }

    public double getCategoryIncome(String name) {
        return getCategoryValue("Income", name);
    }

    public double getCategoryExpense(String name) {
        double totalExpense = 0;
        for (String type : categories.keySet()) {
            if (!type.equals("Income")) {
                totalExpense += getCategoryValue(type, name);
            }
        }
        return totalExpense;
    }
}
