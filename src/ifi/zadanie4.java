package ifi;

import java.util.Scanner;

public class zadanie4 {
    public static void main(String[] args) {
        double ocena1, ocena2, ocena3 ;
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("podaj wynik testu 1");
        ocena1 = klawiatura.nextDouble();
        klawiatura.nextLine();
        System.out.println("podaj wynik testu 2");
        ocena2= klawiatura.nextDouble();
        klawiatura.nextLine();
        System.out.println("podaj wynik testu 3");
      ocena3 = klawiatura.nextDouble();
        klawiatura.nextLine();
        double srednia= (ocena1+ocena2+ocena3)/3;
        if(srednia>=90 && srednia<100) System.out.println("5");
        else if (srednia>=80 && srednia<90) System.out.println("4");
        else if(srednia>=70 && srednia<80) System.out.println("3");
        else if(srednia>=60 && srednia < 70) System.out.println("2");
        else if(srednia<60 && srednia>=0) System.out.println("1");
        else System.out.println("blad");

    }
}
