package member1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestMember2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Member3> member= new ArrayList<>();
        Member3 m3 = new Member3();
        member.add(m3);



        while (true){
            System.out.print("회원등록 <1> 회원정보조회<2> 모든회원정보조회 <3> 회원삭제<4> 회원비밀번호변경<5>");
           int option =sc.nextInt();
            switch (option){
                case 1 :
                    System.out.println("학생 등록을 시작합니다. 학생 정보를 입력하세요.");

                    System.out.print("이름 : " );
                    String name = sc.next();

                    System.out.print("아이디 : " );
                    String id = sc.next();

                    System.out.print("비밀번호 : ");
                    String pw = sc.next();
                    m3.toString();
                    member.add(m3);
                case 2 :
                    System.out.print("정보를 조회할 이름 : ");
                    String input2 = sc.next();
                    System.out.println("정보가 일치하는 정보는 아래와 같습니다.");
                    for(int i =0; i<member.size(); i++) {
                        if (member.get(i).getName().equals(input2)) {
                            System.out.println(member.get(i));
                        }else{
                            System.out.println("정보가 일치하는 회원이 없습니다. ");
                        }
                    }
                case 3:
                    for(int i =0; i<member.size(); i++){
                        System.out.println("회원수는 "+ i +"명 이며,  정보는 아래와 같습니다.");
                        member.get(i);
                }
                case 4:
                    System.out.println("삭제할 회원의 이름 : ");
                    String input3 = sc.next();
                    for(int i =0; i<member.size(); i++){
                        if(member.get(i).getName().equals(input3)){
                            member.remove(i);
                        }
                        else{
                            System.out.println("정보가 일치하는 회원이 없습니다. ");
                        }
                    }
                case 5:
                    System.out.println("비밀번호를 변경할 이름 :");
                    String input4 = sc.next();
                    for(int i =0; i<member.size(); i++){
                        if(member.get(i).getName().equals(input4)){
                            System.out.println("비밀번호 : ");
                            member.get(i).getPw();
                            System.out.println("정보가 변경되었습니다.");
                        }
                        else{
                            System.out.println("정보가 일치하는 회원이 없습니다. ");
                        }
                    }
                case 0 :
                    System.exit(0);//프로그램 종료(무한루프 종료)


            }
        }










    }
}
