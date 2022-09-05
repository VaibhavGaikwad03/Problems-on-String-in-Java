/*
Accept character from user and check whether it is Digit or not

Input : 7
Output : It is a Digit

Input : d
Output : It is not a Digit
*/

import java.lang.*;
import java.util.*;

class StringX
{
    public boolean CheckDigit(char cValue)
    {
        if((cValue >= '1') && (cValue <= '9'))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class Check_Digit
{
    public static void main(String args[])
    {
        boolean bRet = false;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Input : ");
        char ch = sobj.next().charAt(0);

        StringX strobj = new StringX();

        bRet = strobj.CheckDigit(ch);

        if(bRet == true)
        {
            System.out.println("It is Digit");
        }
        else
        {
            System.out.println("It is not a Digit");
        }
    }
}