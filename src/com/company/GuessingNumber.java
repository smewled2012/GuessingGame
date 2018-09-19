package com.company;
import java.util.Scanner;

public class GuessingNumber {
    public static void main(String[] args){

        System.out.println("\nThis is Guessing game !");

//    this the computer choose a random number between to ranges

        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter the minimum range ");
        int min =  scan.nextInt();
        System.out.println("Enter the maximum range ");
        int max= scan.nextInt();
        int random = (int) (Math.random()*max+min);
       //1 System.out.println("random number choosen "+random);
        int count=0;

        while(count<=max){
            System.out.println("I have chosen a number between "+min+ " and "+ max + " Try to guess it !");
            Scanner scan1 = new Scanner(System.in);
            int number = scan1.nextInt();
            if(number==random){
                System.out.println("Secret number = " + random);
                break;
            }
            else{
                System.out.println("your guess: "+ number);
                System.out.println("That is incorrect. Guess again.");
                if(number>random ){
                    System.out.println("Please Enter a lower number than "+ number);

                }
                else{
                    System.out.println("Please Enter a higher number than "+ number);
                }

                count++;

            }

        }





    }
}
