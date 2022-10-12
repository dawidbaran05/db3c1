package ifi;

import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
       double waga, ciezar;
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("podaj wage");
        waga = klawiatura.nextDouble();
        klawiatura.nextLine();
        ciezar =waga * 9.8;

    }
}
