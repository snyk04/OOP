package com.company;


public class Main {

    public static void main(String[] args) {

        float a = -5;
        float b = -5;
        float m = 5;
        float n = 5;
        float sum = 0;

        for (float i = a; i <= m; i++) {

            if (i == 0) {
                System.out.println("Error: j and i shouldn't be equal 0");
                return;
            }

            for (float j = b; j <= n; j++) {

                if (j == 0) {
                    System.out.println("Error: j and i shouldn't be equal 0");
                    return;
                }
                sum += (i / j) / i;
            }
        }
        System.out.println("sum = " + sum);
    }
}
