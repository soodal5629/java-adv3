package lambda.labmda1;

import lambda.Procedure;

public class InstanceMain {
    public static void main(String[] args) {
        Procedure procedure1 = new Procedure() {
            @Override
            public void run() {
                System.out.println("hello! lambda");
            }
        };
        // 익명 클래스는 출력시 뒤에 $ 표시가 붙음
        System.out.println("class.class = " + procedure1.getClass());
        System.out.println("class.instance = " + procedure1);

        Procedure procedure2 = () -> {
            System.out.println("hello! lambda");
        };
        // 람다는 출력 시 뒤에 $$ 표시가 붙음
        System.out.println("class.class = " + procedure2.getClass());
        System.out.println("class.instance = " + procedure2);
    }
}
