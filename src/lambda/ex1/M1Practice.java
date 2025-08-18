package lambda.ex1;

public class M1Practice {
    public static void main(String[] args) {
        greeting("Good Morning");
        greeting("Good Afternoon");
        greeting("Good Evening");
    }

    static void greeting(String message) {
        System.out.println("=== 시작 ===");
        System.out.println(message);
        System.out.println("=== 끝 ===");
    }

}
