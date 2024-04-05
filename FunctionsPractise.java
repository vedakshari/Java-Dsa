/*
Enter 3 numbers from the user & make a function to print their average.
1.Write a function to print the sum of all odd numbers from 1 to n.
2.Write a function which takes in 2 numbers and returns the greater of those two.
3.Write a function that takes in the radius as input and returns the circumference of a circle.
4.Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
5.Write an infinite loop using do while condition.
6.Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 
7.Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
8.Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)
9.Write a program to print Fibonacci series of n terms where n is input by user :
0 1 1 2 3 5 8 13 21 ..... 
10.In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
(BONUS)
*/
import java.util.*;
public class FunctionsPractise {
//Enter 3 numbers from the user & make a function to print their average.
        // public static int average(int a,int b,int c){
        //     int average=(a+b+c)/3;
        //     System.out.println("The average of 3 numbers are:" + average);
        //     return average;
        // }
  

//Write a function to print the sum of all odd numbers from 1 to n.
        //     public static void sum(int n){
        //         int sum=0;
        //         for(int i=1;i<=n;i++){
        //             if(i%2!=0)
        //             {
        //             sum=sum+i;
        //            }
        //         }
        //     System.out.println("The sum of odd numbers is" +sum);
        
        // }


// Write a function which takes in 2 numbers and returns the greater of those two.
            // public static void greater(int a,int b){
            //     if(a>b){
            //         System.out.println("a is greater than b");
            //     }
            //     else{
            //         System.out.println("b is greater");
            //     }
            // }


//Write a function that takes in the radius as input and returns the circumference of a circle.
                // public static void circum(float radius){
                //     double circumference=(2*3.14*radius);
                //     System.out.println("The circumstance of the circle is" + circumference);
                // }

//Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

                    // public static void eligible(int age){
                    //     if(age>=18){
                    //         System.out.println("Eligible to vote");
                    //     }
                    //     else{
                    //         System.out.println("Not eligible to vote");
                    //     }
                    // }

//Write an infinite loop using do while condition.
                    //     public static void infinite(){
                    //         int i=1;
                    //     do{
                    //         i=i+1;
                    //         System.out.println(i);
                    //     }while(i!=0);
                    // }

                    public static void main(String[] args) {
                            Scanner sc=new Scanner(System.in);
                            //System.out.println("Enter a,b,c values: ");
                            // int a=sc.nextInt();
                            // int b=sc.nextInt();
                            // int c=sc.nextInt();
                            // average(a, b, c);
                            
                            
                            //System.out.println("Enter n value to sum all the odd numbers: ");
                            // int n=sc.nextInt();
                            // sum(n);
                            
                            
                            //System.out.println("Enter a value: ");
                            // int a =sc.nextInt();
                            //System.out.println("Enter b value: ");
                            // int b=sc.nextInt();
                            // greater(a,b);
                            
                            
                            //System.out.println("Enter the radius: ");
                            // float radius=sc.nextFloat();
                            // circum(radius);
                            
                            
                            // System.out.println("Enter the age: ");
                            // int age=sc.nextInt();
                            // eligible(age);
                            
                            // infinite();


//Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 
                                /*int positive=0,negative=0,zeros=0;
                                System.out.println("Press 1 to continue and 0 to stop:");
                                int input=sc.nextInt();
                                while(input==1){
                                        System.out.println("Enter your number:");
                                        int number=sc.nextInt();
                                        if(number>0){
                                                positive++;
                                        }
                                        else if(number<0){
                                                negative++;}
                                        else{
                                                zeros++;

                                        }
                                        System.out.println("Press 1 to continue and 0 to stop:");
                                        input=sc.nextInt();
                                }
                                System.out.println("Positives : "+ positive);
                                System.out.println("Negatives : "+ negative);
                                System.out.println("Zeros : "+ zeros);*/

//Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
                                /*System.out.println("Enter x value:");
                                int x=sc.nextInt();
                                System.out.println("Enter n value:");
                                int n=sc.nextInt();
                                int result=1;
                                for(int i=0;i<n;i++){
                                        result=result*x;
                                }
                                System.out.println("The result is:" +result);*/
                        }
                }
