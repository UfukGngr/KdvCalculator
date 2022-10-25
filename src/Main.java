import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double anaPara,kdv=0,kdvTutar=0,total=0;
        boolean hata;
        String sonuc="";
        Scanner input=new Scanner(System.in);

        System.out.println("Anaparayı giriniz: ");
        anaPara=input.nextDouble();
        kdv=(anaPara<1000 && anaPara>0) ? 0.18 : 0.08;

        kdvTutar=anaPara*kdv;
        total+=anaPara+kdvTutar;

        System.out.println("KDV'siz tutar: "+anaPara);
        System.out.println("KDV oranı: "+kdv);
        System.out.println("KDV Tutarı: "+kdvTutar);
        System.out.println("KDV'li Tutar: "+ total);





    }
}