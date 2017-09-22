package com.company;

import com.company.Uzduotys.*;

import java.util.Scanner;

public class Main {
    public static final int UZDAVINYS_1 = 1;
    public static final int UZDAVINYS_2 = 2;
    public static final int UZDAVINYS_3 = 3;
    public static final int UZDAVINYS_4 = 4;
    public static final int UZDAVINYS_5 = 5;
    public static final int UZDAVINYS_6 = 6;
    public static final int UZDAVINYS_7 = 7;

    public static void main(String[] args) {
        Scanner skaitytuvas = new Scanner(System.in);
        while (true) {
            System.out.println("Pasirinkite uždavinį, kurį norite pamatyti:");
            System.out.println("Įvedus -1 programa bus baigta.");
            System.out.println("Galimos užduotys:\n>------------<\n> 1,  2,  3, <\n> 4,  5,  6, <\n> 7,  8,  9, <\n> 10, 11, 12,<\n>------------<");
            int uzdavinioNumeris = skaitytuvas.nextInt();
            switch (uzdavinioNumeris) {
                case UZDAVINYS_1:
                    Uzduotis1 uzdavinys1 = new Uzduotis1();
                    uzdavinys1.uzduotis1();
                    break;
                case UZDAVINYS_2:
                    Uzduotis2 uzdavinys2 = new Uzduotis2();
                    uzdavinys2.uzduotis2();
                    break;
                case UZDAVINYS_3:
                    Uzduotis3 uzdavinys3 = new Uzduotis3();
                    uzdavinys3.uzduotis3();
                    break;
                case UZDAVINYS_4:
                    Uzduotis4 uzdavinys4 = new Uzduotis4();
                    uzdavinys4.uzduotis4();
                    break;
                case UZDAVINYS_5:
                    Uzduotis5 uzdavinys5 = new Uzduotis5();
                    uzdavinys5.uzduotis5();
                    break;
                case UZDAVINYS_6:
                    Uzduotis6 uzdavinys6 = new Uzduotis6();
                    uzdavinys6.uzduotis6();
                    break;
                case UZDAVINYS_7:
                    Uzduotis7 uzdavinys7 = new Uzduotis7();
                    uzdavinys7.uzduotis7();
                    break;
                default:
                    return;

            }
        }
    }
}