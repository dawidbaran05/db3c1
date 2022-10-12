import java.util.Scanner;

public class Zadanie20 {
    public static void main(String[] args) {
        double a, p, r, n, t;
        System.out.println("kwota na koncie na poczatku");
        Scanner klawiatura = new Scanner(System.in);
        p=klawiatura.nextDouble();
        klawiatura.nextLine();
        System.out.println("stopa oprocentowania");
        r=klawiatura.nextDouble() / 100;
        klawiatura.nextLine();
        System.out.println("kapitalizowanie w roku");
        n=klawiatura.nextDouble();
        klawiatura.nextLine();
        System.out.println("lata");
        t=klawiatura.nextDouble();
        klawiatura.nextLine();
        a=p*(1+r/n);
        double h= t*n;
         double wynik = Math.pow(a, h);
        System.out.println(wynik);


    }
}
