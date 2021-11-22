package baidu;

public class InnerDemo {
    public static void main(String[] args) {

        //调用内部类
        Outer.Inner inner = new Outer().new Inner();//此方法只针对public内部类
        inner.show();

//        //调用private修饰的内部类，只能通过外部类方法中创建内部类对象调用
//        Outer outer = new Outer();
//        outer.method();

    }
}
