package ifi;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class zadanie3 {
    public static void main(String[] args) {
        double waga, wzrost, BMI ;
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("podaj swoja wage");
    waga = klawiatura.nextDouble();
    klawiatura.nextLine();
        System.out.println("podaj swoj wzrost");
        wzrost = klawiatura.nextDouble();
        klawiatura.nextLine();
        BMI=waga/(wzrost*wzrost);
        if(BMI<18.5) System.out.println("niedowaga");
        else if(BMI>18.5 && BMI<25) System.out.println("optymalna waga");
        else if(BMI>25) System.out.println("nadawga");
        else System.out.println("waga nie m,oze byc ujemna ;)");
    }
}
