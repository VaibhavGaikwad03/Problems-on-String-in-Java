/*
Write a program which accepts string from the user and copy that characters of string into another string by converting all small characters into capital case

Input : "Marvellous Infosystems"
Output : "MARVELLOUS INFOSYSTEMS"
*/

import java.lang.*;
import java.util.*;

class StringX
{
    public String cpyStrCap(String str)
    {
        char cArr[] = str.toCharArray();
        char cBrr[] = new char[cArr.length];

        for(int i = 0; i < cArr.length; i++)
        {
            if(cArr[i] >= 'a' && cArr[i] <= 'z')
            {
                cBrr[i] = (char)(cArr[i] - 32);
            }
            else
            {
                cBrr[i] = cArr[i];
            }
        }
        String strret = new String(cBrr);

        return strret;
    }
}

public class Str_Cpy_Cap 
{
    public static void main(String aegs[])
    {
        String sRet = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = scanner.nextLine();

        StringX strobj = new StringX();
        sRet = strobj.cpyStrCap(str);
        System.out.println(sRet);
    }
}
