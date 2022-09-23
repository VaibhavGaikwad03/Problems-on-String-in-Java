/*
Write a program which accepts string from the user and return difference between frequency of small characters and frequency of capital characters 

Input : "MarvellouS"
Output : 6 (8 - 2)
*/

import java.lang.*;
import java.util.*;

class StringX
{
    public int Difference(String str)
    {
        int CountCapital = 0;
        int CountSmall = 0;

        char cArr[] = str.toCharArray();

        for(int i = 0; i < cArr.length; i++)
        {
            if((cArr[i] >= 'A') && (cArr[i] <= 'Z'))
            {
                CountCapital++;
            }
            else if((cArr[i] >= 'a') && (cArr[i] <= 'z'))
            {
                CountSmall++;
            }
        }

        return CountSmall - CountCapital;
    }
}

class Difference
{
    public static void main(String args[])
    {
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sobj.nextLine();

        StringX strobj = new StringX();

        iRet = strobj.Difference(str);

        System.out.println("Difference between small and capital letters is : "+iRet);
    }
}