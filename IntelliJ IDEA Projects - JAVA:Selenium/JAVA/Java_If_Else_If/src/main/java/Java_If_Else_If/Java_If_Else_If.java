package Java_If_Else_If;

import java.util.Scanner;

public class Java_If_Else_If {
    public static void main (String[] args){
        System.out.println("Please enter your salary");
        Scanner input = new Scanner(System.in);
        int salary = input.nextInt();
        if (salary >0 && salary <4000)
            System.out.println("Your salary will have no deductions");
        else if (salary>= 4000 && salary<6000)
            System.out.println("You will have a tax of 10%");
        else if (salary>6000)
            System.out.println("You will have 20% tax");
        else
            System.out.println("Invalid salary value. Please enter a valid salary value greater than 0");


        {
            
        }


    }
}
