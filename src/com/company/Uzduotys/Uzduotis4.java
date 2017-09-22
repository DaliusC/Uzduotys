package com.company.Uzduotys;

import java.util.Scanner;

public class Uzduotis4 {
    public void uzduotis4() {
        Scanner skaneris = new Scanner(System.in);
        int skaicius = 0;
        int suma = 0;

        do {
            try {
                System.out.println("Įveskite skaičių:");
                skaicius = skaneris.nextInt();
                System.out.println(skaicius);
                suma += skaicius;
            } catch (Exception e) {
                skaneris.nextLine();
                System.out.println("Klaida!");
            }
        }
        while (skaicius != 0);
        System.out.println(suma);

    }
}

