import java.util.*;

public class TestMyException {
    
    static Scanner sc = new Scanner(System.in);

    public static void lincence() throws MyException{
        int age = sc.nextInt();
            if(age<18)
                throw new MyException("You are not eligible for lincence");
            else if(age>60)
                throw new MyException("You don't required lincence, enjoy...");
            else
                System.out.println("Congratulations..  you got yoour lincense");

    }
    public static void main(String[] args) {
        try{
            lincence();
        }
        catch(MyException e){
            System.out.println(e);
        }
    }
}
