package day41_Excetions;

public class Exception_Handling {

    public static void main(String[] args) {

        System.out.println("Test2 started");
        try {
            System.out.println(9 / 0);  //try bloku burada atlayıp catch bloğu yapıcak
            System.out.println("Try Block");
        } catch (ArithmeticException e) {
            System.out.println("Catch Block");
            System.out.println("Arithmetic Exception was occured");
            System.out.println("--------------------");
        }
           /*  System.out.println("Test started");
            int[] nums ={1,2,3,4,5};

            try{

           System.out.println(nums[200]);
                System.out.println("Try block");
            } catch(NullPointerException e1){  // exception ismi tutmazsa catch bloku çalıştırmaz o yüzden bütün uncheck exception ların parent classı runtime exception class ı yazabiliriz.
                System.out.println("Catch block");
                System.out.println("Null Pointer Exception was occured");
            }
            System.out.println("Test Completed");

        }


        System.out.println("Test completed");
        }
          */
            System.out.println("--------------------");
            System.out.println("Test started");
            int[] nums = {1, 2, 3, 4, 5};

            try {

                System.out.println(nums[200]);
                System.out.println("Try block");
            } catch (RuntimeException e2) {  // exception ismi tutmazsa catch bloku çalıştırmaz o yüzden bütün uncheck exception ların parent classı runtime exception class ı yazabiliriz.
                System.out.println("Catch block");
                System.out.println("Null Pointer Exception was occured");
            }
            System.out.println("Test2 Completed");

        System.out.println("------------");
        System.out.println("Test started");
        int[] nums1 = {1, 2, 3, 4, 5};

        try {

            System.out.println(nums[200]);
            System.out.println("Try block");
        } catch (RuntimeException e2) {  //
           e2.printStackTrace();  // prints a stack trace full details of the exception. it is not terminate thr blok or program
           // System.out.println(e2.getMessage());  burda da mesajı yazdırıyor tüm detayı ile
        }

        System.out.println("---------------------------");
        System.out.println("Test 4 started");

        try {
            System.out.println("Cydeo".substring(2, 0));
        }catch(RuntimeException c){
           c.printStackTrace();
        }
        System.out.println("Test 4 completed");

        }


    }


