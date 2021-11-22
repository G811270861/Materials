package baidu_02;

//局部内部类:实在方法中定义的类
public class Outer {
    private int num = 30;

    public void method(){

        //定义局部内部类
        class Inner{
            public void show(){
                System.out.println(num);
            }
        }
        Inner inner = new Inner();
        inner.show();
    }

}
