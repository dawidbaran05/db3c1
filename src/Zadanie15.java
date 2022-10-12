import java.util.Scanner;
public class Zadanie15 {
    public static void main(String[] args){
        String miasto, duzemiasto, malemiasto;
        int dlugosc;
        char inicjal;
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("podaj swoje ulubione miasto");
        miasto = klawiatura.nextLine();
        dlugosc = miasto.length();
        malemiasto = miasto.toLowerCase();
        duzemiasto = miasto.toUpperCase();
        inicjal =  miasto.charAt(0);
        System.out.println( dlugosc + " " + malemiasto + " " + duzemiasto + " " + inicjal);
    }
}
