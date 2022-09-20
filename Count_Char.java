
/*
Write a program which accepts  string from the user and accept one character. return frequency of that character

Input : "Marvellous Multi OS"
Input : M
Output : 2

Input : "Marvellous Multi OS"
Input : W
Output : 0
*/

import java.lang.*;
import java.util.*;

class StringX
{
    public int CountChar(String str, char cValue)
    {
        int iCount = 0;

        char cArr[] = str.toCharArray();

        for(int i = 0; i < cArr.length; i++)
        {
            if(cArr[i] == cValue)
            {
                iCount++;
            }
        }

        return iCount;
    }
}

class Count_Char
{
    public static void main(String args[])
    {
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sobj.nextLine();

        StringX strobj = new StringX();

        System.out.println("Enter the character : ");
        char ch = sobj.next().charAt(0);

        iRet = strobj.CountChar(str, ch);

        System.out.println(ch+" Occurs "+iRet+" times");
    }
}