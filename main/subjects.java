package com.subjects;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	float mark1,mark2,mark3,mark4,mark5;
	double total,percentage;
        System.out.println("Enter the mark of first subject");
        mark1= sc.nextFloat();
        System.out.println("Enter the mark of second subject");
        mark2= sc.nextFloat();
        System.out.println("Enter the mark of third subject");
        mark3= sc.nextFloat();
        System.out.println("Enter the mark of fourth subject");
        mark4= sc.nextFloat();
        System.out.println("Enter the mark of fifth subject");
        mark5= sc.nextFloat();
        total= mark1 + mark2 + mark3 + mark4 + mark5;
        percentage=(total / 500) * 100;
        System.out.println("total mark ="+total);
        System.out.println("percentage ="+percentage);

        if(percentage>=70 && percentage<=100){
            System.out.println("A grade");
        }
        else if(percentage>=50 && percentage<=69){
            System.out.println("B grade");
        }
        else if(percentage>=30 && percentage<=49){
            System.out.println("C grade");
        }
        else{
            System.out.println("failed");
        }


    }
}

