public class Zadanie5 {
    public static void main(String[] args){
int wymiar1 = 4, wymiar2 = 3, wymiar3 = 2;
int pomieszczenie1i2, pomieszczenie3, pomieszczenie4;
        pomieszczenie1i2 = wymiar1 * wymiar2;
        pomieszczenie3 = wymiar2 * wymiar3;
        pomieszczenie4 = wymiar3 * wymiar3;
int powierzchniamieszkania = pomieszczenie3 + pomieszczenie1i2 + pomieszczenie4;
System.out.println("2 pomieszczenia maja powierzchnie " + pomieszczenie1i2 + " kolejne ma powierzchnie "+ pomieszczenie3 + " ostatnie pomieszczenia ma powierzchnie "+ pomieszczenie4 +". cale mieszkanie ma powierzchnie" + powierzchniamieszkania);
    }}
