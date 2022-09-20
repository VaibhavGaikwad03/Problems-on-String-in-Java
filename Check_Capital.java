/*
Accept character from user and check whether it is Capital or not

Input : F
Output : It is a Capital Character

Input : d
Output : It is not a Capital Character
*/


import java.lang.*;
import java.util.*;

class StringX
{
    public boolean CheckCapital(char cValue)
    {
        if((cValue >= 'A')&&(cValue <= 'Z'))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class Check_Capital
{
    public static void main(String args[])
    {
        boolean bRet = false;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the character : ");
        char ch = sobj.next().charAt(0);

        StringX strobj = new StringX();

        bRet = strobj.CheckCapital(ch);

        if(bRet == true)
        {
            System.out.println("It is a capital letter");
        }
        else
        {
            System.out.println("It is not a capital letter");
        }
    }
}