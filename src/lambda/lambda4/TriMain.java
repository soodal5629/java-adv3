package lambda.lambda4;

/**
 * 매개변수가 3개일 때는 직접 함수형 인터페이스를 만들어서 쓰면 됨
 */
public class TriMain {
    public static void main(String[] args) {
        TriFunction<Integer, Integer, Integer, Integer> triFunction
                = (a, b, c) -> a + b + c;
        System.out.println(triFunction.apply(1, 2, 3));
    }
    @FunctionalInterface
    interface TriFunction<A, B, C, R> {
        R apply(A a, B b, C c);
    }

}
