package baidu_05;

public class RunningTest {
    public static void main(String[] args) {
        RunningOperator runningOperator = new RunningOperator();
        runningOperator.method(new Running() {
            @Override
            public void show() {
                System.out.println("跑");
            }
        });
    }
}
