package baidu_03;

//匿名内部类：本质是一个继承了该类或者实现了该接口的子类匿名对象
public class Outer {

    public void mehtod(){

         //这仅仅是创建了一个匿名内部类，不能调用方法
        new Inner(){
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };

        //匿名内部类调用方法
        /*
        new Inner(){
            @Override
            public void show() {
                System.out.println("匿名内部类！");
            }
        }.show();

        new Inner(){
            @Override
            public void show() {
                System.out.println("匿名内部类！");
            }
        }.show();
        */
         //多次调用方法
        Inner i =new Inner(){

            @Override
            public void show() {
                System.out.println("匿名内部类！！");
            }
        };
        i.show();
        i.show();
        i.show();
    }

}
