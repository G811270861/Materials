package baidu_02;

public class OuterTest {
    public static void main(String[] args) {
        //局部内部类直接调用方法是不行的，需要在方法中创建对象在调用
        Outer outer = new Outer();
        outer.method();
    }
}
