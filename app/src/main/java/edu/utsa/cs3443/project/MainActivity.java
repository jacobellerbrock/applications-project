package edu.utsa.cs3443.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import edu.utsa.cs3443.project.controller.MainController;

public class MainActivity extends AppCompatActivity {
    
    public static final int REQUEST_CODE = 0;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button PaymentButton = findViewById(R.id.Paymentbutton),
                IncomeButton = findViewById(R.id.IncomeButton),
                BudgetButton = findViewById(R.id.BudgetButton);

        PaymentButton.setOnClickListener(new MainController(this));
        IncomeButton.setOnClickListener(new MainController(this));
        BudgetButton.setOnClickListener(new MainController(this));
    }
}