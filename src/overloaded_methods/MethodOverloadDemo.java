package overloaded_methods;

public class MethodOverloadDemo {
    public static void main(String[] args) {
        Overload overloadMethod = new Overload();
        int resultInt;
        double resultDouble;

        // Call all methods
        overloadMethod.overloadDemo();
        System.out.println();
        overloadMethod.overloadDemo(2);
        System.out.println();
        resultInt = overloadMethod.overloadDemo(4, 6);
        System.out.println("Result overloadMethod.overloadDemo(4, 6): " +
                resultInt);
        System.out.println();
        resultDouble = overloadMethod.overloadDemo(1.1, 2.32);
        System.out.println("Result overloadMethod.overloadDemo (1.1, 2.32): "+
                resultDouble);
    }
}