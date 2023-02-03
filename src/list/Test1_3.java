package list;

import java.util.ArrayList;
import java.util.List;

public class Test1_3 {
    public static void main(String[] args) {
        List<String> li = new ArrayList<>();
        li.add("홍길동");
        li.add("홍길");
        li.add("홍");
        li.add("김");

//        for(String e : li){
//            System.out.println("해당 이름이 존재합니다.");
//        }
        for (int i = 0; i < li.size(); i++) {
            if (li.get(i).equals("홍길동")) {
                System.out.println("해당이름이존재합니다.");
            }
        }
    }
}