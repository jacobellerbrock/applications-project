package edu.utsa.cs3443.project.controller;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

import edu.utsa.cs3443.project.MainActivity;

public class BackButtonController implements View.OnClickListener {
    
    private Activity activity;
    
    public BackButtonController(Activity activity) {
        this.activity = activity;
    }


    @Override
    public void onClick(View view) {
        activity.startActivityForResult(new Intent(activity, MainActivity.class), MainActivity.REQUEST_CODE);
    }
}
