package member1_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberManage {
    Scanner sc;
    private List<Member1> memberList;//선언

    public MemberManage(){
        memberList = new ArrayList<>(); //Arraylist 객체인 memberList 생성했다.
        sc = new Scanner(System.in);
    }


    //키보드로 입력 받은 정보를 갖는 회원을 리턴(regMember메소드를 간단하게 표현하기 위해 생성된 메소드로 설정)
    private Member1 getMember(){
        System.out.print("회원이름 : ");
        String name = sc.next();
        System.out.print("아이디 : ");
        String id = sc.next();
        System.out.print("비밀번호 : ");
        String pw = sc.next();

        Member1 m = new Member1(id,name,pw);//Member1 객체에 정보를 넣을 수 있다.
                                            // Member1객체의 정보를 여러개 넣기 위해 List 이용한다.
        return m;

    }



    //회원등록
    public void regMember(){
        memberList.add(getMember());//키보드로 입력받은 정보를 저장하는 메소드 getMember를  memberlist에 저장.

    }
    //회원정보 조회
    public void showInfoByName(){//키보드로 입력받은 모든 정보를 저장한다.(scanner 안 받아도 된다)
       boolean isFind = false;//for 반복문에서 못 찾았는지 변수를 두는 거
        boolean isRun =true;// while 반복문에 변수를 넣기 위함(일치하면 진행, 아니면 반복문 멈춤)


        while (isRun) {
           System.out.print("정보를 조회할 이름 : ");
           String name = sc.next();

           for(int i =0; i<memberList.size(); i++){
               if(memberList.get(i).getName().equals(name)){
                   System.out.println(memberList.get(i));
                   isFind = true;//isFind = !isfind;  -> false를 가진 변수를 사용하는 방법
                   isRun =false;
                   break;
               }
           }
            //키보드로 입력받은 정보가 가지고 있는 정보와 일치하지 않은 경우
            if(!isFind){
                System.out.println("일치하는 정보가 없습니다.");
            }

       }
    }
    //모든 회원정보조회
    public void showAllInfo(){
        for(Member1 member:memberList){
            System.out.println(member);
        }
    }

    //회원삭제
    public void deleteMember(){
            boolean isFind = false;//for 반복문에서 못 찾았는지 변수를 두는 거
            boolean isRun =true;// while 반복문에 변수를 넣기 위함(일치하면 진행, 아니면 반복문 멈춤)


            while (isRun) {
                System.out.print("삭제할 멤버의 이름 : ");
                String name = sc.next();

                for(int i =0; i<memberList.size(); i++){
                    if(memberList.get(i).getName().equals(name)){

                       memberList.remove(memberList.get(i));

                        isFind = true;//isFind = !isfind;  -> false를 가진 변수를 사용하는 방법
                        isRun =false;
                        break;
                    }
                }
                //키보드로 입력받은 정보가 가지고 있는 정보와 일치하지 않은 경우
                if(!isFind){
                    System.out.println("일치하는 정보가 없습니다.");
                }

            }

        }








    //회원비밀번호
    public void updateMemberInfo(){
        boolean isFind = false;//for 반복문에서 못 찾았는지 변수를 두는 거
        boolean isRun =true;// while 반복문에 변수를 넣기 위함(일치하면 진행, 아니면 반복문 멈춤)


        while (isRun) {
            System.out.print("비밀번호를 변경할 이름 : ");
            String name = sc.next();

            for(int i =0; i<memberList.size(); i++){
                if(memberList.get(i).getName().equals(name)){
                    System.out.println("비밀번호 : ");
                    String pw =sc.next();

                    memberList.get(i).setPw(pw);

                    isFind = true;//isFind = !isfind;  -> false를 가진 변수를 사용하는 방법
                    isRun =false;
                    break;
                }
            }
            //키보드로 입력받은 정보가 가지고 있는 정보와 일치하지 않은 경우
            if(!isFind){
                System.out.println("일치하는 정보가 없습니다.");
            }

        }

    }









}
