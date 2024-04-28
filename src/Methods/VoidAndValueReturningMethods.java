package Methods;
/* 4.1 A call to a method with a void return type is always a statement itself. TRUE
 A call to a value-returning method cannot be a statement itself. FALSE.
 A call to a value-returning method is always a component of an expression.
 Note that a value-returning method can also be invoked as a statement in Java. In this case, the caller simply ignores the return value.

4.2 return type of main: void

4.3 what would be wrong with not writing a return statement in a value-returning method: syntax error would occur
can you have a return statement in a void method: yes, it would be an early return to the method's caller (exits the method)
 */

public class VoidAndValueReturningMethods {
// does the return statement cause a syntax error below -> yes
//    public static void xMethod(double x, double y) {
//        System.out.println(x + y);
//        return x + y;
//    }

    // write method headers:
    // a. return a sales commission, given the sales amount and the commission rate
    public double getSalesCommission(double amount, double commissionRate) {
        double commission = 0;
        // method body
        return commission;
    }

    // b. display the calendar for a month, given the month and the year
    public void printCalendar(int month, int year) {
        // method body
    }

    // c. return the square root of a number
    public double getSquareRoot(double number) {
        double squareRoot = 0;
        // method body
        return squareRoot;
    }

    // d. test whether a number is even, and returning true if it is
    public boolean isEven(int number) {
        boolean isEven = false;
        // method body
        return isEven;
    }

    // e. display a message a specified number of times
    public void displayMessage(String message, int times) {
        // method body
    }

    // f. return the monthly payment given the loan amount, number of years and annual interest rate
    public double getMonthlyPayment(double loanAmount, int numberOfYears, double annualInterestRate) {
        double monthlyPayment = 0;
        // method body
        return monthlyPayment;
    }

    // g. return the corresponding uppercase letter given a lowercase letter
    public char getUpperCase(char lowerCase) {
        char upperCase = 0;
        // method body
        return upperCase;
    }

    // 4.5 correct the errors
    public void method1(int n, int m) {
        n += m;
        method2(3.4);
    }

    public int method2(double n) {
        if (n > 0) {
            return 1;
        } else if (n == 0) {
            return 0;
        } else {
            return -1;
        }
    }

}



