package lambda.lambda3;

/**
 * 제네릭 이용
 */
public class GenericMain4 {
    public static void main(String[] args) {
        GenericFunction<String, String> upperCase = new GenericFunction<>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        };
        String res1 = upperCase.apply("hello");
        System.out.println("res1 = " + res1);

        GenericFunction<Integer, Integer> square = new GenericFunction<>() {
            @Override
            public Integer apply(Integer n) {
                return n * n;
            }
        };
        Integer res2 = square.apply(3);
        System.out.println("res2 = " + res2);
    }

    @FunctionalInterface
    interface GenericFunction<T, R> {
        R apply(T s);
    }
}
