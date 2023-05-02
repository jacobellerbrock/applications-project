package edu.utsa.cs3443.project;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;
import java.util.List;

import edu.utsa.cs3443.project.controller.BackButtonController;
import edu.utsa.cs3443.project.controller.DataController;
import edu.utsa.cs3443.project.model.CategoryTracker;
import edu.utsa.cs3443.project.model.Want;

public class DataActivity extends AppCompatActivity {

    private TextView billsTotalTextView;
    private TextView wantsTotalTextView;
    private TextView savingsTotalTextView;
    private TextView overallTotalTextView;
    private DataController dataController;
    private Want want;
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
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_data_display);

                Button menuButton = findViewById(R.id.backtomenu_button);
                BackButtonController backButtonController = new BackButtonController(DataActivity.this);

                menuButton.setOnClickListener(backButtonController);
            }
        };

        // Update TextViews with category and total values
        DecimalFormat currencyFormatter = new DecimalFormat("#0.00");
        double billsTotal = dataController.getTotalBills();
        double wantsTotal = dataController.getTotalWants();
        double wantsVal = dataController.getWantsValue().getValue();
        double savingsTotal = dataController.getSavingsValue().getValue();
        double overallTotal = dataController.getTotalAfterBills();

        billsTotalTextView.setText("Total Bills: $" + currencyFormatter.format(billsTotal));
        wantsTotalTextView.setText("Wants total: $" + currencyFormatter.format(wantsTotal));
        savingsTotalTextView.setText("Savings total: $" + currencyFormatter.format(savingsTotal));

        // Display a list of wants and savings
        TextView wantsTextView = findViewById(R.id.wants_textview);
        StringBuilder wantsStringBuilder = new StringBuilder("Wants:\n");
        List<Want> wantsList = (List<Want>) categoryTracker.wants;

        for (Want want : wantsList) {
            wantsStringBuilder.append(want.toString()).append("\n");
        }


        TextView wantsTotalTextView = findViewById(R.id.wants_total_textview);
        wantsTotalTextView.setText("Wants Total: $" + currencyFormatter.format(wantsTotal) + "\n" + wantsStringBuilder.toString());
        wantsTextView.setText(getString(R.string.wants_text) + wantsStringBuilder.toString());

        overallTotalTextView.setText("Income After Bills: $" + currencyFormatter.format(overallTotal));
    }

}
