import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int id, duration, month, totalAmount = 0;

        System.out.printf("1- Şirket Girişi. %n2- Bireysel Giriş. %nAraç Modellerini Görmek İçin Giriş Yapınız:  ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if (a == 1) {
            System.out.printf("Kiralayabileceğiniz araçlar : %n1- Hatchbag %nSeçiminiz: ");
            id =input.nextInt();
        } else {
            System.out.printf("Kiralayabileceğiniz araçlar : %n1- Hatchback. %n2- SUV. %n3- Sedan. %nSeçiminiz: ");
            id = input.nextInt();

        }
        System.out.printf("Ne kadar süre kiralayacaksınız?: %n");

        if (id==1){
            System.out.printf("Yalnızca Gün Bazlı kiralama yapılabilir. Kaç Günlük Kiralamak İstersiniz?:");
            duration = input.nextInt();
            totalAmount = 15*duration;
        }
        if (id != 1){
            System.out.printf("Kiralama Türünü Seçiniz: %n1- Günlük %n2- Aylık %nSeçiminiz:");
            duration = input.nextInt();
            if(duration==1){
                System.out.printf("Kaç Gün Kiralamak İstersiz?:");
                duration = input.nextInt();
                totalAmount = 15*duration;

            }else {
                System.out.printf("Kaç Ay Kiralamak İstersiz?:");
                duration = input.nextInt();
                totalAmount = 300*duration;
            }

        }
        System.out.printf("%d Türk Lirası Toplam Ödeme Tutarınızdır.", totalAmount);


    }
}