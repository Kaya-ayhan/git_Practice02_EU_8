package day42_Exception_Continue;

class FadyException extends RuntimeException{
    public FadyException(){
        super("It's time to  short break");
    }
public FadyException(String message){
    super(message);
}

}
class NoBreakException extends Exception{

}

public class CustomExceptions {
    public static void main(String[] args) {


      //  throw new FadyException("It is time for lunch break");

        try {
            throw new NoBreakException();
        } catch (NoBreakException e) {
            e.printStackTrace();
        }
    }
}
