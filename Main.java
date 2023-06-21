import java.util.List;
public class Main {
    public static void main(String[] args) {
        StockManager stockManager = new StockManager();
   ;

        PhysicalProduct physicalProduct = new PhysicalProduct(1, "Book", 90.19, 100, 1.2);
        DigitalProduct digitalProduct = new DigitalProduct(2, "E-book", 7.88, 90, (int) 2.5);
DigitalProduct digitalProduct1=new DigitalProduct(2,"E-book",9.99,100,(int) 2);
        stockManager.addProduct(physicalProduct);
        stockManager.addProduct(digitalProduct);
        stockManager.removeProduct(digitalProduct1);
        Coustomer coustomer=new Coustomer("21q","Asha","road21/b");
        coustomer.display();

        Bill bill = new Bill("BILL-1");
        Product product1 = new Product(1, "Product 1", 20.50f, 3);

        bill.addProduct(product1);


        String billId = bill.getId();
        float totalAmount = bill.getTotal();
        List<Product> products = bill.getProduct();


        System.out.println("Bill ID: " + billId);
        System.out.println("Total Amount: " + totalAmount);

        System.out.println("Products:");

        for (Product product : products) {
            System.out.println("Product ID: " + product.getId());
            System.out.println("Name: " + product.getName());
            System.out.println("Price: " + product.getPrice());
            System.out.println("Quantity: " + product.getQuantity());

        }
    }
}

