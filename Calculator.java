package com.mycompany.test;

public class Calculator{
  public static void main(String[] args) {
    int a = 4;
    int b = 2;
    System.out.println(sum(a,b));
    System.out.println(minus(a,b));
  }
  private static int sum(int a, int b){
    return a + b;
  }
  private static int minus_gpu(int a, int b, int cpu){
    return a - b;
    //새로 만든 브런치
  }
}
