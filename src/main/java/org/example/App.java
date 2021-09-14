/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Zarin Tasnim
 */
import java.util.Scanner;
class num_to_names{

    public static void main(String args[])
    {
        String month="";
        System.out.print("Please enter the number of the month: ");
        Scanner sc = new Scanner(System.in);
        int numb=sc.nextInt();
        switch(numb) //switch and case statement
        {
            case 1: month="January";
            break;

            case 2: month="February";
            break;

            case 3: month="March";
            break;

            case 4: month="April";
            break;

            case 5: month="May";
            break;

            case 6: month="June";
            break;

            case 7: month="July";
            break;

            case 8: month="August";
            break;

            case 9: month="September";
            break;

            case 10: month="October";
            break;

            case 11: month="Novermber";
            break;

            case 12: month="December";
            break;

            default:
                break;


        }

        String answer=(numb>0 &&numb<13)?"The name of the month is ":"Sorry please try again.";
        System.out.print(answer+month); //single output

    }
}