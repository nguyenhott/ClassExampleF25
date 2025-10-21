public class Customer {

    private String id;
    private String name;
    private String address;

    public Customer(String id, String name, String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public boolean checkId(String id){
        if(this.id.equals(id))
            return true;
        else return false;
    }
    String display(){
        return String.format("Id: %s; Name: %s; Address: %s", id, name, address);
    }

}
