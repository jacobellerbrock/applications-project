package edu.utsa.cs3443.project.controller;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

import edu.utsa.cs3443.project.R;
import edu.utsa.cs3443.project.model.CategoryTracker;
import edu.utsa.cs3443.project.model.Savings;
import edu.utsa.cs3443.project.controller.IncomeController;



public abstract class DataController implements View.OnClickListener {

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

        public double getSavingsValue() {
            return categoryTracker.getSavings().getValue();
        }

    public double getTotalIncome() {
        if (IncomeController.getTime().equals(IncomeController.Time.YEARLY)) {
            return incomeController.getIncome() / 12;
        } else {
            return incomeController.getIncome();
        }

    }
        public double getTotal() {
            return getTotalIncome() - getTotalBills() - getTotalWants() - getSavingsValue();
        }

    private void updateTotals() {
        DecimalFormat currencyFormatter = new DecimalFormat("#0.00");

        double billsTotal = categoryTracker.getTotalBills();
        double wantsTotal = categoryTracker.getTotalWants();
        double savingsTotal = categoryTracker.getSavings().getValue();
        double overallTotal = billsTotal + wantsTotal + savingsTotal;

        // Update TextViews
        billsTotalTextView.setText("Bills total: $" + currencyFormatter.format(billsTotal));
        wantsTotalTextView.setText("Wants total: $" + currencyFormatter.format(wantsTotal));
        savingsTotalTextView.setText("Savings total: $" + currencyFormatter.format(savingsTotal));
        overallTotalTextView.setText("Total: $" + currencyFormatter.format(overallTotal));
    }
}
