import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args){
      Scanner klawiatura = new Scanner(System.in);
        double podatekstanowy = 0.04;
        double podateklokalny = 0.02;
        double cena,cenapopodatku;
        double wartoscpodatekstanowy, wartoscpodateklokalny;
        System.out.println("podaj wartosc kupowanego produktu");
        cena = klawiatura.nextDouble();
        klawiatura.nextLine();
        wartoscpodateklokalny=cena*podateklokalny;
        wartoscpodatekstanowy= cena*podatekstanowy;
        cenapopodatku = cena + wartoscpodateklokalny + wartoscpodatekstanowy;
        System.out.println("cena to " +cena+ " podatek stanowy to " + wartoscpodatekstanowy  +
                " %, podatek lokalny to " + wartoscpodateklokalny +
                " %, a cena po podatku to " + cenapopodatku);

    }
}
