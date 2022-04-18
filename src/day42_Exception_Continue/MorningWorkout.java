package day42_Exception_Continue;

public class MorningWorkout {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("----------Push up started.---------------");
        for(int i=0;i<=30 ; i++) {
            System.out.println("Push up "+i);
            try {
                Thread.sleep(150);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("----------Push up completed.---------------");

        System.out.println("----------Pull up started.---------------");
        for(int i=0;i<=20 ; i++) {
            System.out.print("\rPull up "+i);

               sleep(2.5);

        }
        System.out.print("----------\rPull up completed.---------------");


    }
    public static  void sleep(double seconds){
        try {
            Thread.sleep((long)seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
