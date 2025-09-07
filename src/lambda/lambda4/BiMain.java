package lambda.lambda4;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

/**
 * 매개변수가 2개일 때 Bixxx 시리즈 사용하면 됨
 */
public class BiMain {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println("add.apply = " + add.apply(5, 10));

        BiConsumer<String, Integer> repeat = (s, n) -> {
            for (int i = 0; i < n; i++) {
                System.out.print(s);
            }
            System.out.println();
        };
        repeat.accept("*", 5);

        BiPredicate<Integer, Integer> isGreater = (a, b) -> a > b;
        System.out.println(isGreater.test(4, 1));

    }
}
