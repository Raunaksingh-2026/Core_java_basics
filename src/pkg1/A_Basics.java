package pkg1;

import java.text.NumberFormat;
import java.util.Date;
import java.util.Scanner;

public class A_Basics { // CLASS_NAME is "Main" and FILE_NAME is "Main.java" must be same and here 'public' is ACESS_MODIFIER
    static void main(String[] args) { // here 'void' is RETURN_TYPE of FUNCTION, 'main' is FUNCTION_NAME

        /************************** Variables ****************************/
        int age = 20;
        double salary = 50000.50;
        char grade = 'A';
        boolean isJavaFun = true;
        String name = "Raunak";

        System.out.println("Got it"); // here DOT( . ) operator is used for accessing the MEMBERS of CLASS named as "System" and "println" is FUNCTION

        /************************** DATA TYPE ***************************/
        int number1 = 0b101;// here we use binary format to initialize literals or value of variable
        int number2 = 0x101;// here we use hexadecimal formate initialize literals or value of variable
        int number3 = 101; // here we use decimal formate to initialize literals or value of variable
        byte number4 = 70;
        System.out.println(number4);
        // Date currentDateAndTime = new Date();
        // System.out.println(currentDateAndTime);

        /************************** CONSTANT ***************************/
        final float PI = 3.14F; // "final" is keyword used for CONSTANT and cannot be changed within whole program, and here "F" is SUFFIX used for FLOAT DATA_TYPE
        System.out.println(PI);

        /************************** TYPE CASTING or TYPE_CONVERSION ***************************/
//        IMPLICIT TYPE_CONVERSION
//        byte > short > char > int > long > float > double

        int typeOne = 32;
        double typeAnother = typeOne + 3.98;
        System.out.println(typeAnother);

        long typeOne1 = 123454434345L;
        float typeAnother1 = typeOne1 + 3.56F;
        System.out.println(typeAnother1);

//         EXPLICIT TYPE_CONVERSION
        double typeOne2 = 32.98;
//        int typeAnother2 = typeOne2 + 3; // this will show "incompatible types: possible lossy conversion from double to int" because here 'typeOne2' is DOUBLE DATA_TYPE, and we're going to store in INT DATA_TYPE
        int typeAnother2 = (int)typeOne2 + 3; // we manually convert 'typeOne2' which is DOUBLE DATA_TYPE to INT DATA_TYPE
        System.out.println(typeAnother2);

//        above TYPE_CONVERSION is work only with compatible DATA_TYPE like CHAR to BYTE or CHAR to DOUBLE and so on but not used for converting STRING to other

        /************************** STRING DATA_TYPE TO OTHER ***************************/
        String typeOne3 = "32.98";
        double typeAnother3 = Double.parseDouble(typeOne3) + 3;
        System.out.println(typeAnother3);

        String typeOne4 = "32";
        int typeAnother4 = Integer.parseInt(typeOne4) + 3;
        System.out.println(typeAnother4);

        /************************** NUMBER FORMAT ***************************/
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(3443959200508.556654);
        System.out.println(result);

        String percent = NumberFormat.getPercentInstance().format(0.457);
        System.out.println(percent);


    }
}