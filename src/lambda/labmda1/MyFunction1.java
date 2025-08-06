package lambda.labmda1;

import lambda.MyFunction;

public class MyFunction1 {
    public static void main(String[] args) {
        MyFunction myFunction = new MyFunction() {
            @Override
            public int apply(int a, int b) {
                return a + b;
            }
        };

        System.out.println("res = " + myFunction.apply(1, 2));
    }
}
