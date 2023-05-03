package edu.utsa.cs3443.project.model;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import edu.utsa.cs3443.project.controller.IncomeController;

public class CategoryTracker {

    private HashMap<String,Category> bills;
    public HashMap<String,Category> wants;
    private Category savings;
    private static CategoryTracker categoryTracker = null;

    public CategoryTracker() {
        bills = new HashMap<>();
        wants = new HashMap<>();
        savings = null;
    }

    public static CategoryTracker getCategoryTrackerInstanace() {
        if (categoryTracker == null) {
            categoryTracker = new CategoryTracker();
        }
        return categoryTracker;
    }
    
    public void addCategory(String type, String name, double value) {
        switch(type) {
            case "Bill": bills.put(name, new Bill(type, name, value)); break;
            case "Want": wants.put(name, new Want(type, name, value)); break;
            case "Savings": this.savings = new Savings(type, name, value); break;
            default:
                System.out.println("AddCategory: Not a valid option");
        }
    }
    public Category getCategory(String type, String name) {
        switch(type) {
            case "Bill": return bills.get(name);
            case "Want": return wants.get(name);
            case "Savings": return this.savings;
            default:
                System.out.println("GetCategory: Not a valid option"); return null;
        }
    }

    public double getCategoryVal(String type, String name) {
        switch(type) {
            case "Bill": return bills.get(name).getValue();
            case "Want": return wants.get(name).getValue();
            case "Savings": return this.savings.getValue();
            default:
                System.out.println("GetCategoryVal: Not a valid option"); return 0;
        }
    }
    public String getCategoryName(String type, String name) {
        switch(type) {
            case "Bill": return bills.get(name).getName();
            case "Want": return wants.get(name).getName();
            case "Savings": return this.savings.getName();
            default:
                return "GetCategoryVal: Not a valid option";
        }
    }
    public void updateExpense(String type, String name, double newExpenseNumber){
        switch(type) {
            case "Bill": bills.get(name).setValue(newExpenseNumber);
            case "Want": wants.get(name).setValue(newExpenseNumber);
            case "Savings": this.savings.setValue(newExpenseNumber);
            default:
                System.out.println("UpdateExpense: Not a valid option");
        }
    }
    public double getTotalBills() {
        double total = 0;
        for (Category temp : bills.values())
            total+= temp.getValue();
        return total;
    }

    public double getTotalWants() {
        double total = 0;
        for (Category temp : wants.values())
            total+= temp.getValue();
        return total;
    }

    public double getWantsVal() {
        double val = 0;
         wants.values();
        return val;
    }
    @NonNull
    @Override
    public String toString() {
        String str = "Full Budget:\n";
        for (Category temp : bills.values())
            str+= temp.toString() + "\n";
        for (Category temp : wants.values())
            str+= temp.toString() + "\n";
        str+= savings.toString();
        return str;
    }
    public HashMap<String, Category> getBills() {
        return bills;
    }

    public HashMap<String, Category> getWants() {
        return wants;
    }

    public Category getSavings() {
        return savings;
    }
    /**
     * this method just test to make sure all the model class are running smoothly without using the app for implementation
     * @param args
     */
    public static void main(String[] args) {
        //test all classes here
        Scanner input = new Scanner(System.in);
        CategoryTracker test = new CategoryTracker();
        double testIncome = 1200;
        //all the prompts for the bills
        System.out.println("Enter Housing/Rent: ");
        test.addCategory("Bill", "Housing/Rent", input.nextDouble());
        System.out.println("Enter Car Insurance/Payments: ");
        test.addCategory("Bill", "Car Insurance/Payments", input.nextDouble());
        System.out.println("Enter Utilities: ");
        test.addCategory("Bill", "Utilities", input.nextDouble());
        System.out.println("Enter Cell Phone Payments: ");
        test.addCategory("Bill", "Cell Phone Payments", input.nextDouble());
        System.out.println("Enter Childcare/School: ");
        test.addCategory("Bill", "Childcare/School", input.nextDouble());
        System.out.println("Enter Pet Food/Care/Insurance: ");
        test.addCategory("Bill", "Pet Food/Care/Insurance", input.nextDouble());
        System.out.println("Enter Health Insurance: ");
        test.addCategory("Bill", "Health Insurance", input.nextDouble());
        System.out.println("Enter Memberships/Subscriptions: ");
        test.addCategory("Bill", "Memberships/Subscriptions", input.nextDouble());
        System.out.println("Enter Life Insurance: ");
        test.addCategory("Bill", "Life Insurance", input.nextDouble());
        System.out.println("Enter Homeowners/Renters Insurance: ");
        test.addCategory("Bill", "Homeowners/Renters Insurance", input.nextDouble());
        System.out.println("Enter Student Loans: ");
        test.addCategory("Bill", "Student Loans", input.nextDouble());
        System.out.println("Enter Credit Card Payments: ");
        test.addCategory("Bill", "Credit Card Payments", input.nextDouble());
        //all the prompts for the wants
        System.out.println("Enter percentage for Food: ");
        test.addCategory("Want", "Food", input.nextDouble());
        System.out.println("Enter percentage for your Emergency Fund: ");
        test.addCategory("Want", "Emergency Fund", input.nextDouble());
        System.out.println("Enter percentage for your Retirement: ");
        test.addCategory("Want", "Retirement", input.nextDouble());
        System.out.println("Enter percentage for Entertainment: ");
        test.addCategory("Want", "Entertainment", input.nextDouble());
        System.out.println("Enter percentage for Clothing and Personal Upkeep: ");
        test.addCategory("Want", "Clothing and Personal Upkeep", input.nextDouble());
        System.out.println("Enter percentage for Travel: ");
        test.addCategory("Want", "Travel", input.nextDouble());
        //prompt for savings
        System.out.println("Enter percentage for Savings: ");
        test.addCategory("Savings", "Savings", input.nextDouble());
        //setting values of percentage categories (will be done in the controllers/activity classes
        for (Category temp: test.getWants().values())
            temp.setValue(1200);
        test.getSavings().setValue(1200);
        //testing the toString method
        test.toString();
    }
}
