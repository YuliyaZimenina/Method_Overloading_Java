package overloaded_methods;

// Method overloading Demo
public class Overload {
    // First version of the method
    void overloadDemo() {
        System.out.println("No parameters");
    }

    // Overloaded version of a method with one int parameter
    void overloadDemo(int a) {
        System.out.println("One parameter of type int: a = " + a);
    }

    // Overloaded version of a method with two int parameters
    int overloadDemo(int a, int b) {
        System.out.println("Two parameters of type int: a = " + a + ", b = " + b);
        return a + b;
    }

    // Overloaded version of a method with two double parameters
    double overloadDemo(double a, double b) {
        System.out.println("Two parameters of type double: a = " + a + ", b = " + b);
        return a + b;
    }

}
