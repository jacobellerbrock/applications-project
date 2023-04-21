package edu.utsa.cs3443.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import edu.utsa.cs3443.project.controller.DataController;

public class DataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_display);

        Button backtomenubutton = findViewById(R.id.BackButton);
        backtomenubutton.setOnClickListener(new DataController());
    }
}