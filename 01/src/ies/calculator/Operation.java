package ies.calculator;

public class Operation {
    protected Float sum(Float x, Float y) {
        return (x + y);
    }
    protected Float sub(Float x, Float y) {
        return (x - y);
    }
    protected Float multipl(Float x, Float y) {
        return (x * y);
    }
    protected Float div(Float x, Float y) {
        if (y == 0) {
            throw new ArithmeticException("stupid ass nigga");
        }
        return (x / y);
    }
}