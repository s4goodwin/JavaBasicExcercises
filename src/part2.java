import java.util.Scanner;

public class part2 {
    //15,31,32

    public static void main(String[] args) {
        //15
        System.out.println("15.swap two variables");
        int a, b, temp;
        a = 15;
        b = 27;
        System.out.println("Before swap: a = "+ a +", b = "+ b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swap: a = "+ a +", b = "+ b);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        //17-30 is binary or hexadecimal stuff

        //31
        System.out.println();
        System.out.println("31.check if java is installed");
        System.out.println();
        System.out.println("Java Version: "+ System.getProperty("java.version"));
        System.out.println("Java Runtime Version: "+ System.getProperty("java.runtime.version"));
        System.out.println("Java Home: "+ System.getProperty("java.home"));
        System.out.println("Java Vendor: "+ System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: "+ System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: "+ System.getProperty("java.class.path"));
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        //32
        System.out.println();
        System.out.println("32.compare two numbers");
        Scanner input32 = new Scanner(System.in);
        int firstNum32;
        int secondNum32;
        System.out.println("Enter first number");
        firstNum32 = input32.nextInt();
        System.out.println("Enter second number");
        secondNum32 = input32.nextInt();

        if (firstNum32 == secondNum32)
            System.out.println(firstNum32 +" = "+ secondNum32);
        if (firstNum32 != secondNum32)
            System.out.println(firstNum32 +" != "+ secondNum32);
        if (firstNum32 < secondNum32)
            System.out.println(firstNum32 +" < "+ secondNum32);
        if (firstNum32 > secondNum32)
            System.out.println(firstNum32 +" > "+ secondNum32);
        if (firstNum32 <= secondNum32)
            System.out.println(firstNum32 +" <= "+ secondNum32);
        if (firstNum32 >= secondNum32)
            System.out.println(firstNum32 +" >= "+ secondNum32);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");




    }
}
