package lambda.start;

import lambda.Procedure;

import java.util.Random;

// 영한쌤이 만든 공통 메서드
// 람다 사용
public class Ex1RefMain34 {
    // 인터페이스를 이용해서 코드 조각을 전달
    public static void hello(Procedure procedure) {
        long startNs = System.nanoTime();
        procedure.run();
        long endNs = System.nanoTime();
        System.out.println("실행 시간: " + (endNs - startNs) + "ns");
    }

    public static void main(String[] args) throws Exception {
        // 람다 이용
        hello(() -> {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위 = " + randomValue);
        });
        hello(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("i = " + i);
            }
        });
    }
}
