package edu.utsa.cs3443.project.controller;

import android.content.Intent;
import android.view.View;

import edu.utsa.cs3443.project.CategoryActivity;

public class CategoryController implements View.OnClickListener {

    CategoryActivity p;
    /**
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(p, CategoryActivity.class);
        intent.putExtra("buttonId", v.getId());
        p.startActivity(intent);

    }
}
