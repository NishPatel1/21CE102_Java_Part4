/*
 * Created by:- Nishkumar Patel
 * ID:- 21CE102
 * Aim:- WAP to show the try - catch block to catch the different types of exception.
 * Github Repository Link:- https://github.com/NishPatel1/21CE102_Java_Part4.git
 */

import java.util.*;

public class TryCatchExample {
    public static void main(String[] args) {
        try{
                System.out.println(10/0);
        }
        catch(ArithmeticException e){
            System.out.println("There is an ArithmeticExecption");
        }
    }
}
