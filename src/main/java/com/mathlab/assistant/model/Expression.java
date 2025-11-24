package com.mathlab.assistant.model;

public class Expression {

    private double leftOperand;
    private double rightOperand;
    private String operator;
    private double result;

    public Expression(double rightOperand, double leftOperand, String operator, double result) {
        this.rightOperand = rightOperand;
        this.leftOperand = leftOperand;
        this.operator = operator;
        this.result = result;
    }

    public double getLeftOperand() {
        return leftOperand;
    }

    public double getResult() {
        return result;
    }

    public double getRightOperand() {
        return rightOperand;
    }

    public String getOperator() {
        return operator;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
