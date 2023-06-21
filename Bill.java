import java.util.ArrayList;
import java.util.List;

public class Bill {
    private String id;
    private float total;
    private List<Product> products;

    // Constructor
    public Bill(String id) {
        this.id = id;
        this.total = 0;
        this.products = new ArrayList<>();
    }


    public void addProduct(Product product) {
        products.add(product);
        total += product.getPrice() * product.getQuantity();
        System.out.println(total);
    }


    public String getId() {
        return id;
    }

    public float getTotal() {
        return total;
    }

    public List<Product> getProduct() {
        return products;
    }

}
