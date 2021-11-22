package baidu_04;

public class JumppingOperator {
    //method方法要的是一个接口，其实要的是该接口的实现类对象，而匿名内部类的本质就是一个实现类对象
    public void method(Jumpping j){
        j.jump();
    }
}
