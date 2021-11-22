package baidu_04;

public class JumppingDemo {
    public static void main(String[] args) {
        JumppingOperator jumppingOperator = new JumppingOperator();
        Jumpping jumpping=new Jumpping(){
            @Override
            public void jump() {
                System.out.println("跳高！");
            }
        };
        jumppingOperator.method(jumpping);
        jumppingOperator.method(new Jumpping() {
            @Override
            public void jump() {
                System.out.println("跳高！！");
            }
        });
    }
}
