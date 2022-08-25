import java.lang.*;
import java.util.*;


class StringX   
{
    public int Count_Cap(String str)
    {
        int iCounter = 0;
        char cArr[] = str.toCharArray();

        for(int i = 0; i < cArr.length; i++)
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
        Scanner sobj = new Scanner(System.in);
        int iRet = 0;

        System.out.println("Enter the String : ");
        String str = sobj.nextLine();

        StringX strx = new StringX();

        iRet = strx.Count_Cap(str);

        System.out.println("Count of capital letters is : "+iRet);

    }
}