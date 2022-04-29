package week14_OOP;

public class Amazon extends Browser{

    public Amazon(String name) {
        super(name);
    }

    public String toString() {
        return "Amazon{" +
                "product='" + product + '\'' +
                '}';
    }

    public String product;

    public void navigetTo(String link){
 // normally we use here selenium code but now we ill use println to understand inheritance
        System.out.println("Navigating to "+link+" using "+super.getName());
    }

    public void shopFor(String product){
        this.product=product;   // instead of initialize with a constructor i can do it in a method
        System.out.println("Navigating to "+ this.product+"'s page");
    }


}
