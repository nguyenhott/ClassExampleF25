public class Calculator {

    public double add(double a, double b){
        return a + b;
    }

    public double divide(double a, double b){
        if(b == 0)
            throw new ArithmeticException("Denominator cannot be zero");
        else
            return a/b;

    }
}
