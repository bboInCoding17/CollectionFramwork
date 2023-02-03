package list;

import java.util.ArrayList;
import java.util.List;

public class List01 {
    public static void main(String[] args) {
        //ArrayList 사용
        //데이터가 여러 개 저장될 수 있는 통을 생성(공간)
        //그 공간의 이름이 list1
        //단점 : 같은 자료형의 데이터만 들어갈 수 있다.
        //그래서 < > 안에 저장될 데이터의 자료형을 지정한다.
        //앞에 < > 에 자료형 넣어주고, 뒤에 < > 는 자료형은 생략 가능하다. < > 만 남겨두기
        ArrayList<String> list1 = new ArrayList<String>();

        //인터페이스 List를 불러옴
        List <String> list = new ArrayList<> () ;

        //데이터 저장 : 중복 가능, 넣은 순서대로 정보가 저장됨
        list.add("java");
        list.add("c++");
        list.add("python");
        list.add("python");


        //데이터 삭제 :정보 자체를 말하면 인식하지 못한다. 그래서 순서를 입력해야 인식 가능하다(index 입력)
//      //삭제 후 공간이 재설정 되어 index 순서가 바뀐다.
        list.remove(0);


       // 데이터 읽기
        list.get(0);
        System.out.println(list.get(0));// c++

        //list에 저장된 데이터의 개수
        System.out.println(list.size());//3

        //list에 저장된 모든 데이터 출력
        for(int i =0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
