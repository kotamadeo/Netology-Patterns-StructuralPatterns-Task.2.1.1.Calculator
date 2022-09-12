package com.gmail.at.kotamadeo.calculator.classes;

import com.gmail.at.kotamadeo.calculator.interfaces.Doubles;

import static com.gmail.at.kotamadeo.calculator.classes.Calculator.Operation.*;

public class DoublesCalculator implements Doubles {
    private final Calculator calculator = new Calculator();

    @Override
    public double sum(double a, double b) {
        return calculator.newFormula().addOperand(a).addOperand(b).calculate(SUM).result();
    }

    @Override
    public double mult(double a, double b) {
        return calculator.newFormula().addOperand(a).addOperand(b).calculate(MULT).result();
    }

    @Override
    public double pow(double a, double b) {
        return calculator.newFormula().addOperand(a).addOperand(b).calculate(POW).result();
    }

    @Override
    public double sub(double a, double b) {
        return calculator.newFormula().addOperand(a).addOperand(b).calculate(SUB).result();
    }

    @Override
    public double div(double a, double b) {
        return calculator.newFormula().addOperand(a).addOperand(b).calculate(DIV).result();
    }
}
