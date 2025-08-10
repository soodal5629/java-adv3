package lambda.labmda1;

public class SamMain {
    public static void main(String[] args) {
        SamInterface samInterface  = () -> {
            System.out.println("SAM");
        };
        samInterface.run();

        // 람다는 추상 메서드가 2개 이상인 인터페이스에 할당할 수 없음
        // 따라서 아래 코드는 컴파일 에러 발생
//        NotSamInterface notSamInterface = () -> {
//            System.out.println("!!!");
//        };
//        notSamInterface.go();
    }
}
