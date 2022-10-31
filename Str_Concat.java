/*
Write a program which accepts 2 strings from user and concat second string after first string. (Implement strcat() function). 

Input : "Marvellous Infosystems"
Input : "Logic Building"

Output : "Marvellous Infosystems Logic Building"
*/
import java.lang.*;
import java.util.*;

class StringX
{
    public String strConcat(String dest, String src)
    {
        dest = dest.concat(src);

        return dest;
    }
}

public class Str_Concat 
{
    public static void main(String[] args) 
    {
        String sConcated = null;
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the first string : ");
        String str1 = sobj.nextLine();

        System.out.println("Enter the second string : ");
        String str2 = sobj.nextLine();

        StringX strobj = new StringX();
        sConcated = strobj.strConcat(str1, str2);

        System.out.println(sConcated);
    }
}
