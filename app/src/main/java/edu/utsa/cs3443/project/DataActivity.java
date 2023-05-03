package edu.utsa.cs3443.project;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import edu.utsa.cs3443.project.controller.BackButtonController;
import edu.utsa.cs3443.project.controller.DataController;
import edu.utsa.cs3443.project.model.DataView;

public class DataActivity extends AppCompatActivity {

        private DataController dataController;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);

                // Initialize DataController
                DataView dataView = new DataView();
                this.dataController = new DataController(dataView);
        
                TextView billsTotalTextView = findViewById(R.id.bills_total_textview);
                TextView incomeAfterBillsTextView = findViewById(R.id.income_after_bills_textview);
                TextView wantsTotalTextView = findViewById(R.id.wants_total_textview);
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

        @Override
        protected void onResume() {
                super.onResume();

                // Update UI elements using DataController
                dataController.updateDataView();
        }
}
