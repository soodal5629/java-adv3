package lambda.start;

public class ExMain {
    public static void helloJava() {
        System.out.println("프로그램 시작");
        System.out.println("Hello Java");
        System.out.println("프로그램 종료");
    }
    public static void helloSpring() {
        System.out.println("프로그램 시작");
        System.out.println("Hello Spring");
        System.out.println("프로그램 종료");
    }

    // 공통 메서드 생성 - 재사용 용이
    public static void helloCommon(String message) {
        System.out.println("프로그램 시작");
        System.out.println(message);
        System.out.println("프로그램 종료");
    }


    public static void main(String[] args) {
        helloJava();
        helloSpring();
        helloCommon("HelloSpring");
    }
}
