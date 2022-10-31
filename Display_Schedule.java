/*
Accept division of student from user and depends in the division display exam timing. There are 4 divisions in school as A, B, C, D. Exam of division A at 7 AM, B at 8:30 AM, C at 9:20 AM and D at 10:30 AM. (Application should be case insensitive)

Input : C
Output : Your exam at 9:30 AM

Input : d
Output : Your exam at 10:30 AM
*/

import java.lang.*;
import java.util.*;

class Schedule
{
    public void displaySchedule(char cDiv)
    {
        if((cDiv == 'A') || (cDiv == 'a'))
        {
            System.out.println("Your exam at 7:30 AM");
        }
        else if((cDiv == 'B') || (cDiv == 'b'))
        {
            System.out.println("Your exam at 8:30 AM");
        }
        else if((cDiv == 'C') || (cDiv == 'c'))
        {
            System.out.println("Your exam at 9:30 AM");
        }
        else if((cDiv == 'D') || (cDiv == 'd'))
        {
            System.out.println("Your exam at 10:30 AM");
        }
        else
        {
            System.out.println("Please enter valid division !");
        }
    }
}

public class Display_Schedule 
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your Division : ");
        char ch = sobj.next().charAt(0);

        Schedule schobj = new Schedule();
        schobj.displaySchedule(ch);
    }
}
