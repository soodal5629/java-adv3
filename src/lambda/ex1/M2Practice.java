package lambda.ex1;

public class M2Practice {
    public static void main(String[] args) {
        print(10, "kg");
        print(50, "kg");
        print(200, "g");
        print(40, "g");
    }

    static void print(int weight, String unit) {
        System.out.println("무게: " + weight + unit);
    }
}
