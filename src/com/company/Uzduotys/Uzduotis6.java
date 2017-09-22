package com.company.Uzduotys;

import java.util.Scanner;

public class Uzduotis6 {
    public void uzduotis6() {
        Scanner skaneris = new Scanner(System.in);
        System.out.println("Kiek žodžių įvesite?");
        int ilgis = skaneris.nextInt();
        String[] masyvas = new String[ilgis];
        System.out.println("Įveskite žodžius:");
        for (int i = 0; i < masyvas.length; i++) {
            masyvas[i] = skaneris.next();
        }
        System.out.println("Tavo įvesti žodžiai:");
        for (int i = 0; i < masyvas.length; i++) {
            System.out.println(masyvas[i]);
        }
    }
}
