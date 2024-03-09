public class Patterns{
    public static void main(String args[]){

// 1.To print a rectangle with 5 columns 4 rows
/*  
    ***** 
    *****
    *****
    *****
*/

    // --  int n=4;
    // --int m=5;
    //   for(int n=1;n<=4;n++){
    //     for(int m=1;m<=5;m++){
    //         System.out.print("*");//inner loop
    //     }
    //     System.out.println();//outerloop
    //   }
    //   System.out.println("Yahoo we have created a pattern");

// 2. Hollow rectangle
/*
    ***** 
    *   *
    *   *
    ***** 
*/
    // for(int n=1;n<=4;n++){//rows outer loop
    //     for(int m=1;m<=5;m++){
    //         if(n==1||n==4||m==1||m==5){
    //             System.out.print("*");//but prints * without space
    //         }
    //         else{
    //             System.out.print(" "); //prints space
    //         }
    //         }
    //      System.out.println("");//goto nextline after incremrnting n value
    // }

// 3. half pyramid
/*
    *
    **
    ***
    ****
*/

// for(int n=1;n<=4;n++){
//     for(int n1=1;n1<=n;n1++){
//         System.out.print("*");
//     }
//     System.out.println("");
// }


// 4. reverse half pyramid
/*
    ****
    ***
    **
    *  
*/

// for(int n=4;n>=1;n--){
//     for(int n1=1;n1<=n;n1++){
//         System.out.print("*");
//     }
//     System.out.println("");
// }


// 5. inverted half pyramid
/* 
    *
    **
    ***
    ****
*/

// int n=4;
// for(int i=1;i<=n;i++){
//     for(int s=1;s<=n-i;s++){
//         System.out.print(" ");//starting spaces
//     }
//     for(int n1=1;n1<=i;n1++)
//     {
//         System.out.print("*");//for stars
//     }
//     System.out.println("");//for next line
// }

// 6. half pyramid with numbers
/* 
   1
   12
   123
   1234
*/

// int n=4;
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=i;j++){
//         System.out.print(j);
//     }
//         System.out.println("");
// }
   

// 7. inverted half pyramid with numbers
/*
     12345
     1234
     123
     12
     1
*/

//    for(int i=5;i>=1;i--){
//     for(int j=1;j<=i;j++){
//         System.out.print(j);
//     }
//     System.out.println("");
//    }


// 8. floyds traingle
/*  
    1
    23
    456
    78910
    1112131415
*/

// int number=1;
//   for(int i=1;i<=5;i++){
//     for(int j=1;j<=i;j++){
//     System.out.print(number);
//     number++;
//     }
//     System.out.println("");
//   }

// 9. 0-1 traingle
/*
    1
    01
    101
    0101
    10101
*/

for(int i=1;i<=5;i++){
    for(int j=1;j<=i;j++){
        if((i+j)%2==0){
            System.out.print(1);}
        else{
            System.out.print(0);
        }
        }
        System.out.println("");
    }
}
}
