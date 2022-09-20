public class asalSayilar {
    public static void main(String[] args) {
        // 3 ile 100 arasında asal sayıların toplamını bulan program.
        int total = 0;
        for(int number=3;number<=100;number++)
        {
            int control = 0;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    control = 1;
                    break;
                }
            }
            if(control==0) {
                total += number;
                //System.out.printf("%d ,", number);
            }
        }
        System.out.printf("%nAsal sayıların toplamı: %d", total);
    }
}


