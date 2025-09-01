package lambda.lambda3;

/**
 * 람다 이용
 */
public class GenericMain5 {
    public static void main(String[] args) {
        GenericFunction<String, String> upperCase = s -> s.toUpperCase();
        String res1 = upperCase.apply("hello");
        System.out.println("res1 = " + res1);

        GenericFunction<Integer, Integer> square = n -> n * n;
        Integer res2 = square.apply(3);
        System.out.println("res2 = " + res2);
    }

    @FunctionalInterface
    interface GenericFunction<T, R> {
        R apply(T s);
    }
}
