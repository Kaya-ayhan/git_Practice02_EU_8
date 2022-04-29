package week14_OOP;

public class Test {

    public static void main(String[] args) {
        Amazon amazon = new Amazon("Crome");
        System.out.println("I am automating amazon home page" + amazon.getName());
        System.out.println("my opert syst is " + Browser.getOSname());

        amazon.navigetTo("www.amazon.com");
        amazon.navigetTo("Search for laptops");
        amazon.shopFor("Samsung PC");


        Productpage productObject = new Productpage("Crome", 2);
        // productObject.shopFor("Samsung PC");  // amazon.product
        String product = amazon.product;
        productObject.shopFor(product);
        amazon.navigetTo("CartPage");

        CartPage cart=new CartPage("Crome","Mike Smith");
        cart.fillInfo();
        cart.payFor(1236547896);
        cart.setBrowserType("Firefox");
        cart.closeBrowser();

        cart.setBrowserType("Firefox");
        System.out.println("I am automating "+ cart.getName());
        System.out.println("I am automating "+ amazon.getName());




    }
}
