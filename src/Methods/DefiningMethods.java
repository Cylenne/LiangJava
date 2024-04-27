package Methods;
// 6.1 benefits of using a method: code reuse, can organize and simplify the code + make it easy to maintain

public class DefiningMethods {
    // 6.2 simplify max method
    public static int max(int num1, int num2) {
//        if (num1 > num2) {
//            return num1;
//        }
//        return num2;

        return (num1 > num2) ? num1 : num2;
    }

    /* 6.2
    parameter: variables defined in the method header, like a placeholder
    argument: when a method is invoked, these are the actual values passed to the parameters
    method signature: method name + parameters
     */
}
