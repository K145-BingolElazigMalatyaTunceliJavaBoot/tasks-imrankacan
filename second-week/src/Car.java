public abstract class Car {

    private String color;
    private int lagguageCapacity;
    private int total;


    public abstract void dailyRental();
    public abstract void monthlyRental();

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLagguageCapacity() {
        return lagguageCapacity;
    }

    public void setLagguageCapacity(int lagguageCapacity) {
        this.lagguageCapacity = lagguageCapacity;
    }
}
