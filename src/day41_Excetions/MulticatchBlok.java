package day41_Excetions;

import day39_Encapsulation_Inheritance.CydeoTask.Employee;

public class MulticatchBlok {

    public static void main(String[] args) {
        Employee employee = null;

        try {
            System.out.println(employee.getSalary());
        }catch(IndexOutOfBoundsException e){
            System.out.println("First catch blok");
            e.printStackTrace();
        }catch(ArithmeticException e){
            System.out.println("Second catch blok");
            e.printStackTrace();
        } /* catch(NullPointerException e){
            System.out.println("Third catch blok");
            e.printStackTrace();
        }  */ catch(ClassCastException e){
            System.out.println("Fourth catch blok");
            e.printStackTrace();
        }catch(RuntimeException e){
            System.out.println("Fifth catch blok");
            e.printStackTrace();
        }
        System.out.println("Test completed");
        System.out.println("-----------------------");
        try{
            System.out.println("Java".charAt(-1));
        }catch(RuntimeException e){
            e.printStackTrace();
        }
        System.out.println("Test completed");
    }
}
