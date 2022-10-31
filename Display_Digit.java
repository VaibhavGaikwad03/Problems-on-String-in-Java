
/*
Write a program which accepts string from the user and display only digits from that string 

Input : "marve89llous121"
Output : "89121"

Input : Demo
Output : 
*/


import java.lang.*;
import java.util.*;;

class StringX
{
    public void displayDigit(String str)
    {
        char cArr[] = str.toCharArray();

        for(int i = 0; i < cArr.length; i++)
        {
            if(cArr[i] >= '0' && cArr[i] <= '9')
            {
                System.out.print(cArr[i]);
            }
        }
    }
}

public class Display_Digit
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String s = sobj.nextLine();

        StringX strobj = new StringX();
        strobj.displayDigit(s);
    }
}
