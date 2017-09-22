package com.company.Uzduotys;

import java.util.Scanner;

public class Uzduotis2 {
    public static final String PABAIGA = "pabaiga";

    public void uzduotis2() {
        Scanner skaneris = new Scanner(System.in);
        String zodis = "";

        while (!zodis.equals(PABAIGA)) {
            System.out.println("Įveskite žodį:");
   zodis = skaneris.nextLine();
            System.out.println(zodis);
        }

    }
}
