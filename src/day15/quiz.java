package day15;

 public class quiz {
    public quiz(){
        System.out.println("Developer");

    }
    public   quiz(int a){
        this(2.5);

        System.out.println("SDET");
    }
  public quiz(double c){

                System.out.println("C");
    }

    public static void main(String[] args) {
        quiz obj=new quiz(100);

    }
}
