package JVM;

public class TestStacks {
    public static void main(String[] args)throws InterruptedException{
        System.out.println("Call main...");
        method1();
    }

    public static void method1(){
        //static修饰的为静态方法，属于类，不属于对象实例，
        //只能调用静态变量（类变量）
        System.out.println("Call method1...");
        method2(1,2);
    }

    public static int method2(int a,int b){
        System.out.println("Call method2...");
        int c =a+b;
        return c;
    }
}
