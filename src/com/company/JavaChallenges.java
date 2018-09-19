package com.company;

public class JavaChallenges {


    public static void fibonneci(int n1, int n2, int count) {

        for (int i = 2; i < count; i++) {
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+n3);
            fibonneci(n1, n2, count);
        }

    }

    public static void main(String[] args){
            // to calculate a fibbinocia series so the the value

            //    the value will be the sum of the previous ones


            int n1 = 0, n2 = 1;

            System.out.print(n1 + " " + n2);

           fibonneci(0, 1, 10);

       /* while (count < 10) {

            fib = n1 + n2;
            System.out.print( " "+fib);

            n1=n2;
            n2=fib;
            count++;

        }*/
        }


}
