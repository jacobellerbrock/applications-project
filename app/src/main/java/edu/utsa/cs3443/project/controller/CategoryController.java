package edu.utsa.cs3443.project.controller;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import edu.utsa.cs3443.project.CategoryActivity;
import edu.utsa.cs3443.project.model.CategoryTracker;

public class CategoryController implements View.OnClickListener {

    private CategoryActivity categoryActivity;
    private EditText rentText, carText, cardText, foodText, savingsText;
    private double rent = 0, car = 0, card = 0, food = 0, savings = 0;
    
    public CategoryController(EditText rentText, EditText carText, EditText cardText, EditText foodText, EditText savingsText, CategoryActivity categoryActivity) {
        this.rentText = rentText;
        this.carText = carText;
        this.cardText = cardText;
        this.foodText = foodText;
        this.savingsText = savingsText;
        this.categoryActivity = categoryActivity;
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
    
        // do things with functions and given data
        CategoryTracker ct = CategoryTracker.getCategoryTrackerInstanace();
        ct.addCategory("Bill", "Rent", rent);
        ct.addCategory("Bill", "Car", car);
        ct.addCategory("Bill", "Credit Card", card);
        ct.addCategory("Bill", "Food", food);
        ct.addCategory("Savings", "Savings", food);
        
        Toast t = Toast.makeText(v.getContext(), "Values added to budget", Toast.LENGTH_SHORT);
        t.show();
    }
}
