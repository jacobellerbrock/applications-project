package edu.utsa.cs3443.project.controller;

import android.content.Intent;
import android.view.View;

import edu.utsa.cs3443.project.DataActivity;

public class DataController implements View.OnClickListener{

    DataActivity d;

    /**
     * @param v The view that was clicked.
     */
    public void onClick(View v) {
        Intent intent = new Intent(d, DataActivity.class);
        intent.putExtra("buttonId",v.getId());
        d.startActivity(intent);
    }
}
