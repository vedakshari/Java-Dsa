//output,variables,datatypes,input
import java.util.*;
class FourBuildingBlocks
{
    public static void main(String args[])
    {
        System.out.println("This is the output with println(Prints the remaining string in nextline)");
        System.out.print("This is the output with print(Continues in the line \n slash n is used to print in next line)");
        System.out.println("Variables are used to store any value in the memory location it is used to refer the value which varies");
        System.out.println("Datatypes:\n primitive(8) and non-primitive(5)");

        Scanner sc=new Scanner(System.in);
        String name=sc.next();//prints only one token - veda for ben stokes it will only print ben
        System.out.println("name: "+name);
        //String name1=sc.nextLine();//prints the string which is present in the whole line
        sc.close();

    }
}