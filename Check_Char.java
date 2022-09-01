/*
Write a program which accepts  string from the user and accept one character. Check whether that character is present in string or not

Input : "Marvellous Multi OS"
Input : e
Output : Character is present in string

Input : "Marvellous Multi OS"
Input : W
Output : Character is not present in string
*/

import java.lang.*;
import java.util.*;

class StringX
{
    public boolean CheckChar(String str, char cValue)
    {
        int i = 0;
        boolean bFlag = false;
        char cArr[] = str.toCharArray();

        for(i = 0; i < cArr.length; i++)
        {
            if(cArr[i] == cValue)
            {
                bFlag = true;
                break;
            }
        }
        if(bFlag == true)
        {
            return bFlag;
        }
        else
        {
            return bFlag;
        }
    }
}

class Check_Char
{
    public static void main(String args[])
    {
        boolean bRet = false;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sobj.nextLine();

        System.out.println("Enter the Character which you want to check present or not :");
        char cValue = sobj.next().charAt(0);

        StringX strobj = new StringX();
        bRet = strobj.CheckChar(str, cValue);

        if(bRet == true)
        {
            System.out.println("Character is present in the String");
        }
        else
        {
            System.out.println("Character is not present in the String");
        }
    }
}