import java.util.Scanner;

public class Zadanie16 {
    public static void main(String[] args) {
        double cena, podatek, napiwek, lacznie;
        double procentpod=0.0675 , procentnpiwek = 0.2;
        System.out.println("wprowadz cene posilku");
        Scanner klawiatura = new Scanner(System.in);
        cena = klawiatura.nextDouble();
        podatek = cena * procentpod;
        napiwek = (cena + podatek) * procentnpiwek;
        lacznie = cena + napiwek + podatek;
        System.out.println("cena posilku to " + cena + " napiwek to " + napiwek +"  podatek to " +  podatek + " suma to " + lacznie);

    }
}
