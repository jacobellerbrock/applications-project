package edu.utsa.cs3443.project;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import edu.utsa.cs3443.project.controller.BackButtonController;
import edu.utsa.cs3443.project.controller.CategoryController;

public class CategoryActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
    
        Button menuButton = findViewById(R.id.backtomenu_button_payment);
        BackButtonController backButtonController = new BackButtonController(this);
        menuButton.setOnClickListener(backButtonController);
    
        EditText rent = findViewById(R.id.RentOrMortgageInput),
                car = findViewById(R.id.CarPayment_input),
                card = findViewById(R.id.CreditCard_Input),
                food = findViewById(R.id.Food_input),
                savings= findViewById(R.id.Savings_input);
        
        Button calculateButton = findViewById(R.id.calculateButton);
        CategoryController categoryController = new CategoryController(this, car, card, food, savings);
        calculateButton.setOnClickListener(categoryController);
    
    
        //payments class will have one time and recurring expenses (possibly through user input)
        //some kind of data structure to add, delete, modify, and traverse through payments
    }
}
