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
                savings= findViewById(R.id.Savings_input),
                utilities = findViewById(R.id.Utilities_input),
                childcare = findViewById(R.id.ChildcareSchool_Input),
                phone = findViewById(R.id.PhonePayment_input),
                pet = findViewById(R.id.Pet_input),
                health = findViewById(R.id.HealthInsurance_input),
                membership = findViewById(R.id.Membership_input),
                entertainment = findViewById(R.id.Percent_Entertainment_input),
                life = findViewById(R.id.LifeInsurnace_input),
                travel = findViewById(R.id.Percent_Travel_input),
                loans = findViewById(R.id.StudentLoans_input),
                emergency = findViewById(R.id.Percent_Emergency_input);
        
        Button calculateButton = findViewById(R.id.calculateButton);
        CategoryController categoryController = new CategoryController(this, rent, car, card, food, savings, utilities, childcare, phone, pet, health, membership, entertainment, life, travel, loans, emergency);
        calculateButton.setOnClickListener(categoryController);
    
    
        //payments class will have one time and recurring expenses (possibly through user input)
        //some kind of data structure to add, delete, modify, and traverse through payments
    }
}
