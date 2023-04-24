package edu.utsa.cs3443.project;


import androidx.annotation.NonNull;

public class payments {

    boolean OneTimePayment = true;
    int recurringPayment;

    double cost;

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    String description, date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void getOneTimePayment() {
        return;
    }

    public void setOneTimePayment(boolean oneTimePayment) {
        OneTimePayment = oneTimePayment;
    }

    public int getRecurringPayment() {
        return recurringPayment;
    }

    public void setRecurringPayment(int recurringPayment) {
        this.recurringPayment = recurringPayment;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @NonNull
    @Override
    public String toString() {
        //return formatted description of payments;
        //An example would be like:
        // Cost \t + Name of charge (item name or company) \t + Date
        //decide how to display if item was a one time or recurring payment
        return("date: " + date + "description: " + description + "cost: " + cost);

    }

    public payments (String description, boolean OneTimePayment, int recurringPayment, String date) {
        this.description = description;
        this.OneTimePayment = OneTimePayment;
        this.recurringPayment = recurringPayment;
        this.date = date;
    }

}
