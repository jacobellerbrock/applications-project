package edu.utsa.cs3443.project;
import androidx.annotation.NonNull;

import java.util.Scanner;
//income.java will take user input of annual and monthly income
//getters and setters for monthly and annual income
//toString method will concat. both of the incomes
public class income {

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
    public  UpdateMonthlyIncome() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter new monthly income: ");
        double newMonthlyIncome = sc.nextDouble();
        this.monthlyIncome = newMonthlyIncome;
        System.out.println("Your monthly income has been updated to: $" + newMonthlyIncome);
        //double newYearlyIncome = newMonthlyIncome * 12;


    }



}
