package edu.utsa.cs3443.project.model;

import android.widget.TextView;

import edu.utsa.cs3443.project.R;
import edu.utsa.cs3443.project.controller.IncomeController;

public class DataView {

    private TextView billsTotalTextView;
    private TextView incomeAfterBillsTextView;
    private TextView wantsTotalTextView;
    private TextView wantsFoodTextView;
    private TextView wantsEmergencyTextView;
    private TextView wantsRetirementTextView;
    private TextView wantsEntertainmentTextView;
    private TextView wantsClothingTextView;
    private TextView wantsTravelTextView;
    private TextView savingsTotalTextView;
    private TextView overallTotalTextView;
    CategoryTracker categoryTracker;
    IncomeController incomeController;

    public double getTotalIncome () {
        if (IncomeController.getTime() == (IncomeController.Time.YEARLY)) {
            return incomeController.getIncome() / 12;
        } else {
            return incomeController.getIncome();
        }

    }

    public double getTotalAfterBills () {
        return getTotalIncome() - getTotalBills();
    }

    public double getTotalAfterWants () {
        return getTotalIncome() - getTotalWants();
    }

    public void setBillsTotal(double total) {
        billsTotalTextView.setText(String.format("Total Bills: $%.2f", total));
    }

    public void setIncomeAfterBills(double income) {
        incomeAfterBillsTextView.setText(String.format("Income After Bills: $%.2f", income));
    }

    public void setWantsTotal(double total) {
        wantsTotalTextView.setText(String.format("Total Wants: $%.2f", total));
    }

    public void setWantsFoodTotal(double total) {
        wantsFoodTextView.setText(String.format("Food: $%.2f", total));
    }

    public void setWantsEmergencyTotal(double total) {
        wantsEmergencyTextView.setText(String.format("Emergency: $%.2f", total));
    }

    public void setWantsRetirementTotal(double total) {
        wantsRetirementTextView.setText(String.format("Retirement: $%.2f", total));
    }

    public void setWantsEntertainmentTotal(double total) {
        wantsEntertainmentTextView.setText(String.format("Entertainment: $%.2f", total));
    }

    public void setWantsClothingTotal(double total) {
        wantsEntertainmentTextView.setText(String.format("Clothing: $%.2f", total));
    }

    public void setWantsTravelTotal(double total) {
        wantsEntertainmentTextView.setText(String.format("Travel: $%.2f", total));
    }

    public void setSavingsTotal(double total) {
        wantsEntertainmentTextView.setText(String.format("Savings: $%.2f", total));
    }
    public void updateWantsTotalTextView(double total) {
        setWantsTotal(total);
    }

    public void updateWantsFoodTextView(double total) {
        setWantsFoodTotal(total);
    }

    public void updateWantsEmergencyTextView(double total) {
        setWantsEmergencyTotal(total);
    }

    public void updateWantsRetirementTextView(double total) {
        setWantsRetirementTotal(total);
    }

    public void updateWantsEntertainmentTextView(double total) {
        setWantsEntertainmentTotal(total);
    }

    public void updateWantsClothingTextView(double total) {
        setWantsClothingTotal(total);
    }

    public void updateWantsTravelTextView(double total) {
        setWantsTravelTotal(total);
    }

    public void updateSavingsTotalTextView(double total) {
        setSavingsTotal(total);
    }

    public void updateOverallTotalTextView(double total) {
        overallTotalTextView.setText(String.format("Total Budget: $%.2f", total));
    }
    public void updateBillsTotalTextView(double total) {
        billsTotalTextView.setText(String.format("Total Bills: $%.2f", total));
    }

    public void updateIncomeAfterBillsTextView(double income) {
        incomeAfterBillsTextView.setText(String.format("Income After Bills: $%.2f", income));
    }


}