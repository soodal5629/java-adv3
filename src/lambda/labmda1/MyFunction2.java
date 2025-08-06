package lambda.labmda1;

import lambda.MyFunction;

public class MyFunction2 {
    public static void main(String[] args) {
        // 파라미터 있는 람다 (이보다 코드 더 줄일 수 있음)
        MyFunction myFunction = (int a, int b) -> {
                return a + b;
        };

        System.out.println("res = " + myFunction.apply(1, 2));
    }
}
