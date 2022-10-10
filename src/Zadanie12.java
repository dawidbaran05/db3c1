import java.util.Scanner;

public class Zadanie12 {
    public static void main(String[] args){
        Scanner klawiatura = new Scanner(System.in);
        int ciastkawpudelku=40, porcje=10, kalorie=300;
        double kalorieciacho;
        kalorieciacho = porcje * kalorie / ciastkawpudelku;
       double ciacho;
        System.out.println("podaj ilosc zjedzonych ciatek");
        ciacho = klawiatura.nextDouble();
        klawiatura.nextLine();
      double zjedzonekalorie;
      zjedzonekalorie=ciacho*kalorieciacho;

        System.out.println("zjadles  " + zjedzonekalorie +"kalorie");

    }
}
