package lambda.lambda3;

/**
 * 람다 이용
 */
public class GenericMain6 {
    public static void main(String[] args) {
        GenericFunction<String, String> toUpperCase = s -> s.toUpperCase();
        GenericFunction<String, Integer> stringLength = s -> s.length();
        GenericFunction<Integer, Integer> square = n -> n * n;
        GenericFunction<Integer, Boolean> isEven = n -> n % 2 == 0;

        System.out.println("toUpperCase = " + toUpperCase.apply("hello"));
        System.out.println("stringLength = " + stringLength.apply("test"));
        System.out.println("square = " + square.apply(2));
        System.out.println("isEven = " + isEven.apply(3));
    }

    @FunctionalInterface
    interface GenericFunction<T, R> {
        R apply(T s);
    }
}
