import java.util.*;
public class Conditions{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
//if
        // int a =sc.nextInt();
        // int b=sc.nextInt();
        // if(age>18){
        //    System.out.println("Adult");
        // }
        // else{
        //     System.out.println("Not Adult");
        // }


//else if
    //     if(a==b){
    //         System.out.println("Both are equal");
    //     }
    //     else if(a>b){
    //         System.out.println("a is greater");
    //     }
    //     else{
    // System.out.println("b is greater");
    // }
    // }


//switch
    int button=sc.nextInt();
    switch(button){
        case 1:System.out.println("hello");
        break;
        case 2:System.out.println("vanakkam");
        break;
        case 3:System.out.println("vandhanam");
        break;
        default :
        System.out.println("invalid");
    }sc.close();
    }
}