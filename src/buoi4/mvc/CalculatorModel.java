package buoi4.mvc;

import buoi4.mvc.observer.Publisher;

public class CalculatorModel extends Publisher {

    private double result;

    public void add(double num1, double num2) {
        result = num1 + num2;
        changeSate();
    }

    public void sub(double num1, double num2) {
        result = num1 - num2;
    }

    public double getResult() {
        return result;
    }

    private void changeSate() {
        notifySubcribers();
    }

}
