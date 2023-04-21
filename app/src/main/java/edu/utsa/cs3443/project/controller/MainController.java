package edu.utsa.cs3443.project.controller;

import android.content.Intent;
import android.view.View;

import edu.utsa.cs3443.project.MainActivity;

public class MainController implements View.OnClickListener {
    MainActivity main;

    /**
     * @param v The view that was clicked.
     */

    public void onClick(View v) {
        Intent intent = new Intent(main, MainActivity.class);
        intent.putExtra("buttonId", v.getId());
        main.startActivity(intent);


    }
}
