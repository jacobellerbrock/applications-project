package edu.utsa.cs3443.project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Scanner;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

import edu.utsa.cs3443.project.controller.BackButtonController;
import edu.utsa.cs3443.project.controller.CategoryController;
import edu.utsa.cs3443.project.controller.IncomeController;
import edu.utsa.cs3443.project.controller.SwitchController;


public class IncomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_income);
    
        Button menuButton = findViewById(R.id.backtomenu_button);
        BackButtonController backButtonController = new BackButtonController(this);
        menuButton.setOnClickListener(backButtonController);
    
        Switch monthYearSwitch = findViewById(R.id.monthYearSwitch);
        SwitchController switchController = new SwitchController(monthYearSwitch);
        monthYearSwitch.setOnClickListener(switchController);
        EditText incomeText = findViewById(R.id.input_income);
    
        Button calculateButton = findViewById(R.id.calculate_button);
        IncomeController incomeController = new IncomeController(monthYearSwitch, incomeText, this);
        calculateButton.setOnClickListener(incomeController);
    }
    int[] IncomeArray;

    double monthlyIncome;
    double annualIncome = monthlyIncome * 12;

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(double annualIncome) {
        this.annualIncome = annualIncome;
    }

    @NonNull
    @Override
    public String toString() {
        return  "Monthly Income= $" + monthlyIncome + "\n Annual Income= $" + annualIncome;
    }

    /**
     * UpdateIncome method takes user input and allows
     * user to change their monthly income
     */
    public void UpdateMonthlyIncome() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter new monthly income: ");
        double newMonthlyIncome = sc.nextDouble();
        this.monthlyIncome = newMonthlyIncome;
        System.out.println("Your monthly income has been updated to: $" + newMonthlyIncome);
        //double newYearlyIncome = newMonthlyIncome * 12;

    }
    int[] IncomeArray;

    double monthlyIncome;
    double annualIncome = monthlyIncome * 12;

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(double annualIncome) {
        this.annualIncome = annualIncome;
    }

    @NonNull
    @Override
    public String toString() {
        return  "Monthly Income= $" + monthlyIncome + "\n Annual Income= $" + annualIncome;
    }

    /**
     * UpdateIncome method takes user input and allows
     * user to change their monthly income
     */
    public void UpdateMonthlyIncome() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter new monthly income: ");
        double newMonthlyIncome = sc.nextDouble();
        this.monthlyIncome = newMonthlyIncome;
        System.out.println("Your monthly income has been updated to: $" + newMonthlyIncome);
        //double newYearlyIncome = newMonthlyIncome * 12;

    }
}