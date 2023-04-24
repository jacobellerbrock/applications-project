package edu.utsa.cs3443.project.controller;

import android.content.Intent;
import android.view.View;

import edu.utsa.cs3443.project.IncomeActivity;

public class IncomeController implements View.OnClickListener {

    IncomeActivity income;
    /**
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(income, IncomeActivity.class);
        intent.putExtra("buttonid", v.getId());
        income.startActivity(intent);

    }
}
