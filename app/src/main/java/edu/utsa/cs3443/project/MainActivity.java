package edu.utsa.cs3443.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import edu.utsa.cs3443.project.controller.MainController;

public class MainActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ViewPaymentsButton = findViewById(R.id.Paymentbutton);
        Button IncomeButton = findViewById(R.id.IncomeButton);
        Button DataButton = findViewById(R.id.DataButton);

        ViewPaymentsButton.setOnClickListener(new MainController());
        IncomeButton.setOnClickListener(new MainController());
        DataButton.setOnClickListener(new MainController());
    }
}