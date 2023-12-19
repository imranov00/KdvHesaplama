import java.util.Scanner;


public class deneme {
    public static void main(String[] args) {
        int a,b,c,u,cevre ;
        double d ;


        Scanner girdi = new Scanner(System.in);
        System.out.println("1. Kenarı Giriniz:");
        a= girdi.nextInt();
        System.out.println("2. Kenarı Giriniz:");
        b= girdi.nextInt();
        System.out.println("3. Kenarı Giriniz:");
        c=girdi.nextInt();

        u= (a+b+c)/2;
        cevre=u*2;
        d= Math.sqrt(u*(u-a)*(u-b)*(u-c)) ;


        System.out.println("Üçgenin Çevresi: " +cevre);

        System.out.println("Üçgenin Alanı:"  +d);












    }
}


