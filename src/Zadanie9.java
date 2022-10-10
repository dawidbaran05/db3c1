public class Zadanie9 {
    public static void main(String[] args){
       String firstname="Dawid", middlename="Wiktor", lastname="Baran";
       char firstinitial, middleinitial, lastinitial;
        firstinitial= firstname.charAt(0);
        middleinitial = middlename.charAt(0);
        lastinitial = lastname.charAt(0);
        System.out.printf(firstinitial+"."+middleinitial+"."+lastinitial);
    }
}
