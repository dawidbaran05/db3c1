import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args){
        Scanner klawiatura = new Scanner(System.in);
        double kmnl, km, l;
        System.out.println("podaj ilosc przejechanych kilometrow");
        km = klawiatura.nextDouble();
        klawiatura.nextLine();
        System.out.println("podaj ilosc zuzytego paliwa");
        l = klawiatura.nextDouble();
        klawiatura.nextLine();
       kmnl=km/l;
        System.out.println("pojazd przejezdza na litrze " + kmnl );

    }
}
