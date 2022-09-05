/*
Write a program which accepts string from the user and check whether it contains vowels in it or not

Input : "Marvellous"
Output : It contains vowels

Input : xyz
Output : It does not contains vowels
*/

import java.lang.*;
import java.util.*;

class StringX
{
    

    public boolean CheckVowel(String str)
    {
        int i = 0;

        char cArr[] = str.toCharArray();

        for(i = 0; i < cArr.length; i++)
        {
            if((cArr[i] == 'a') || (cArr[i] == 'e') || (cArr[i] == 'i') || (cArr[i] == 'o') || (cArr[i] == 'u') || (cArr[i] == 'A') || (cArr[i] == 'E') || (cArr[i] == 'I') || (cArr[i] == 'O') || (cArr[i] == 'U'))
            {
                break;
            }
        }
        if(i != cArr.length)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class Check_Vowel
{
    public static void main(String args[])
    {
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sobj.nextLine();

        StringX strobj = new StringX();

        bRet = strobj.CheckVowel(str);

        if(bRet == true)
        {
            System.out.println("String contains vowels");
        }
        else
        {
            System.out.println("String does not contains vowels");
        }
    }
}