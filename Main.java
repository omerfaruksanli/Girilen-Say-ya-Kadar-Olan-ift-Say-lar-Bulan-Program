import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,toplam=0,bolme=0,ort , toplam2 = 0;
        Scanner input = new Scanner(System.in);
        System.out.print(" SAYI GİRİNİZ :");
        a =input.nextInt();

        for (int i = 1; i<=a; i++ ){
            if (i % 3 == 0){
                System.out.println(i);
                toplam=toplam+i;
                bolme++;
            }
        } int ort1=toplam/bolme;
        System.out.println("Ortalamanız : " + ort1);

        for (int i = 1; i<=a; i++){
            if (i % 4 == 0){
                System.out.println(i + ",");
                toplam=toplam+i;
                bolme++;
            }
        }  int ort2;
          ort2=toplam /bolme;
        System.out.println("Ortalamanız : " + ort2);
          ort=(ort1+ort2) / 2;
        System.out.print("Ortalama : " + ort);

    }
}