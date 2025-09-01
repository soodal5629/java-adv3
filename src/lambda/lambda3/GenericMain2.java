package lambda.lambda3;

/**
 * 코드 재사용을 위해 String과 Integer의 부모인 Object로 코드 통합
 */
public class GenericMain2 {
    public static void main(String[] args) {
        ObjectFunction upperCase = s -> ((String)s).toUpperCase();
        String res1 = (String) upperCase.apply("hello");
        System.out.println("res1 = " + res1);

        ObjectFunction square =  n -> (Integer) n * (Integer) n;
        Integer res2 = (Integer) square.apply(3);
        System.out.println("res2 = " + res2);
    }

    @FunctionalInterface
    interface ObjectFunction {
        Object apply(Object s);
    }
}
