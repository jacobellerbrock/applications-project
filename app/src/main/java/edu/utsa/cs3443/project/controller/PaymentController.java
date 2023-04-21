package edu.utsa.cs3443.project.controller;

import android.content.Intent;
import android.view.View;

import edu.utsa.cs3443.project.PaymentActivity;

public class PaymentController implements View.OnClickListener {

    PaymentActivity p;
    /**
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(p, PaymentActivity.class);
        p.startActivity(intent);

    }
}
