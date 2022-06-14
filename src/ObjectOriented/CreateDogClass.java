package ObjectOriented;

public class CreateDogClass {
    public  static String name;
    public CreateDogClass (String name){
        //这个构造器仅有一个参数：name
        this.name=name;
    }
    public static String getName(){
        return name;
    }

    public static void main(String[] args){
        // 下面的语句将创建一个对象
        CreateDogClass  dog = new CreateDogClass ("tommy");
        System.out.println("小狗的名字："+CreateDogClass.getName());
    }
}
