package edu.utsa.cs3443.project.controller;

import android.app.Activity;
import android.content.Intent;

import edu.utsa.cs3443.project.MainActivity;
import edu.utsa.cs3443.project.model.DataView;
import edu.utsa.cs3443.project.model.CategoryTracker;

import java.text.DecimalFormat;

public class DataController {

    private CategoryTracker categoryTracker;
    private DataView dataView;
    private DecimalFormat df;

    public DataController(DataView dataView) {
        this.dataView = dataView;
        this.categoryTracker = CategoryTracker.getCategoryTrackerInstance();
        this.df = new DecimalFormat("0.00");
    }

    public void updateDataView() {
        double billsTotal = categoryTracker.getTotalBills();
        double incomeAfterBills = dataView.getTotalIncome() - billsTotal;
        double wantsTotal = categoryTracker.getTotalWants();
        double wantsFoodTotal = categoryTracker.getCategoryVal("Want", "Food");
        double wantsEmergencyTotal = categoryTracker.getCategoryVal("Want", "Emergency");
        double wantsRetirementTotal = categoryTracker.getCategoryVal("Want", "Retirement");
        double wantsEntertainmentTotal = categoryTracker.getCategoryVal("Want", "Entertainment");
        double wantsClothingTotal = categoryTracker.getCategoryVal("Want", "Clothing");
        double wantsTravelTotal = categoryTracker.getCategoryVal("Want", "Travel");
        double savingsTotal = categoryTracker.getCategoryVal("Savings", "Savings");
        double overallTotal = incomeAfterBills - savingsTotal - wantsTotal;

        dataView.updateBillsTotalTextView(billsTotal);
        dataView.updateIncomeAfterBillsTextView(incomeAfterBills);
        dataView.updateWantsTotalTextView(wantsTotal);
        dataView.updateWantsFoodTextView(wantsFoodTotal);
        dataView.updateWantsEmergencyTextView(wantsEmergencyTotal);
        dataView.updateWantsRetirementTextView(wantsRetirementTotal);
        dataView.updateWantsEntertainmentTextView(wantsEntertainmentTotal);
        dataView.updateWantsClothingTextView(wantsClothingTotal);
        dataView.updateWantsTravelTextView(wantsTravelTotal);
        dataView.updateSavingsTotalTextView(savingsTotal);
        dataView.updateOverallTotalTextView(overallTotal);

    }
}
