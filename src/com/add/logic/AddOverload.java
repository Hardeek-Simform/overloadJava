package com.add.logic;

public class AddOverload {
    public void add(int operand1, int operand2){
        System.out.println("The addition of the 2 Integers is : "+ (operand1+operand2));
    }
    public void add(float operand1, float operand2){
        System.out.println("The addition of the 2 Float is : "+ (operand1+operand2));
    }
    public void add(double operand1, double operand2){
        System.out.println("The addition of the 2 Double is : "+ (operand1+operand2));
    }
}
