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
    }
}
