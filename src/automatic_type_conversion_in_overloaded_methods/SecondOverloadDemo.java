package automatic_type_conversion_in_overloaded_methods;

public class SecondOverloadDemo {
    public static void main(String[] args) {
        SecondOverload secondOverload = new SecondOverload();
        int i = 10;
        double d = 10;
        byte b = 99;
        short s = 10;
        float f = 11.5F;
        System.out.println("Calling a method on a variable of type int: ");
        secondOverload.overloadedMethodF(i); // called: overloadedMethodF(int)
        System.out.println("Calling a method on a variable of type double: ");
        secondOverload.overloadedMethodF(d);// called: overloadedMethodF(double)
        System.out.println("Calling a method on a variable of type byte: ");
        secondOverload.overloadedMethodF(b);// called: overloadedMethodF(int) with conversation
        System.out.println("Calling a method on a variable of type short: ");
        secondOverload.overloadedMethodF(s);// called: overloadedMethodF(int) with conversation
        System.out.println("Calling a method on a variable of type float: ");
        secondOverload.overloadedMethodF(f);// called: overloadedMethodF(double) with conversation
    }
}
