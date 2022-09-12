package com.gmail.at.kotamadeo.calculator.classes;

import com.gmail.at.kotamadeo.calculator.interfaces.Ints;

import static com.gmail.at.kotamadeo.calculator.classes.Calculator.Operation.*;

public class IntsCalculator implements Ints {
    private final Calculator calculator = new Calculator();

    @Override
    public int sum(int a, int b) {
        return (int) calculator.newFormula().addOperand(a).addOperand(b).calculate(SUM).result();
    }

    @Override
    public int mult(int a, int b) {
        return (int) calculator.newFormula().addOperand(a).addOperand(b).calculate(MULT).result();
    }

    @Override
    public int pow(int a, int b) {
        return (int) calculator.newFormula().addOperand(a).addOperand(b).calculate(POW).result();
    }

    @Override
    public int sub(int a, int b) {
        return (int) calculator.newFormula().addOperand(a).addOperand(b).calculate(SUB).result();
    }

    @Override
    public int div(int a, int b) {
        return (int) calculator.newFormula().addOperand(a).addOperand(b).calculate(DIV).result();
    }
}
