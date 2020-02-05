package com.ab.work22;

public class Main {
    public static void main(String[] args) {
        long time = System.currentTimeMillis() / 1000;
        long time2 = System.currentTimeMillis();
        long time1 = System.currentTimeMillis() % 1000;
 /*       long ss = time % 60;
        time /= 60;
        long mm = time % 60;
        time /= 60;
        long hh = time % 24;
        time /= 24;
System.out.println(time + ":" + hh + ":" + mm + ":" + ss); */
System.out.println("time = " + time + "\n"
                    + "time1 = " + time1 + "\n"
                    + "time2 = " + time2);
     }
}
