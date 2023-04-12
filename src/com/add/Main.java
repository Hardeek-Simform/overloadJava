package com.add;

import com.add.logic.AddOverload;

public class Main {
    public static void main(String[] args) {
        int operand1 = 10, operand2 = 15;
        float operandF1 = 10.5F, operandF2 = 15;
        double operandD1 = 10.3, operandD2 = 19;
        AddOverload Adobj = new AddOverload();
        Adobj.add(operand1, operand2);
        Adobj.add(operandF1, operandF2);
        Adobj.add(operandD1, operandD2);
    }
}