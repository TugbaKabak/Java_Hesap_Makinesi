import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int select;
        double n1,n2;

        Scanner input= new Scanner(System.in);

        System.out.print("Lütfen ilk sayıyı giriniz: ");
        n1=input.nextDouble();

        System.out.print("Lütfen ikinci sayıyı giriniz: ");
        n2=input.nextDouble();

        System.out.println("Lütfen bir seçim yapınız.\n1-Toplama\n2-Çıkartma\n3-Çarpma\n4-Bölme");

        select= input.nextInt();
        switch(select){
            case 1:
                System.out.println("Sonuç: "+ (n1+n2));
                break;
            case 2:
                System.out.println("Sonuç: "+ (n1-n2));
                break;
            case 3:
                System.out.println("Sonuç: "+ (n1*n2));
                break;
            case 4:
                if(n2!=0){
                    System.out.println("Sonuç: "+ (n1/n2));
                }
                else{
                    System.out.println("Bir sayı 0'a bölünemez");
                }
                break;
            default:
                System.out.println("Hatalı işlem yaptınız. Tekrar deneyiniz!");

        }
    }

}
