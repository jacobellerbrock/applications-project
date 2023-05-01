package edu.utsa.cs3443.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

import edu.utsa.cs3443.project.controller.DataController;
import edu.utsa.cs3443.project.controller.IncomeController;
import edu.utsa.cs3443.project.model.CategoryTracker;

public class DataActivity extends AppCompatActivity {

    private TextView billsTotalTextView;
    private TextView wantsTotalTextView;
    private TextView savingsTotalTextView;
    private TextView overallTotalTextView;
    private DataController dataController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_display);

        // Initialize TextViews
        billsTotalTextView = findViewById(R.id.bills_total_textview);
        wantsTotalTextView = findViewById(R.id.wants_total_textview);
        savingsTotalTextView = findViewById(R.id.savings_total_textview);
        overallTotalTextView = findViewById(R.id.overall_total_textview);

        // Initialize DataController
        CategoryTracker categoryTracker = CategoryTracker.getCategoryTrackerInstanace();
        dataController = new DataController(categoryTracker) {
            @Override
            public void onClick(View v) {
                // No action needed
            }
        };

        // Update TextViews with category and total values
        DecimalFormat currencyFormatter = new DecimalFormat("#0.00");
        double billsTotal = dataController.getTotalBills();
        double wantsTotal = dataController.getTotalWants();
        double savingsTotal = dataController.getSavingsValue();
        double overallTotal = billsTotal + wantsTotal + savingsTotal;

        billsTotalTextView.setText("Bills total: $" + currencyFormatter.format(billsTotal));
        wantsTotalTextView.setText("Wants total: $" + currencyFormatter.format(wantsTotal));
        savingsTotalTextView.setText("Savings total: $" + currencyFormatter.format(savingsTotal));
        overallTotalTextView.setText("Total: $" + currencyFormatter.format(overallTotal));
    }

    public void onBackButtonClick(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

