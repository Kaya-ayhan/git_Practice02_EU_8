package week14_OOP;

public class Productpage extends Amazon{

    public int quantity;

    public Productpage(String name, int quantity) {
        super(name);
        this.quantity = quantity;
    }
    public void shopFor(String product){
        super.product=product;
        System.out.println("Automating "+getName());
        System.out.println("Adding "+quantity+" amount of "+super.product+" to chart");

    }
}
