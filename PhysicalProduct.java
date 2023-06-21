public class PhysicalProduct extends Product{
    private double weight;
    PhysicalProduct(int id, String name,double price,int quantity,double weight){
        super(id, name, price, quantity);
        this.weight=weight;
    }

    public double getWeight() {
        return weight;
    }
}
