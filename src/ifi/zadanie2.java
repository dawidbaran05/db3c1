package ifi;

import javax.crypto.spec.PSource;
import java.nio.channels.Pipe;
import java.util.Scanner;

public class zadanie2 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("podaj cyfre dnia miesiaca");
        a = klawiatura.nextInt();
        System.out.println("podaj cyfre miesiaca");
        b = klawiatura.nextInt();
        System.out.println("podaj dwie ostatnie cyfry roku");
        c = klawiatura.nextInt();
        if (a * b == c) System.out.println("data jest magiczna :)");
        else System.out.println("data nie jest magiczna");
    }}
