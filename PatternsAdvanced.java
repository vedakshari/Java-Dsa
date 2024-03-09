public class PatternsAdvanced {
    public static void main(String args[]){
    //10. Butterfly pattern
/*
    *      *
    **    **
    ***  ***
    ********
    ********
    ***  ***
    **    **
    *      *
 */
        int n=5;
        // 1st upperpart
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            //2nd upperpart
            int spaces=2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        //1st lowerpart
            for(int i=n;i>=1;i--){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
    
                //2nd lowerpart
                int spaces=2*(n-i);
                for(int j=1;j<=spaces;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println("");
        }

//11. solid rhombus
/* 
    *****
   *****
  *****
 *****
*****
*/
        for(int i=1;i<=n;i++){
            int spaces=n-i;
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

//12. number pyramid
/* 
        1
       2 2
      3 3 3 
     4 4 4 4
    5 5 5 5 5
*/
        for(int i=1;i<=n;i++){
            int spaces=n-i;
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println("");
        }
        

//13. Palindrome patern
/*
     1
    212
   32123
  4321234
 543212345
*/

        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //1st half
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            //second half
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
//14. Diamond pattern
/*
   *
  ***
 *****
*******
*******
 *****
  ***
   *
    
 */
int n1=4;
//upper half
 for(int i=1;i<=n1;i++){
    //spaces
    for(int j=1;j<=n1-i;j++){
        System.out.print(" ");
    }
    //stars
    for(int j=1;j<=2*i-1;j++){
        System.out.print("*");
    }
    System.out.println("");
 }
 //lower half
 for(int i=n1;i>=1;i--){
    //spaces
    for(int j=1;j<=n1-i;j++){
        System.out.print(" ");
    }
    //stars
    for(int j=1;j<=2*i-1;j++){
        System.out.print("*");
    }
    System.out.println("");
 }
        }
}

