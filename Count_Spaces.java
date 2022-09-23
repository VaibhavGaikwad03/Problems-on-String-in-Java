/*
Write a program which accepts  string from the user and count number of white spaces 

Input : "Marvellous"
Output : 0

Input : "Marvellous Infosystems by Piyush Manohar Khairnar"
Output : 5
*/

import java.lang.*;
import java.util.Scanner;

class StringX
{
    public int CountSpaces(String str)
    {
        int iCount = 0;
        char cArr[] = str.toCharArray();

        for(int i = 0; i < cArr.length; i++)
        {
            if(cArr[i] == ' ')
            {
                iCount++;
            }
        }

        return iCount;
    }
}

class Count_Spaces
{
    public static void main(String args[])
    {
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sobj.nextLine();

        StringX strobj = new StringX();
        iRet = strobj.CountSpaces(str);

        System.out.println("Count of spaces in the string is : "+iRet);
    }
}