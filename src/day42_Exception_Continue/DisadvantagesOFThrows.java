package day42_Exception_Continue;

public class DisadvantagesOFThrows {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("hello");
        sleep(2.5);
        System.out.println("Cydeo");
    }

    public static void sleep(double seconds) throws InterruptedException{
        Thread.sleep((long)(seconds*1000));
    }
}
