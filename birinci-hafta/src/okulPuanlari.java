import java.util.Scanner;
public class okulPuanlari {
    public static void main (String []args){
        /**
         * Okul puanlarının harf karşılığını yazan program.
         * Random alınabilir değerler.
         * 0 - 35 arası FF
         * 35 - 50 arası DC
         * 50 - 70 arası BB
         * 70 - 100 arası AA
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Puanınızı Giriniz: ");
        int score = input.nextInt();

        if (score<=35){
            System.out.print("Harf Notunuz: FF");
        } else if (score<=50) {
            System.out.print("Harf Notunuz: DC");

        } else if (score<=70) {
            System.out.print("Harf Notunuz: BB");

        }else if (score<=100) {
            System.out.print("Harf Notunuz: AA");
        }
        else {
            System.out.print("Hatalı Giriş Yapıtınız.");
        }
    }
}
