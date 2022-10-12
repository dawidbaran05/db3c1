public class Zadanie17 {
    public static void main(String[] args) {
        double akcje = 600, cena = 21.77, prowizja = 0.02, suma, kwota;
        kwota = akcje * cena;
        prowizja = kwota * prowizja;
        suma = kwota + prowizja;
        System.out.print("cena samych akcji:  " + kwota + "\n  prowizja: " + prowizja + "\n suma: " + suma);
    }}