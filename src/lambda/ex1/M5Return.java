package lambda.ex1;

import lambda.MyFunction;

// 강사님 풀이
public class M5Return {
    public static void main(String[] args) {
        MyFunction add = getOperator("add");
        System.out.println(add.apply(1, 2));
        MyFunction sub = getOperator("sub");
        System.out.println(sub.apply(3, 2));
    }
    public static MyFunction getOperator(String operator) {
        switch (operator) {
            case "add":
                return (a, b) -> a + b;
            case "sub":
                return (a, b) -> a - b;
            default:
                return (a, b) -> 0;
        }
    }
}
