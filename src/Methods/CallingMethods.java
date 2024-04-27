package Methods;

public class CallingMethods {
    /* 3.1: to define a method: you write the method header and the method body
    to invoke a method: 1. if the method returns a value, the method is treated as a value,
    2. if a method returns void, the call to the method must be a statement

     */
    // reformat the following code
    public static double decreaseValue (double i, double j) {
        while (i < j) {
            j--;
        }
        return j;
    }
}
