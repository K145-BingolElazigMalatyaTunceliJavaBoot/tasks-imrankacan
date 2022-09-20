import java.util.Random;
public class rastgeleSecim {
        public static void main (String[]args){
            /**
             * 0 ile 500 aralığında ve
             * Bu sayılardan 50 ile 100 arasında bir sayı bulunana kadar rastgele sayılar seçilir.
             * 50 ile 100 arasındaki sayının kaçıncı seçimde bulunduğunu bulan program.
             */
            int a = 0 , sayac = 0;
            Random random = new Random();
            while (a<50 || a>100){
                a = random.nextInt(500);
                sayac++;
                /*a = (int)(Math.random()*500);  //math kütüphanesi ile
                System.out.println(a);
                System.out.println("sayac"+sayac);*/
           }
                System.out.printf("%d sayısı %d. sırada bulunmuş.", a, sayac);
        }
    }



