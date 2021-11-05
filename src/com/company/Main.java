package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num;
        int odd = 0;
        int even = 0;
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter digits here");
        num= sc.nextInt();

        for(i=1; i<=num; i++){
            if(i%2==0)
                even=even+i;
            else
                odd=odd+i;
        }
        System.out.println("Sum of even numbers are: "+even);
        System.out.println("Sum of odd numbers is: "+ odd);

    }
}
