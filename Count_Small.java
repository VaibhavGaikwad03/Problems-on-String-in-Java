/*
Write a java program which accept string from user and count number of small characters.

Input : "Marvellous"
Output : 9

 */


import java.lang.*;
import java.util.*;


class StringX   
{
    public int CountSmall(String str)
    {
        int iCounter = 0;
        char cArr[] = str.toCharArray();

        for(int i = 0; i < cArr.length; i++)
        {
            if((cArr[i] >= 'a') && (cArr[i] <= 'z'))
            {
                iCounter++;
            }
        }
        return iCounter;
    }
}

class Count_Small
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        int iRet = 0;

        System.out.println("Enter the String : ");
        String str = sobj.nextLine();

        StringX strx = new StringX();

        iRet = strx.CountSmall(str);

        System.out.println("Count of small letters is : "+iRet);

    }
}