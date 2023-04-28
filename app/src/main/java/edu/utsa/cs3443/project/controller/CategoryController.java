package edu.utsa.cs3443.project.controller;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;

import edu.utsa.cs3443.project.CategoryActivity;

public class CategoryController implements View.OnClickListener {

    CategoryActivity p;
    double rent = 0, car = 0, card = 0, food = 0, savings = 0;
    
    public CategoryController(double rent, double car, double card, double food, double savings) {
        this.rent = rent;
        this.car = car;
        this.card = card;
        this.food = food;
        this.savings = savings;
    }
    
    /**
     * @param v The view that was clicked.
     */
    
    
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(p, CategoryActivity.class);
        p.startActivity(intent);
    
        // do things with functions and given data

    }
}
