/*
Write a program which accepts  string from the user and copy the contents of that string into another string. 

Input : "Marvellous Multi OS"
Output : "Marvellous Multi OS"
*/

import java.lang.*;
import java.util.*;

class StringX
{
    public String strCpy(String str)
    {   
        char cArr[] = str.toCharArray();
        char cBrr[] = new char[cArr.length];

        for(int i = 0; i < cArr.length; i++)
        {
            cBrr[i] = cArr[i];
        }

        String strn = new String(cBrr);
        return strn;
    }
}

public class Str_Cpy 
{
    public static void main(String[] args) 
    {
        Scanner scannerobj = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = scannerobj.nextLine();

        StringX strobj = new StringX();
        String strcpy = strobj.strCpy(str);

        System.out.println(strcpy);
    }
}