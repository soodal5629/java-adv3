package lambda.start;

import lambda.Procedure;

import java.util.Random;

// 영한쌤이 만든 공통 메서드
// 익명 클래스 사용
public class Ex1RefMain2 {
    // 인터페이스를 이용해서 코드 조각을 전달
    public static void hello(Procedure procedure) {
        long startNs = System.nanoTime();
        procedure.run();
        long endNs = System.nanoTime();
        System.out.println("실행 시간: " + (endNs - startNs) + "ns");
    }

    public static void main(String[] args) throws Exception {
        // 익명 클래스 이용
        Procedure dice = new Procedure() {
            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + randomValue);
            }
        };
        Procedure sum = new Procedure() {
            @Override
            public void run() {
                for (int i = 1; i <= 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        };
        hello(dice);
        hello(sum);
    }
}
