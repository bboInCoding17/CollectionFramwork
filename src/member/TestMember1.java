package member;

import java.util.ArrayList;
import java.util.List;

public class TestMember1 {
    public static void main(String[] args) {
        List <Member> list = new ArrayList<>();
        Member member1 = new Member();
        Member member2 = new Member();
        Member member3 = new Member();

        member1.toString();
        member2.toString();
        member3.toString();

        int sum =0;

        for(int i =0; i<list.size(); i++){
            sum = sum + list.get(i);
        }


    }
}
