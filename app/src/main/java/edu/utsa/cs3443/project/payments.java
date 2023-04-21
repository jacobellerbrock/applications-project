package edu.utsa.cs3443.project;


import androidx.annotation.NonNull;

public class payments {

    int OneTimePayment = 0;
    int recurringPayment;
    String description, date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getOneTimePayment() {
        return OneTimePayment;
    }

    public void setOneTimePayment(int oneTimePayment) {
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
        //Cost \t + Name of charge (item name or company) \t + Date

    }

    public payments (String description, int OneTimePayment, int recurringPayment, String date) {
        this.description = description;
        this.OneTimePayment = OneTimePayment;
        this.recurringPayment = recurringPayment;
        this.date = date;
    }

}
