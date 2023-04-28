package edu.utsa.cs3443.project.controller;

import android.content.Intent;
import android.view.View;

import edu.utsa.cs3443.project.CategoryActivity;
import edu.utsa.cs3443.project.DataActivity;
import edu.utsa.cs3443.project.IncomeActivity;
import edu.utsa.cs3443.project.MainActivity;
import edu.utsa.cs3443.project.R;

public class MainController implements View.OnClickListener {
    MainActivity mainActivity;
    
    public MainController(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }
    
    /**
     * @param v The view that was clicked.
     */
    
    

    public void onClick(View v) {
        Intent intent = null;
        switch(v.getId()) {
            case R.id.Paymentbutton:
                intent = new Intent(mainActivity, CategoryActivity.class);
                break;
            case R.id.IncomeButton:
                intent = new Intent(mainActivity, IncomeActivity.class);
                break;
            case R.id.BudgetButton:
                intent = new Intent(mainActivity, DataActivity.class);
        }
        assert intent != null;
        mainActivity.startActivityForResult(intent, MainActivity.REQUEST_CODE);
    }
}
