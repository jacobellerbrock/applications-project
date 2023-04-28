package edu.utsa.cs3443.project;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import edu.utsa.cs3443.project.model.CategoryTracker;
import edu.utsa.cs3443.project.controller.DataController;

public class DataActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private DataController dataController;
    private CategoryTracker categoryTracker;

    private Spinner typeSpinner;
    private EditText nameEditText;
    private EditText valueEditText;
    private TextView totalTextView;

    private String selectedType;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_display);


        typeSpinner = findViewById(R.id.typeSpinner);
        nameEditText = findViewById(R.id.nameEditText);
        valueEditText = findViewById(R.id.valueEditText);
        totalTextView = findViewById(R.id.totalTextView);

        typeSpinner.setOnItemSelectedListener(this);

        List<String> categories = new ArrayList<>();
        categories.add("Income");
        categories.add("Bill");
        categories.add("Savings");
        categories.add("Want");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, categories);

        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        typeSpinner.setAdapter(dataAdapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        selectedType = parent.getItemAtPosition(position).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        // Do nothing
    }

    public void addCategory(View view) {
        String name = nameEditText.getText().toString();
        String valueString = valueEditText.getText().toString();

        if (name.equals("")) {
            Toast.makeText(this, "Please enter a name for the category", Toast.LENGTH_SHORT).show();
            return;
        }

        if (valueString.equals("")) {
            Toast.makeText(this, "Please enter a value for the category", Toast.LENGTH_SHORT).show();
            return;
        }

        double value = Double.parseDouble(valueString);

        if (value <= 0) {
            Toast.makeText(this, "Please enter a positive value for the category", Toast.LENGTH_SHORT).show();
            return;
        }

        dataController.addCategory(selectedType, name, value);
        categoryTracker.addCategory(selectedType, name, value);

        updateTotalTextView();
        Toast.makeText(this, "Category added", Toast.LENGTH_SHORT).show();

        nameEditText.setText("");
        valueEditText.setText("");
    }

    private void updateTotalTextView() {
        String type = typeSpinner.getSelectedItem().toString();
        String name = nameEditText.getText().toString();

        double total;

        if (type.equals("Income")) {
            total = categoryTracker.getCategoryIncome(name);
        } else {
            total = categoryTracker.getCategoryExpense(name);
        }

        totalTextView.setText(String.format("$%.2f", total));
    }
}
