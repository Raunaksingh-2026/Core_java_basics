package pkg1;

public class E_Operator {
    static void main(String[] args) {
        /**************************** Operators *******************************/

        /************* ARITHMETIC OPERATOR *****************/
        System.out.println("***** Arithmetic Operator *****");

        int a = 10;
        int b = 3;

        System.out.println("Sum : " + a + b); // 103

        System.out.println("Sum : " + (a + b)); // 13
        System.out.println("Sub : " + (a - b)); // 7
        System.out.println("Mul : " + (a * b)); // 30
        System.out.println("Div : " + (a / b)); // 3
        System.out.println("Modulo : " + (a % b)); // 1

        /************* RELATIONAl OPERATOR *****************/
        System.out.println("***** Relational Operator *****");

        int c = 10;
        int d = 20;

        System.out.println("Greater than : " + (c > d));   // false
        System.out.println("Less than : " + (c < d));   // true
        System.out.println("Equal to : " + (c == d));  // false
        System.out.println("Not Equal : " + (c != d));  // true
        System.out.println("Greater than or Equal to : " + (c >= d));  // false
        System.out.println("Less than or Equal to : " + (c <= d));  // true

        /************* LOGICAL OPERATOR *****************/
        System.out.println("***** Logical Operator *****");

        boolean e = true;
        boolean f = false;

        System.out.println("AND : " + (e && f)); // false
        System.out.println("OR : " + (e || f)); // true
        System.out.println("NOT : " + (!e));     // false

        /************* ASSIGNMENT OPERATOR *****************/
        System.out.println("***** Assignment Operator *****");

        int g = 10;
        System.out.println(g); // 10

        g += 5;// g = g + 5
        System.out.println(g); // 15

        g -= 5;// g = g - 5
        System.out.println(g); // 10

        g *= 5;
        System.out.println(g); // 50

        g /= 5;
        System.out.println(g); // 10

        /************* INCREMENT & DECREMENT OPERATOR *****************/
        System.out.println("***** Increment & Decrement Operator *****");

        int h = 10;

//        PRE INCREMENT -> Use first, then increment
        System.out.println("Before Pre Increment : " + h); // 10
        h++;// h = h + 1
        System.out.println("After Pre Increment : " + h); // 10

        System.out.println("Before Pre decrement : " + h); // 10
        h--;// h = h + 1
        System.out.println("After Pre Decrement : " + h); // 10
/*
//        POST INCREMENT -> Increment first, then use
//        ++h;// h = h + 1
        System.out.println("After Post Increment : " + h); // 10
        System.out.println("Before Post Increment : " + (--h)); // 10
        System.out.println("After Post Increment : " + h); // 10

        --h;// h = h + 1
        System.out.println("Before Post Decrement : " + h); // 10
        System.out.println("After Post Decrement : " + h); // 10
*/
        /************* BITWISE OPERATOR *****************/
//        Later

    }
}
