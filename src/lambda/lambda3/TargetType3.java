package lambda.lambda3;

import java.util.function.Function;

/**
 * 자바가 기본으로 제공하는 Function 대입
 */
public class TargetType3 {
    public static void main(String[] args) {
        // 람다 직접 대입
        Function<Integer, String> functionA = n -> "value = " + n;
        System.out.println("functionA.apply(5) = " + functionA.apply(5));

        // 같은 타입 대입 (같은 타입이므로 대입 가능!)
        Function<Integer, String> functionB = functionA;
        System.out.println("functionB.apply(5) = " + functionB.apply(5));

        System.out.println(functionA);
        System.out.println(functionB);
        System.out.println(functionA.equals(functionB));
    }
}
