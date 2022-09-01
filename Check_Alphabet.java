/*
Accepet character from user and check whether it is alphabet or not
Input : F
Output : It is an Alphabet
Input : $
Output : It is not an Alphabet
*/

import java.lang.*;
import java.util.*;

class StringX
{
    public boolean CheckAlphabet(char cValue)
    {
        if(((cValue >= 'A') || (cValue >= 'a'))&&((cValue <= 'Z') || (cValue <= 'z')))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class Check_Alphabet
{
    public static void main(String args[])
    {
        boolean bRet = false;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a Character : ");
        char cValue = sobj.next().charAt(0);

        StringX strobj = new StringX();
        bRet = strobj.CheckAlphabet(cValue);

        if(bRet == true)
        {
            System.out.println("It is an alphabet");
        }
        else
        {
            System.out.println("It is not an alphabet");
        }
    }
}