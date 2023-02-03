package member1_1;

import java.util.Scanner;

public class TestMember2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MemberManage mm = new MemberManage();//MemberManage에 옵션1~5의 모든 기능을 사용하기 위해서 객체생성


        while (true) {
            System.out.print("회원등록 <1> 회원정보조회<2> 모든회원정보조회 <3> 회원삭제<4> 회원비밀번호변경<5>");
            int option = sc.nextInt();

            switch (option){
                case 1:
                    mm.regMember();
                    break;
                case 2:
                    mm.showInfoByName();
                    break;
                case 3:

                    mm.showAllInfo();
                    break;
                case 4:

                    break;
                case 5:
            }












        }
    }
}
