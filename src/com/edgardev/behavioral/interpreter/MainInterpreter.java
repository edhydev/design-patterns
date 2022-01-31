package com.edgardev.behavioral.interpreter;

public class MainInterpreter {
    public static void main(String[] args) {
        Expression cero = new TerminalExpression("0");
        Expression uno = new TerminalExpression("1");

        Expression containBoolean = new OrExpression(cero, uno);
        Expression containOneAndZero = new AndExpression(cero, uno);

        System.out.println(containBoolean.interpret("zero"));
        System.out.println(containBoolean.interpret("0"));

        System.out.println(containOneAndZero.interpret("zero"));
        System.out.println(containOneAndZero.interpret("0, 1"));
    }
}
