package IfStatementsPg19;

import java.util.Scanner;

public class Pg26 {
    public static void main(String[] args) {
/*
        10) Type code to print the messages about the Body Mass Index(BMI) for the
        given BMI values.
        Invalid BMI value < 0
        Underweight = <18.5
        Normal weight = 18.5–24.9
        Overweight = 25–29.9
        Obesity = BMI of 30 or greater
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your weight in kg");
        double weight = input.nextDouble();
        System.out.println("Enter your height in meters");
        double height = input.nextDouble();

        double bmi = weight/(height*height);
        System.out.println(bmi);

        if(bmi>=30){
            System.out.println("Obese");
        }else if(bmi==29.9 && bmi ==25){
            System.out.println("Overweight");
        }else if(bmi==24.9 && bmi==18.5){
            System.out.println("Normal weight");
        }else if(bmi<18.8){
            System.out.println("Underweight");
        }else if(bmi<=0){
            System.out.println("Invalid bmi value");
        }





    }
}
