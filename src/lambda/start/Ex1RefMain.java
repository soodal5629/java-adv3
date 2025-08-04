package lambda.start;

import lambda.Procedure;

import java.util.Random;

// 영한쌤이 만든 공통 메서드
public class Ex1RefMain {
    // 인터페이스를 이용해서 코드 조각을 전달
    public static void hello(Procedure procedure) {
        long startNs = System.nanoTime();
        procedure.run();
        long endNs = System.nanoTime();
        System.out.println("실행 시간: " + (endNs - startNs) + "ns");
    }

    static class Dice implements Procedure {
        @Override
        public void run() {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위 = " + randomValue);
        }
    }

    static class Sum implements Procedure {

        @Override
        public void run() {
            for (int i = 1; i <= 3; i++) {
                System.out.println("i = " + i);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        //helloDice();
        //helloSum();
        Procedure dice = new Dice();
        Procedure sum = new Sum();
        hello(dice);
        hello(sum);
    }
}
