package lambda.labmda1;

public class LambdaSimple4 {
    public static void main(String[] args) {
        // 기본
        MyCall call1 = (int value) -> value * 2;
        // 타입 생략
        MyCall call2 = (value) -> value * 3;
        // 괄호도 생략 - 매개변수가 1개 일 때만 가능
        MyCall call3 = value -> value * 4;
        System.out.println("call3 = " + call3.call(2));
    }

    interface MyCall {
        int call(int value);
    }
}
