package lambda.lambda3;

public class TargetType1 {
    public static void main(String[] args) {
        // 람다 직접 대입 : 문제 없음
        FunctionA functionA = i -> "value = " + i;
        String res1 = functionA.apply(10);
        System.out.println("res1: " + res1);
        FunctionB functionB = i -> "value = " + i;
        String res2 = functionA.apply(2);
        System.out.println("res1: " + res2);

        // 이미 만들어진 FunctionA 인스턴스를 FunctionB에 대입 -> 타입 다르므로 당연히 안됨
        // FunctionB targetB = functionA; // 컴파일 에러

    }
    // ======= 이름만 다른 두 함수형 인터페이스
    @FunctionalInterface
    interface FunctionA {
        String apply(Integer i);
    }

    @FunctionalInterface
    interface FunctionB {
        String apply(Integer i);
    }
}
