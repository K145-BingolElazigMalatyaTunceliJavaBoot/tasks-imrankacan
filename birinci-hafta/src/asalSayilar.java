public class asalSayilar {
    public static void main(String[] args) {
        /**
         * 3 ile 100 arasında asal sayıların toplamını bulan program.
         */

        int toplam = 0;
        for(int sayi=3;sayi<=100;sayi++)
        {
            int kontrol = 0;
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    kontrol = 1;
                    break;
                }
            }
            if(kontrol==0) {
                toplam += sayi;
                //System.out.printf("%d ,", sayi);
            }
        }
        System.out.printf("%nAsal sayıların toplamı: %d", toplam);
    }
}


