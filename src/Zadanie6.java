public class Zadanie6 {

        public static void main(String[] args){
           int osoby = 4;
            int wymiar1 = 4, wymiar2 = 3, wymiar3 = 2;
            int pomieszczenie1i2, pomieszczenie3, pomieszczenie4;
            pomieszczenie1i2 = wymiar1 * wymiar2;
            pomieszczenie3 = wymiar2 * wymiar3;
            pomieszczenie4 = wymiar3 * wymiar3;
            int powierzchniamieszkania = pomieszczenie3 + pomieszczenie1i2 + pomieszczenie4;
            double przydzialnaosobe;
            przydzialnaosobe = (double)powierzchniamieszkania / osoby;
            System.out.println("na 1 osobe orzypada " + przydzialnaosobe + "metra");
        }

}
