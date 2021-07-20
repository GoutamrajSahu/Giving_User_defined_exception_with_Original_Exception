package com.company;
import java.util.*;;

class EnterYourPasswordException extends RuntimeException{
    EnterYourPasswordException (String message,NullPointerException e){
        super(message,e);
    }
}
class Main {
    public static void checkPassword(String pass){
        try{
            if(pass == ""){
                throw new NullPointerException();
            }else{
                System.out.println("Success...");
            }
        }catch (NullPointerException e){
            throw new EnterYourPasswordException("Kindly enter the password ",e);
        }
    }
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        String pass = Sc.nextLine();
        checkPassword(pass);
    }
}