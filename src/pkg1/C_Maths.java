package pkg1;

import java.text.NumberFormat;
import java.util.Random;

public class C_Maths {
    static void main(String[] args) {

        int floatToInt = Math.round(32.98F); // here "round" is METHOD in MATH CLASS and this METHOD is OVERLOADED which means it can be implemented twice either it takes FLOAT DATA_TYPE os DOUBLE DATA_TYPE as ARGUMENT and return an INT value or LONG value
        System.out.print("ROUND OFF of 32.98 is :- \t");
        System.out.println(floatToInt);

        long doubleToLong = Math.round(32.48);
        System.out.print("ROUND OFF of 32.48 is :- \t");
        System.out.println(doubleToLong);

        int doubleToDouble = (int) Math.ceil(32.48);
        System.out.print("CEIL value of 32.48 is :- \t");
        System.out.println(doubleToDouble);

        int doubleToDouble1 = (int) Math.floor(32.48);
        System.out.print("FLOOR value of 32.48 i :- \t");
        System.out.println(doubleToDouble1);

        double randomNumbers1 = Math.random(); // here "random" is method which return DOUBLE value
        System.out.println(randomNumbers1);

        int randomNumbers2 = (int) (Math.random() * 10);
        System.out.println(randomNumbers2);

        Random randomNumber = new Random(); // here we create an object named as "randomNumber" using RANDOM class
        int number = randomNumber.nextInt(1,6); // here we declare "number" and assign "randomNumber"
        System.out.println( number);

        System.out.println(Math.addExact(38, 2));
    }
}
