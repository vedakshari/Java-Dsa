import java.util.*;

public class Functions {
    /*public static void printMyName(String name){
        System.out.println(name);
        return;

    }*/

    // public static int sum(int num1,int num2){
    //         System.out.println("Sum of 2 numbers is"+ num1+num2);
    //         return 1;
    // }

    public static void factorial(int n){
        if(n<0){
            System.out.println("Invalid number");
            return;
        }
        int factorial=1;
        for(int i=n;i>=1;i--){
            factorial=factorial*i;
        }
        System.out.println("The factorial is"+ factorial);
        return;

    }
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // String name=sc.next();
        // printMyName(name);
        // Scanner sc=new Scanner(System.in);
        // int num1=sc.nextInt();
        // int num2=sc.nextInt();
        // sum(num1,num2);
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        factorial(n);
        sc.close();
    }
}
