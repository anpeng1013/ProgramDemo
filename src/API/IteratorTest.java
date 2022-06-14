package API;
import java.util.*;
public class IteratorTest {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        list.add("Happy");
        //第一种遍历方法使用 For-Each 遍历 List
        for (String str : list) {
            System.out.println(str);
        }

        //第二种遍历，把列表变为数组相关的内容进行遍历
        String[] strArray=new String[list.size()];
        list.toArray(strArray);
        for(int i=0;i<strArray.length;i++) {
            System.out.println(strArray[i]);
        }

        //第三种遍历 使用迭代器进行相关遍历
        Iterator<String> ite=list.iterator();
        while(ite.hasNext()) {
            System.out.println(ite.next());
        }
    }
}
