package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, i, j, space = 1;
        System.out.print("Enter the number of rows: ");
        Scanner ais = new Scanner(System.in);
        a = ais.nextInt();
        space = a - 1;
        for (j = 1; j <= a; j++)
        {
            for (i = 1; i <= space; i++)
            {
                System.out.print(" ");
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        space = 1;
        for (j = 1; j <= a - 1; j++)
        {
            for (i = 1; i <= space; i++)
            {
                System.out.print(" ");
            }
            space++;
            for (i = 1; i <= 2 * (a - j) - 1; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
