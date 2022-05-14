package com.bridgelab.iocContainer;

import java.util.Scanner;

public class CalcIMPL implements Calculator{

    public void UI(){
        Scanner scan = new Scanner(System.in);
        int choice = -1;
        do{
            System.out.println("\nCalculator Using Spring IoC Container");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Division");
            System.out.println("4.Multiplication");
            System.out.println("0.Exit");
            System.out.println("Enter the choice:");
            choice = scan.nextInt();

            if(choice==0){
                break;
            }

            System.out.println("Enter the value of a:");
            int a=scan.nextInt();
            System.out.println("Enter the value of b:");
            int b=scan.nextInt();

            switch(choice){
                case 1:
                    addition(a,b);
                    break;
                case 2:
                    subtraction(a,b);
                    break;
                case 3:
                    division(a,b);
                    break;
                case 4:
                    multiplication(a,b);
                    break;
                default:
                    System.out.println("Wrong Choice");
                    break;
            }
        }while(choice!=0);
    }

    @Override
    public void addition(int a, int b) {
        System.out.println("Addition - "+(a+b));
    }

    @Override
    public void subtraction(int a, int b) {
        System.out.println("Subtraction - "+(a-b));
    }

    @Override
    public void division(int a, int b) {
        System.out.println("Division - "+(a/b));
    }

    @Override
    public void multiplication(int a, int b) {
        System.out.println("Multiplication - "+(a*b));
    }
}
