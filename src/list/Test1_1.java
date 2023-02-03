package list;

import java.util.ArrayList;
import java.util.List;

public class Test1_1 {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();

        list.add("java1");
        list.add("java2");
        list.add("java3");

        for(int i=0;i<list.size(); i++){
            System.out.println(list.get(i));//리스트 요소를 하나씩 빼서 출력해라
        }

    }
}
