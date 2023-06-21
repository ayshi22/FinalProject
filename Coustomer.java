public class Coustomer {
    private String id;
    private String name;
    private String address;
    Coustomer(String id,String name,String address){
        this.id=id;
        this.name=name;
        this.address=address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }
    public void display()
    {
        System.out.println("Coustomer name : "+name);
        System.out.println("Coustomer id : "+id);
        System.out.println("Coustomer address : "+address);
    }
}
