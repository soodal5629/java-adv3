package lambda.ex1;

import java.util.Arrays;

public class M3Practice {
    public static void main(String[] args) {
        M3Time sum = new M3Time() {
            @Override
            public void run() {
                int n = 100;
                long res = 0;
                for (int i = 1; i <= n; i++) {
                    res += i;
                }
                System.out.println("[1부터 100까지 합] 결과: " + res);

            }
        };

        M3Time sort = new M3Time() {
            @Override
            public void run() {
                int[] arr = { 4, 3, 2, 1 };
                System.out.println("원본 배열: " + Arrays.toString(arr));
                Arrays.sort(arr);
                System.out.println("배열 정렬: " + Arrays.toString(arr));
            }
        };

        measure(sum);
        measure(sort);
    }

    static void measure(M3Time function) {
        long startNs = System.nanoTime();

        function.run();

        long endNs = System.nanoTime();
        System.out.println("실행 시간: " + (endNs - startNs) + "ns");
    }
}
