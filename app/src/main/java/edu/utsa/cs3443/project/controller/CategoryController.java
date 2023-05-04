package edu.utsa.cs3443.project.controller;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import edu.utsa.cs3443.project.CategoryActivity;
import edu.utsa.cs3443.project.model.CategoryTracker;

public class CategoryController implements View.OnClickListener {

    private CategoryActivity categoryActivity;
    private EditText rentText, carText, cardText, foodText, savingsText, utilitiesText, childcareText, phoneText, petText, healthText, membershipText, entertainmentText, lifeText, travelText, loansText, emergencyText;
    private double rent = 0, car = 0, card = 0, food = 0, savings = 0, utilities = 0, childcare = 0, phone = 0, pet = 0, health = 0, membership = 0, entertainment = 0, life = 0, travel = 0, loans = 0, emergency = 0;
    
    public CategoryController(CategoryActivity categoryActivity, EditText rentText, EditText carText, EditText cardText, EditText foodText, EditText savingsText, EditText utilitiesText, EditText childcareText, EditText phoneText, EditText petText, EditText healthText, EditText membershipText, EditText entertainmentText, EditText lifeText, EditText travelText, EditText loansText, EditText emergencyText) {
        this.categoryActivity = categoryActivity;
        this.rentText = rentText;
        this.carText = carText;
        this.cardText = cardText;
        this.foodText = foodText;
        this.savingsText = savingsText;
        this.utilitiesText = utilitiesText;
        this.childcareText = childcareText;
        this.phoneText = phoneText;
        this.petText = petText;
        this.healthText = healthText;
        this.membershipText = membershipText;
        this.entertainmentText = entertainmentText;
        this.lifeText = lifeText;
        this.travelText = travelText;
        this.loansText = loansText;
        this.emergencyText = emergencyText;
    }
    
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(categoryActivity, CategoryActivity.class);
        categoryActivity.startActivity(intent);
    
        rent = (rentText.getText().toString().equals("")) ? 0 : Double.parseDouble(rentText.getText().toString());
        car = (carText.getText().toString().equals("")) ? 0 : Double.parseDouble(carText.getText().toString());
        card = (cardText.getText().toString().equals("")) ? 0 : Double.parseDouble(cardText.getText().toString());
        food = (foodText.getText().toString().equals("")) ? 0 : Double.parseDouble(foodText.getText().toString());
        savings = (savingsText.getText().toString().equals("")) ? 0 : Double.parseDouble(savingsText.getText().toString());
        utilities = (utilitiesText.getText().toString().equals("")) ? 0 : Double.parseDouble(utilitiesText.getText().toString());
        childcare = (childcareText.getText().toString().equals("")) ? 0 : Double.parseDouble(childcareText.getText().toString());
        phone = (phoneText.getText().toString().equals("")) ? 0 : Double.parseDouble(phoneText.getText().toString());
        pet = (petText.getText().toString().equals("")) ? 0 : Double.parseDouble(petText.getText().toString());
        health = (healthText.getText().toString().equals("")) ? 0 : Double.parseDouble(healthText.getText().toString());
        membership = (membershipText.getText().toString().equals("")) ? 0 : Double.parseDouble(membershipText.getText().toString());
        entertainment = (entertainmentText.getText().toString().equals("")) ? 0 : Double.parseDouble(entertainmentText.getText().toString());
        life = (lifeText.getText().toString().equals("")) ? 0 : Double.parseDouble(lifeText.getText().toString());
        travel = (travelText.getText().toString().equals("")) ? 0 : Double.parseDouble(travelText.getText().toString());
        loans = (loansText.getText().toString().equals("")) ? 0 : Double.parseDouble(loansText.getText().toString());
        emergency = (emergencyText.getText().toString().equals("")) ? 0 : Double.parseDouble(emergencyText.getText().toString());
    
    
        // do things with functions and given data
        CategoryTracker ct = CategoryTracker.getCategoryTrackerInstance();
        ct.addCategory("Bill", "Rent", rent);
        ct.addCategory("Bill", "Car", car);
        ct.addCategory("Bill", "Credit Card", card);
        ct.addCategory("Bill", "Food", food);
        ct.addCategory("Savings", "Savings", savings);
        ct.addCategory("Bill", "Utilities", utilities);
        ct.addCategory("Bill", "Childcare", childcare);
        ct.addCategory("Bill", "Phone", phone);
        ct.addCategory("Bill", "Pet", pet);
        ct.addCategory("Bill", "Healthcare", health);
        ct.addCategory("Bill", "Membership", membership);
        ct.addCategory("Want", "Entertainment", entertainment);
        ct.addCategory("Bill", "Life Insurance", life);
        ct.addCategory("Want", "Travel", travel);
        ct.addCategory("Bill", "Loans", loans);
        ct.addCategory("Want", "Emergency", emergency);
        
        Toast t = Toast.makeText(v.getContext(), "Values added to budget", Toast.LENGTH_SHORT);
        t.show();
    }
}
