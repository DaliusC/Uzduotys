package com.company.Uzduotys;

import java.util.Scanner;

public class Uzduotis1 {
    public void uzduotis1() {
        Scanner skaneris = new Scanner(System.in);
        int pirmas = 0;
        System.out.println("Įveskite skaičių kurį tikrinsite:");
        pirmas = skaneris.nextInt();
        if (pirmas % 2 != 0) {
            System.out.println("Sakaičius nelyginis.");
        }else
        {
            System.out.println("Skaičius lyginis.");
        }
    }
}

