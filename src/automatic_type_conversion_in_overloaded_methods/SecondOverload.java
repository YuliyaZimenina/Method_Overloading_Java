package automatic_type_conversion_in_overloaded_methods;
/*
The impact of automatic type conversions on overloaded
method recognition.
 */
public class SecondOverload {
    void overloadedMethodF(int x){
        System.out.println("Inside the OverloadedMethodF (int): " + x);
    }
    void overloadedMethodF(double x){
        System.out.println("Inside the OverloadedMethodF (double): " + x);
    }
}
