import java.util.Scanner;

public class part1 {
    //2-13

    public static void main(String[] args) {
        //https://www.w3resource.com/java-exercises/basic/index.php

        //2
        System.out.println(24+26);
        //3
        System.out.println(50/3);
        //4
        System.out.println(-5+8*6);
        System.out.println((55+9)%9); //percentage is maybe something with dividing and remaineder
        System.out.println(20+-3*5/8);
        System.out.println(5+15/3*2-8%3);

        //5
        System.out.println();
        System.out.println("5.product");
        Scanner input5 = new Scanner(System.in);
        System.out.println("Input First Number");
        int firstNumber5 = input5.nextInt();
        System.out.println("Input Second Number");
        int secondNumber5 = input5.nextInt();
        System.out.println("The Product is: " + firstNumber5*secondNumber5);

        //6
        System.out.println();
        System.out.println("6.multiple operations");
        Scanner input6 = new Scanner(System.in);
        System.out.println("Input First Number");
        int firstNumber6=input6.nextInt();
        System.out.println("Input Second Number");
        int secondNumber6 = input6.nextInt();
        System.out.println("The sum is: "+firstNumber6+secondNumber6);
        System.out.println("The difference is: "+(firstNumber6-secondNumber6));
        System.out.println("The product is: "+firstNumber6*secondNumber6);
        System.out.println("The quotient is: "+firstNumber6/secondNumber6);
        System.out.println("The remainder is: "+firstNumber6%secondNumber6);

        //7
        System.out.println();
        System.out.println("7.print multiplication table");
        Scanner input7 = new Scanner(System.in);
        System.out.println("Input number");
        int number7 = input7.nextInt();

        for (int i=0; i<10; i++){
            System.out.println(number7 + " * " + (i+1) + " = " + (number7*(i+1)));
        }

        //8

        //9
        System.out.println();
        System.out.println("9.compute expression");
        System.out.println((25.5*3.5-3.5*3.5)/(40.5-4.5));

        //10
        System.out.println();
        System.out.println("10.compute formula w/ double variable");
        double result = 4.0*(1-(1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
        System.out.println(result);

        //11
        System.out.println();
        System.out.println("11.area and perimeter of circle");
        double radius11 = 7.5;
        double perimeter11 = 2*Math.PI*radius11;
        double area11 = Math.PI*radius11*radius11;
        System.out.println("Perimeter: "+perimeter11);
        System.out.println("Area: "+area11);

        //12
        System.out.println();
        System.out.println("12.print average of 5 inputs");
        //scanner and user input
        Scanner input12 = new Scanner(System.in);
        System.out.println("Input first number");
        int firstNumber12 = input12.nextInt();
        System.out.println("Input second number");
        int secondNumber12 = input12.nextInt();
        System.out.println("Input third number");
        int thirdNumber12 = input12.nextInt();
        System.out.println("Input fourth number");
        int fourthNumber12 = input12.nextInt();
        System.out.println("Input fifth number");
        int fifthNumber12 = input12.nextInt();
        //print out average
        System.out.println("The average is: " +
                (fifthNumber12 + secondNumber12 + thirdNumber12 + fourthNumber12 + fifthNumber12)/5);

        //13
        System.out.println();
        System.out.println("13.area and perimeter of rectangle");
        double width13 = 5.5;
        double height13 = 8.5;
        double perimeter13 = 2*(width13+height13);
        double area13 = width13*height13;
        System.out.println("Perimeter is: "+ perimeter13);
        System.out.println("Area is: "+ area13);

    }
}
