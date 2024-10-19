package com.csc;


public class TriangleNumberCalculator {

  public int value(int n) {
      return n * (n + 1) / 2;
  }

  public int add(int n, int m) {
      return value(n) + value(m);
  }

  public int subtract(int n, int m) {
      return value(n) - value(m);
  }

  public int multiply(int n, int m) {
      return value(n) * value(m);
  }

  public double divide(int n, int m) {
      if (value(m) == 0) {
          throw new ArithmeticException("Division by zero");
      }
      return (double) value(n) / value(m);
  }

  public static void main(String[] args) {
      TriangleNumberCalculator calculator = new TriangleNumberCalculator();
      System.out.println("5th triangular number: " + calculator.value(5));
      System.out.println("Sum of 3rd and 4th triangular numbers: " + calculator.add(3, 4));
      System.out.println("Difference of 5th and 2nd triangular numbers: " + calculator.subtract(5, 2));
      System.out.println("Product of 3rd and 5th triangular numbers: " + calculator.multiply(3, 5));
      System.out.println("Division of 6th by 3rd triangular numbers: " + calculator.divide(6, 3));
  }
}
