/*
Write a program which accepts string from the user and count number of capital letters

Input : "Marvellous Multi OS"
Output : 4
*/

import java.lang.*;
import java.util.*;

class StringX
{
    public int CountCapital(String str)
    {
        int i = 0, iCounter = 0;
        char cArr[] = str.toCharArray();

        for(i = 0; i < cArr.length; i++)
        {
            if((cArr[i] >= 'A') && (cArr[i] <= 'Z'))
            {
                iCounter++;
            }
        }

        return iCounter;
    }
}

class Count_Capital
{
    public static void main(String args[])
    {
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sobj.nextLine();

        StringX strobj = new StringX();
        iRet = strobj.CountCapital(str);

        System.out.println("Count of capital letters is : "+iRet);   
    }
}