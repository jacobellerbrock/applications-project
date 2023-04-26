package edu.utsa.cs3443.project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Scanner;
import android.os.Bundle;


public class IncomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_income);

        //if user chooses to update monthly income call UpdateMonthlyIncome or put UpdateMonthlyIncome here
        //here, logic to communicate with screen 2 methods
        //methods to add and deduct monthly income based on expenses and recurring expenses from screen 2


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