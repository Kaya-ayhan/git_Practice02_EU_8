package week14_OOP;

public class CartPage extends Amazon{


    public String buyerInfo;
    public CartPage(String name,String buyerInfo) {
        super(name);
        this.buyerInfo=buyerInfo;
    }

    public void fillInfo(){
        System.out.println("Filling the necessary fields with "+buyerInfo);
    }
    public void payFor(long creditNum){
        System.out.println("fill in the balanks"+ creditNum);
    }


}
