public interface StockManagement {
    void addProduct(Product product);
    void removeProduct(Product product);
    void updateProduct(Product product);
    Product getProduct(int id);
}
