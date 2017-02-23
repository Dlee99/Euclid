package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter in first number.");
        int a = sc.nextInt();
        System.out.println("Enter in second number.");
        int b = sc.nextInt();
        int GCD =
                rec(a, b)
                //iter(a, b)
                ;
        System.out.println("Your greatest common divisor is " + GCD);

    }
    public static int rec(int a, int b){
        if(a == 0){
            return b;
        }
        else if(b == 0){
            return a;
        }
        else{
            if(a > b){
                int remainder = a % b;
                return rec(b, remainder);
            }
            else{
                int remainder = b % a;
                return rec(a, remainder);
            }
        }

    }
    public static int iter(int a, int b){
        while(true) {
            if (a == 0) {
                return b;
            } else if (b == 0) {
                return a;
            }
            else{
                if(a > b){
                    int remainder = a % b;
                    a = b;
                    b = remainder;
                }
                else{
                    int remainder = b % a;
                    b = remainder;
                }
            }
        }
    }
}
