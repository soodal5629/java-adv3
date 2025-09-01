package lambda.lambda3;

public class GenericMain1 {
    public static void main(String[] args) {
        StringFunction upperCase = s -> s.toUpperCase();
        String res1 = upperCase.apply("hello");
        System.out.println("res1 = " + res1);

        NumberFunction square =  n -> n * n;
        Integer res2 = square.apply(3);
        System.out.println("res2 = " + res2);
    }

    @FunctionalInterface
    interface StringFunction {
        String apply(String s);
    }
    @FunctionalInterface
    interface NumberFunction {
        Integer apply(Integer s);
    }
}
