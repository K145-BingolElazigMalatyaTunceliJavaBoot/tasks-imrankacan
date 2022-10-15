public class Apple extends Fruits{
    public Apple(){

    }

    @Override
    public void setKg(int kg) {
        super.setKg(100);
    }

    @Override
    public void setTotalPayment(int totalPayment) {
        super.setTotalPayment(5);
    }

    @Override
    public void setFruitName(String fruitName) {
        super.setFruitName("Apple");
    }
}
