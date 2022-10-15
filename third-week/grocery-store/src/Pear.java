public class Pear extends Fruits{
    public Pear(){

    }

    @Override
    public void setKg(int kg) {
        super.setKg(100);
    }

    @Override
    public void setTotalPayment(int totalPayment) {
        super.setTotalPayment(15);
    }

    @Override
    public void setFruitName(String fruitName) {
        super.setFruitName("Pear");
    }
}
