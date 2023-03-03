
/*
Accept character from user and check whether it is special symbol or not (!, @, #, $, %, ^, &, *)

Input : %
Output : It is special character 

Input : d
Output : It is not a special character
*/
 

import java.lang.*;
import java.util.*;

class StringX
{
    public boolean CheckSpecial(char cValue)
    {
        if((cValue == '!') || (cValue == '@') || (cValue == '#') || (cValue == '$') || (cValue == '%') || (cValue == '^') || (cValue == '&') || (cValue == '*'))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class Check_Special
{
    public static void main(String args[])
    {
        boolean bRet = false;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Character : ");
        char ch = sobj.next().charAt(0);

        StringX strobj = new StringX();

        bRet = strobj.CheckSpecial(ch);

        if(bRet == true)
        {
            System.out.println("It is Special Character");
        }
        else
        {
            System.out.println("It is not a Special Character");
        }
    }
}
