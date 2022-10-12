import java.util.Scanner;

public class Zadnaie19 {
    public static void main(String[] args) {
        double cukier = 1.5, maslo =1, maka = 2.75;
        int ciastka =48, podane, iloraz;
        System.out.println("ile ciatek chcesz upiec");
        Scanner klawiatura = new Scanner(System.in);
        podane = klawiatura.nextInt();
        double cukier1 , maslo1 , maka1;
        cukier1 = cukier / ciastka * podane;
        maslo1 = maslo / ciastka * podane;
        maka1 = maka / ciastka * podane;
        System.out.println("do upieczenia " + podane + " ciastek potrzebujesz "
                + cukier1 + " szklanek cukru " + maslo1+ " szklanek masla " + maka1 + " szklanek maki");
    }
}
