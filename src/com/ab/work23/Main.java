package com.ab.work23;

import sun.awt.geom.AreaOp;

public class Main {
    public static void main(String[] args) {
//        int var1 = 5;
//        int var2 = 7;
        int var1 = -2147483648;
        int var2 = 2147483647;
        var1 = var1 + var2;
        var2 = var1 - var2;
        var1 = var1 - var2;
        System.out.println("var1=" + var1);
        System.out.println("var2=" + var2);

//        int value = Integer.MAX_VALUE + 1;
//        System.out.println(value);

    }
}
