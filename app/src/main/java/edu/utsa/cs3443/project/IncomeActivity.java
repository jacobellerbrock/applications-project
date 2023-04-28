package edu.utsa.cs3443.project;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Scanner;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

import edu.utsa.cs3443.project.controller.BackButtonController;
import edu.utsa.cs3443.project.controller.CategoryController;
import edu.utsa.cs3443.project.controller.IncomeController;
import edu.utsa.cs3443.project.controller.SwitchController;


public class IncomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_income);
    
        Button menuButton = findViewById(R.id.backtomenu_button);
        BackButtonController backButtonController = new BackButtonController(this);
        menuButton.setOnClickListener(backButtonController);
    
        Switch monthYearSwitch = findViewById(R.id.monthYearSwitch);
        SwitchController switchController = new SwitchController(monthYearSwitch);
        monthYearSwitch.setOnClickListener(switchController);
        EditText incomeText = findViewById(R.id.input_income);
    
        Button calculateButton = findViewById(R.id.calculate_button);
        IncomeController incomeController = new IncomeController(monthYearSwitch, incomeText, this);
        calculateButton.setOnClickListener(incomeController);
    }
}