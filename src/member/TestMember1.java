package member;

import java.util.ArrayList;
import java.util.List;

public class TestMember1 {
    public static void main(String[] args) {
        //Member 객체를 저장할 수 있는 리스트 생성
        List <Member> list = new ArrayList<>();

        //Member 객체 3개 생성 및 리스트에 추가.
        Member member1 = new Member();
        Member member2 = new Member();
        Member member3 = new Member();

        member1.setId("ja");
        member2.setId("jaa");
        member3.setId("java");

        member1.setPw("12");
        member2.setPw("123");
        member3.setPw("1234");

        member1.setName("김");
        member2.setName("이");
        member3.setName("박");

        member1.setAge(20);
        member2.setAge(21);
        member3.setAge(22);

        //list에 Member 각 객체 추가.
        list.add(member1);
        list.add(member2);
        list.add(member3);

        //모든 회원의 정보 출력
        for(int i =0; i<list.size(); i++) {
            System.out.println(list.get(i).toString());//toString 생략 가능
                      //list에 저장된 Member의 객체를 문자열로 출력한다. 뜻
        }

        //list 저장된 모든 회원의 나이 합 출력 1번 방법
        int sum1 = 0;
        for(int i =0; i<list.size(); i++){
          sum1 =sum1 + list.get(i).getAge() ;
        }
        System.out.println("저장된 모든 회원의  나이 합 : " + sum1);

        //list 저장된 모든 회원의 나이 합 출력 2번 방법
        int sum2=0;
        for(Member member:list){
            sum2 = sum2 +  member.getAge();
        }
        System.out.println("저장된 모든 회원의  나이 합 : " + sum2);


        //list에 저장된 회원 중 id가 java인 회원을 지우는 코드 작성하세요.
        for(int i =0; i<list.size(); i++){
            if(list.get(i).getId().equals("java")){
                list.remove(i);
            }
            //System.out.println(list.get(i).toString());
        }

        //삭제된 회원 정보 제외하고 모든 회원 출력
        for(int i =0; i<list.size(); i++) {
            System.out.println(list.get(i).toString());//toString 생략 가능
            //list에 저장된 Member의 객체를 문자열로 출력한다. 뜻
        }

    }
}
