import java.util.Scanner;


public class deneme {
    public static void main(String[] args) {
        double kdvorani, tutar,kdvlifiyat, kdvtutarı;

        Scanner input = new Scanner(System.in);
        System.out.println("Tutar Giriniz:");
        tutar = input.nextDouble();





        kdvorani = (tutar >= 0 && tutar <= 1000) ? 0.18 : 0.8;
        kdvtutarı= tutar*kdvorani;
        kdvlifiyat= tutar + kdvtutarı;
        System.out.println("Kdv Oranı:"+kdvorani);

        System.out.println("KDV'siz tutar:"+ tutar);

        System.out.println("KDV'li Fiyat:"+ kdvlifiyat);

        System.out.println("KDV Tutarı:" + kdvtutarı);



    }
}


