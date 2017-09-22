package com.company.Uzduotys;

import java.util.Scanner;

public class Uzduotis5 {

    public void uzduotis5() {
        Scanner skaneris = new Scanner(System.in);
        int suma = 0;
        int skaicius = 0;
        System.out.println("Kiek skaičių įvesite?");
       int ilgis = skaneris.nextInt();
        System.out.println("Įveskite skaičių:");
        int[] masyvas = new int[ilgis];
        for (int i = 0; i < masyvas.length; i++) {
            masyvas[i] = skaneris.nextInt();
            suma += masyvas[i];
        }
        System.out.println("Tavo įvesti skaičiai:");
        for (int i = 0; i < masyvas.length; i++) {
            System.out.println(masyvas[i]);
        }
    }
}
