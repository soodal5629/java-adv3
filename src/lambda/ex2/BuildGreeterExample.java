package lambda.ex2;

public class BuildGreeterExample {
    // 고차 함수, greeting 문자열을 받아, "새로운 함수를" 반환
    public static StringFunction buildGreeter(String greeting) {
        // 코드 작성
        return value -> greeting + ", " + value; // 적절한 람다 반환
    }
    public static void main(String[] args) {
        // 코드 작성
        StringFunction helloGreeter = buildGreeter("Hello");
        String res1 = helloGreeter.apply("Java");// Hello, Java 리턴해야 함
        System.out.println("res1 = " + res1);
        StringFunction hiGreeter = buildGreeter("Hi");
        String res2 = hiGreeter.apply("Lambda"); // Hi, Lambda 리턴해야 함
        System.out.println("res2 = " + res2);

    }
}
