package edu.utsa.cs3443.project;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import edu.utsa.cs3443.project.controller.BackButtonController;

public class DataActivity extends AppCompatActivity {
        
        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                
                TextView billsTotalTextView = findViewById(R.id.bills_total_textview);
                TextView incomeAfterBillsTextView = findViewById(R.id.income_after_bills_textview);
                TextView wantsFoodTextView = findViewById(R.id.wants_textview_food);
                TextView wantsEmergencyTextView = findViewById(R.id.wants_textview_emergency);
                TextView wantsRetirementTextView = findViewById(R.id.wants_textview_retirement);
                TextView wantsEntertainmentTextView = findViewById(R.id.wants_textview_entertainment);
                TextView wantsClothingTextView = findViewById(R.id.wants_textview_clothing);
                TextView wantsTravelTextView = findViewById(R.id.wants_textview_travel);
                TextView savingsTotalTextView = findViewById(R.id.savings_total_textview);
                TextView overallTotalTextView = findViewById(R.id.overall_total_textview);
                
                // Set up back button
                BackButtonController backButtonController = new BackButtonController(this);
                findViewById(R.id.back_to_main_menu_data).setOnClickListener(backButtonController);
        }
}
