package day41_Excetions;

public class FinallyBlock {

    public static void main(String[] args) {

        int[] arr={1,2,3,4,5};
        try{
            System.out.println(arr[10]);
        }catch (RuntimeException e){
            System.out.println("Catch Block");
           e.printStackTrace();
           //  to stop the execution of finally blok:finally blok u ugulamamak için tek çözüm System.exit(0); yapmaktır.
        }finally{
            System.out.println("Finally block");
        }
    }
}
