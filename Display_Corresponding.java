
/*
Accept character from user. if character is small display its corresponding capital character and if it is small then display its corresponding capital. In other cases display as it is.

Input : Q
Output : q

Input : m
Output : M

Input : 3
Output : 3

Input : % 
Output : %
*/

import java.lang.*;
import java.util.*;

class StringX
{
    public void displayCorresponding(char cValue)
    {
        if((cValue >= 'A') && (cValue <= 'Z'))
        {
            cValue = (char)(cValue+32);
            System.out.println("Corresponding character is : "+cValue);
        }
        else if((cValue >= 'a') && (cValue <= 'z'))
        {
            cValue = (char)(cValue-32);
            System.out.println("Corresponding character is : "+cValue);
        }
        else
        {
            System.out.println(cValue);
        }
    }
}

class Display_Corresponding
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a character : ");
        char ch = sobj.next().charAt(0);

        StringX strx = new StringX();
        strx.displayCorresponding(ch);
    }
}