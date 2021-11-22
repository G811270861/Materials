package baidu;

/**
 * 内部类可以直接调用外部类的成员，包括私有
 * 外部类调用内部类必须创建对象
 */


//外部类
public class Outer {
    private int num = 10;

//    public void method(){
//        InnER innER = new InnER();
//        innER.show2();
//    }


    //内部类
    public class Inner{
        public void show(){
            System.out.println(num);
    }
    }

//    private class InnER{
//            public void show2(){
//                System.out.println(num);
//            }
//    }



}
