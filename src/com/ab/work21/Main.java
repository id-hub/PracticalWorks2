package com.ab.work21;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number weeks -> ");
        int weeks = sc.nextInt();
        int sec = weeks * 7 * 24 * 3600;
        System.out.println(sec);
    }
}
