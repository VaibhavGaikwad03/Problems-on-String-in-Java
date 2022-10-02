/*
Accept character from user. If it is capital then display all the characters from the input characters till Z. if input character is small then print all the characters in reverse order till a. In other cases return directly.

Input : Q
Output : Q R S T U V W X Y Z

Input : i
Output : i h g f e  d c b a 

Input : 8
Output : 
*/


import java.lang.*;
import java.util.*;

class StringX
{
    public void DisplayChar(char cValue)
    {
        if((cValue >= 'A') && (cValue <= 'Z'))
        {
            while(cValue <= 'Z')
            {
                System.out.print(cValue+"\t");
                cValue++;
            }
        }
        else if((cValue >= 'a') && (cValue <= 'z'))
        {
            while(cValue >= 'a')
            {
                System.out.print(cValue+"\t");
                cValue--;
            }
        }
        else
        {
            System.out.println(cValue+" is not a character");
        }
    }
}

class Display
{
    public static void main(String args[])
    {
       Scanner sobj = new Scanner(System.in);
       
       System.out.println("Enter the character : ");
       char ch = sobj.next().charAt(0);

        StringX  strx = new StringX();
        strx.DisplayChar(ch);
    }
}