public class tamBolunen {
    public static void main (String []args){
        //200 ile 500 arasındaki 3 ile tam bölünen sayılar dışındaki sayıların toplamını bulan program.
        int total = 0;
        for (int i = 200; i <=500 ; i++) {
            if(i%3==0){
                continue;
            }else {
                //System.out.printf("%d %n",i);
                total+=i;
            }
        }
        System.out.printf("200 ile 500 arasındaki 3 ile tam bölünen sayılar dışındaki sayıların toplamını: %d", total);
    }
}
