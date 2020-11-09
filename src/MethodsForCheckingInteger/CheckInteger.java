package MethodsForCheckingInteger;

import java.util.Scanner;

public class CheckInteger {
    Scanner scanner = new Scanner(System.in);
    public int checkIfInt(){
        int a = 0;
        try{
            a = Integer.parseInt(scanner.nextLine());
        }catch(Exception e){
            System.out.println("Please enter a number");
            a = checkIfInt();
        }
        return a;
    }
}
