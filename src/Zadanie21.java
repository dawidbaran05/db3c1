public class Zadanie21 {
    public static void main(String[] args) {
        double akcje = 1000, cena = 32.87, prowizja = 0.02;
        double   cenas = 33.92, prowizja1=0.02;
        double zaplata, zarobek, sprzedaz;
        prowizja= prowizja * akcje*cena;
        prowizja1= prowizja1 * akcje*cena;
        zaplata= akcje * (cena + prowizja);
        sprzedaz= akcje * (cenas + prowizja1);
        zarobek = sprzedaz - zaplata;
        System.out.println("pan jacek zaplacil za akcje " + zaplata + " \n prowizja "+ prowizja +"\n sprzedal je za " + sprzedaz +"\n zaplacil prowizje " +prowizja1 +
                "\n zarobil " + zarobek);
    }
}
