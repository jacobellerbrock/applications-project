package edu.utsa.cs3443.project.controller;

import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import edu.utsa.cs3443.project.IncomeActivity;

public class IncomeController implements View.OnClickListener {
    
    private IncomeActivity incomeActivity;
    private Switch monthYearSwitch;
    private EditText incomeText;
    private static double income = 0;
    public enum Time {MONTHLY, YEARLY};
    private static Time time;
    
    public IncomeController(Switch monthYearSwitch, EditText incomeText, IncomeActivity incomeActivity) {
        this.incomeActivity = incomeActivity;
        this.monthYearSwitch = monthYearSwitch;
        this.incomeText = incomeText;
    }
    
    public static double getIncome() {
        return income;
    }
    
    public static void setIncome(double income) {
        IncomeController.income = income;
    }
    
    public static Time getTime() {
        return time;
    }
    
    public static void setTime(Time time) {
        IncomeController.time = time;
    }
    
    @Override
    public void onClick(View view) {
        income = (incomeText.getText().toString().equals("")) ? 0 : Double.parseDouble(incomeText.getText().toString());
        time = (monthYearSwitch.isChecked()) ? Time.YEARLY : Time.MONTHLY;

        if (getTime() == Time.MONTHLY) { setIncome(income / 12); }
        
        
        Toast t = Toast.makeText(view.getContext(), "Income added to budget", Toast.LENGTH_SHORT);
        t.show();
    }
}
