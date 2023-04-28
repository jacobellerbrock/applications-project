package edu.utsa.cs3443.project;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class CategoryActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        Intent intent = getIntent();
        String value = ((Intent) intent).getStringExtra("variableName");

        //make findviewbyId buttons here
        //make setOnClickListeners here

        //payments class will have one time and recurring expenses (possibly through user input)
        //some kind of data structure to add, delete, modify, and traverse through payments
    }
}
