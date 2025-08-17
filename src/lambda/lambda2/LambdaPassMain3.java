package lambda.lambda2;

import lambda.MyFunction;

public class LambdaPassMain3 {
    public static void main(String[] args) {
        System.out.println("add = " + getOperation("add").apply(1, 2));
        System.out.println("sub = " + getOperation("sub").apply(1, 2));
        System.out.println("test = " + getOperation("test").apply(1, 2));
    }

    static MyFunction getOperation(String operator) {
        switch (operator) {
            case "add" :
                return (a, b) -> a + b;
            case "sub" :
                return (a, b) -> a - b;
            default: return (a, b) -> 0;
        }
    }
}
