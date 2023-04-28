package edu.utsa.cs3443.project.controller;

import android.view.View;
import android.widget.Switch;

public class SwitchController implements View.OnClickListener {
    
    private Switch monthlyYearlySwitch;
    
    public SwitchController(Switch monthlyYearlySwitch) {
        this.monthlyYearlySwitch = monthlyYearlySwitch;
    }
    
    @Override
    public void onClick(View view) {
        monthlyYearlySwitch.setText((monthlyYearlySwitch.isChecked()) ? "Yearly" : "Monthly");
    }
}
