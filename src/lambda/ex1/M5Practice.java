package lambda.ex1;

// 무식한 나의 풀이
public class M5Practice {

    static M5HighOrderFunction sum = (a, b) -> a+b;
    static M5HighOrderFunction sub = (a, b) -> a-b;
    public static void main(String[] args) {
        System.out.println(test("sub", 1, 2));
        System.out.println(test("add", 1, 2));
        System.out.println(test("sdfs", 1,1));
    }
    static int test(String operation, int a, int b) {
        switch (operation){
            case "add":
                return sum.apply(a, b);
            case "sub":
                return sub.apply(a, b);
            default: return 0;
        }
    }
}
