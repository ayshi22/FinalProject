public class DigitalProduct extends Product{
    private int fileSize;
    DigitalProduct(int id,String name,double price,int quantity,int fileSize){
        super(id,name,price,quantity);
        this.fileSize=fileSize;
    }

    public int getFileSize() {
        return fileSize;
    }
}
