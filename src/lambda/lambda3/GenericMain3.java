package lambda.lambda3;

/**
 * 이해하기 쉽게 익명 클래스 사용
 */
public class GenericMain3 {
    public static void main(String[] args) {
        ObjectFunction upperCase = new ObjectFunction() {
            @Override
            public Object apply(Object s) {
                return ((String) s).toUpperCase();
            }
        };
        String res1 = (String) upperCase.apply("hello");
        System.out.println("res1 = " + res1);

        ObjectFunction square = new ObjectFunction() {
            @Override
            public Object apply(Object n) {
                return (Integer) n * (Integer) n;
            }
        };
        Integer res2 = (Integer) square.apply(3);
        System.out.println("res2 = " + res2);
    }

    @FunctionalInterface
    interface ObjectFunction {
        Object apply(Object s);
    }
}
