/*
Accepet character from user and check whether it is Small or not

Input : f
Output : It is a Small Character

Input : A
Output : It is not a Small Character
*/

import java.lang.*;
import java.util.*;

class StringX
{
    public boolean CheckSmall(char cValue)
    {
        if((cValue >= 'a') && (cValue <= 'z'))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class Check_Small
{
    public static void main(String args[])
    {
        boolean bRet = false;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Input : ");
        char ch = sobj.next().charAt(0);

        StringX strobj = new StringX();

        bRet = strobj.CheckSmall(ch);

        if(bRet == true)
        {
            System.out.println("It is Small Character");
        }
        else
        {
            System.out.println("It is not a Small Character");
        }
    }
}