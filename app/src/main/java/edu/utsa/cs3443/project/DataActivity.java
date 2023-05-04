package edu.utsa.cs3443.project;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import edu.utsa.cs3443.project.controller.BackButtonController;
import edu.utsa.cs3443.project.controller.IncomeController;
import edu.utsa.cs3443.project.model.CategoryTracker;

public class DataActivity extends AppCompatActivity {


        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_data_display);
        
                System.out.println("Income: " + IncomeController.getIncome());
        
                TextView billsTotalTextView = findViewById(R.id.bills_total_textview);
                TextView incomeAfterBillsTextView = findViewById(R.id.income_after_bills_textview);
                TextView wantsEmergencyTextView = findViewById(R.id.wants_textview_emergency);
                TextView wantsEntertainmentTextView = findViewById(R.id.wants_textview_entertainment);
                TextView wantsTravelTextView = findViewById(R.id.wants_textview_travel);
                TextView savingsTotalTextView = findViewById(R.id.savings_total_textview);
                TextView overallTotalTextView = findViewById(R.id.overall_total_textview);

                CategoryTracker ct = CategoryTracker.getCategoryTrackerInstance();
                
                if (ct.getCategory("Want", "Emergency") == null) throw new AssertionError("found null");
                
                //updates wants values depending on the income
                ct.getCategory("Want", "Emergency").setValue(IncomeController.getIncome() - ct.getTotalBills());
                ct.getCategory("Want", "Entertainment").setValue(IncomeController.getIncome() - ct.getTotalBills());
                ct.getCategory("Want", "Travel").setValue(IncomeController.getIncome() - ct.getTotalBills());
                ct.getCategory("Savings", "Savings").setValue(IncomeController.getIncome() - ct.getTotalBills());

                //updates the textviews
                billsTotalTextView.setText("Total Bills: " + ct.getTotalBills());
                incomeAfterBillsTextView.setText("Remaining Income After Bills Removed: " + (IncomeController.getIncome() - ct.getTotalBills()));
                wantsEmergencyTextView.setText("Amount allocated for Emergency: " + ct.getCategory("Want", "Emergency").getValue());
                if (ct.getCategory("Want", "Entertainment") == null) throw new AssertionError("Entertainment is null");
                wantsEntertainmentTextView.setText("Amount allocated for Entertainment: " + ct.getCategory("Want", "Entertainment").getValue());
                wantsTravelTextView.setText("Amount allocated for Travel: " + ct.getCategory("Want", "Travel").getValue());
                savingsTotalTextView.setText("Amount allocated for Savings: " + ct.getCategory("Savings", "Savings").getValue());
                overallTotalTextView.setText("Amount left: " + (IncomeController.getIncome() - ct.getTotalBills() - ct.getTotalWants() - ct.getTotalSavings()));

                // Set up back button
                BackButtonController backButtonController = new BackButtonController(this);
                findViewById(R.id.back_to_main_menu_data).setOnClickListener(backButtonController);
        }

//        public void updateTextViews(TextView billsTotalTextView, TextView incomeAfterBillsTextView, TextView wantsTotalTextView,
//        TextView wantsFoodTextView, TextView wantsEmergencyTextView, TextView wantsRetirementTextView, TextView wantsEntertainmentTextView,
//        TextView wantsClothingTextView, TextView wantsTravelTextView, TextView savingsTotalTextView, TextView overallTotalTextView) {
//                billsTotalTextView
//        }
}
