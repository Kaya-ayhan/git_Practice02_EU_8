package quizalist;

import java.util.ArrayList;
import java.util.Arrays;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));
        for(Integer each:list){
            if(each%2!=0){
                continue;
            }
            String a=each+" ";
            System.out.print(a);
            break;
        }

    }
}
