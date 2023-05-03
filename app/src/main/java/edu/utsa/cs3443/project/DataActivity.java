package edu.utsa.cs3443.project;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import edu.utsa.cs3443.project.controller.BackButtonController;
import edu.utsa.cs3443.project.controller.DataController;
import edu.utsa.cs3443.project.model.DataView;

public class DataActivity extends AppCompatActivity {

        private DataController dataController;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                View view = getLayoutInflater().inflate(R.layout.activity_data_display, null);

                // Initialize DataController
                DataView dataView = new DataView(view);
                this.dataController = new DataController(dataView);


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
