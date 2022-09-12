package com.gmail.at.kotamadeo;

import com.gmail.at.kotamadeo.calculator.classes.DoublesCalculator;
import com.gmail.at.kotamadeo.calculator.interfaces.Doubles;
import com.gmail.at.kotamadeo.calculator.interfaces.Ints;
import com.gmail.at.kotamadeo.calculator.classes.IntsCalculator;

public class Main {
    public static void main(String[] args) {
        Ints calcInt = new IntsCalculator();
        System.out.println(calcInt.sum(2, 2));
        System.out.println(calcInt.mult(10, 22));
        System.out.println(calcInt.pow(2, 10));
        System.out.println(calcInt.sub(2, 10));
        System.out.println(calcInt.div(10, 5) + "\n");
        Doubles calcDouble = new DoublesCalculator();
        System.out.println(calcDouble.sum(2.3, 2.5));
        System.out.println(calcDouble.mult(3, 2.5));
        System.out.println(calcDouble.pow(3, 2.5));
        System.out.println(calcDouble.sub(124.8, 24.8));
        System.out.println(calcDouble.div(14, 9));
    }
}