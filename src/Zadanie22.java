import java.util.Scanner;

public class Zadanie22 {
    public static void main(String[] args) {
        double v, r, e, s;
        System.out.println("dlugsz rzedu");
        Scanner klawiatura = new Scanner(System.in);
        r=klawiatura.nextDouble();
        klawiatura.nextLine();
        System.out.println("sadzonki");
        v=klawiatura.nextDouble() / 100;
        klawiatura.nextLine();
        System.out.println("miejsce w okratowaniu");
        e=klawiatura.nextDouble();
        klawiatura.nextLine();
        System.out.println("odleglosc miedzy sadzonkami");
        s=klawiatura.nextDouble();
        v=(r-2*e)/s;
        System.out.println("sadzonki w rzedzie" + v);
    }
}
