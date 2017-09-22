package com.company.Uzduotys;

import java.util.Scanner;

public class Uzduotis3 {
    public void uzduotis3() {
        Scanner skaneris = new Scanner(System.in);
        int skaicius = 0;
        int suma = 0;
        do {
            System.out.println("Įveskite skaičių:");
            skaicius = skaneris.nextInt();
            suma += skaicius;
        }
        while (skaicius != 0);
        System.out.println(suma);
    }
}
