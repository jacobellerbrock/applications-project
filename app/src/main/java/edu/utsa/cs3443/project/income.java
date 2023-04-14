package edu.utsa.cs3443.project;
//income.java will take user input of annual and monthly income
//getters and setters for monthly and annual income
//toString method will concat. the
public class income {

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

    @Override
    public String toString() {
        return  "Monthly Income= $" + monthlyIncome + "\n Annual Income= $" + annualIncome;
    }

    //here, logic to communicate with screen 2 methods
    //methods to add and deduct monthly income based on expenses and recurring expenses from screen 2


}
