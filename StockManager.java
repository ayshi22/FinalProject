import java.util.ArrayList;
import java.util.List;


  public class StockManager implements StockManagement {
        private List<Product> products;

        public StockManager() {
            products = new ArrayList<>();
        }

        public void addProduct(Product product) {
            products.add(product);
            System.out.println("Product added: " + product.getName());
        }

        public void removeProduct(Product product) {
            products.remove(product);
            System.out.println("Product removed: " + product.getName());
        }

        public void updateProduct(Product product) {
            System.out.println("Updating product: " + product.getName());

        }

        public Product getProduct(int id) {
            for (Product product : products) {
                if (product.getId() == id) {
                    return product;
                }
            }
            return null;
        }
    }


