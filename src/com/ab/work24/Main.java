package com.ab.work24;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter first number ->");
      int first = scan.nextInt();
//==================================
      int edn = first % 10;
      int var = first / 10;
      int des = var % 10;
      int sotn = var / 10;
//==================================
        int mirror = edn * 100 + des * 10 + sotn;
        int razn  = first - mirror;
      System.out.println("first = " + first);
      System.out.println("mirror = " + mirror);
      System.out.println("============");
      System.out.println("razn = " + razn);

//        System.out.println("edn = " + edn);
//        System.out.println("des = " + des);
//        System.out.println("sotn = " + sotn);




    }
}
