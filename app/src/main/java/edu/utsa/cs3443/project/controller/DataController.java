package edu.utsa.cs3443.project.controller;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.DecimalFormat;

import edu.utsa.cs3443.project.model.Category;
import edu.utsa.cs3443.project.model.CategoryTracker;


public abstract class DataController {

    private CategoryTracker categoryTracker;
    private TextView billsTotalTextView;
    private TextView wantsTotalTextView;
    private TextView savingsTotalTextView;
    private TextView overallTotalTextView;
    private IncomeController incomeController;


        public DataController(CategoryTracker categoryTracker) {
            this.categoryTracker = categoryTracker;
        }

        public double getTotalBills() {
            return categoryTracker.getTotalBills();
        }

        public double getTotalWants() {
            return categoryTracker.getTotalWants();
        }

        public Category getSavingsValue() {
            return categoryTracker.getCategory("Savings", "Savings");
        }

    public double getTotalIncome() {
        if (IncomeController.getTime().equals(IncomeController.Time.YEARLY)) {
            return incomeController.getIncome() / 12;
        } else {
            return incomeController.getIncome();
        }

    }
        public double getTotalAfterBills() {
            return getTotalIncome() - getTotalBills();
        }
        public double getTotalAfterWants() {
            return getTotalIncome() - getTotalWants();
        }
        
        
    private void updateTotals() {
        DecimalFormat currencyFormatter = new DecimalFormat("#0.00");

        double billsTotal = categoryTracker.getTotalBills();
        double wantsTotal = categoryTracker.getTotalWants();
        double wantsVal = categoryTracker.getWants().getValue();
        double savingsTotal = categoryTracker.getSavings().getValue();
        double overallTotal = billsTotal + wantsTotal + savingsTotal;

        // Update TextViews
        billsTotalTextView.setText("Bills total: $" + currencyFormatter.format(billsTotal));
        wantsTotalTextView.setText("Wants total: $" + currencyFormatter.format(wantsTotal));
        savingsTotalTextView.setText("Savings total: $" + currencyFormatter.format(savingsTotal));
        overallTotalTextView.setText("Total: $" + currencyFormatter.format(overallTotal));
    }

    public abstract void onClick(View v);

    protected void onCreate(Bundle savedInstanceState) {
    }
}
