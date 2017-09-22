package com.company.Uzduotys;

import java.util.Scanner;

public class Uzduotis7 {
    public void uzduotis7() {
        Scanner skaneris = new Scanner(System.in);
        System.out.println("Kiek skaičių įvesite?");
        int ilgis = skaneris.nextInt();
        System.out.println("Įveskite skaičių:");
        int[] masyvas = new int[ilgis];
        for (int i = 0; i < masyvas.length; i++) {
            masyvas[i] = skaneris.nextInt();
        }
        System.out.println("Tavo įvesti skaičiai:");
        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i] > 100) {
                System.out.println(masyvas[i]);
            }
        }
    }
}

