package lambda.lambda3;

import java.util.function.Function;

/**
 * 자바가 기본으로 제공하는 Function 사용
 */
public class TargetType2 {
    public static void main(String[] args) {
        Function<String, String> upperCase = s -> s.toUpperCase();
        String res1 = upperCase.apply("hello");
        System.out.println("res1 = " + res1);

        Function<Integer, Integer> square = n -> n * n;
        Integer res2 = square.apply(3);
        System.out.println("res2 = " + res2);

    }
}
