package student;

import java.util.ArrayList;
import java.util.List;

public class SchoolManager {
    public static void main(String[] args) {
        //학교 객체 생성
        School school = new School();

        //학급 객체 생성
        StudyClass c1 = new StudyClass();

        //c1 이라는 학급에 들어갈 학생객체 3개 생성
       Student s1 = new Student("김길동",20,"서울시", 80);
       Student s2 = new Student("이길동",19,"경기도", 70);
       Student s3 = new Student("박길동",17,"충청남도", 60);

       //위 3명의 학생을 저장할 List 생성
        List<Student> stuList1 = new ArrayList<>();
       stuList1.add(s1);
       stuList1.add(s2);
       stuList1.add(s3);

        //c1이라는 학급에 학생목록 정보 세팅
       c1.setStuList(stuList1);
       c1.setClassName("캐드반");
       c1.setTeacher("김선생");

       //c2라는 학급을 생성
        StudyClass c2 = new StudyClass();

        //c2교실에 들어갈 학생 3명 생성
        Student s4 =new Student("김자바",30,"대전시",70);
        Student s5 =new Student("이자바",40,"대구시",90);
        Student s6 =new Student("박자바",29,"전주시",99);

        List<Student> stuList2 = new ArrayList<>();

        stuList2.add(s4);
        stuList2.add(s5);
        stuList2.add(s6);

        c2.setStuList(stuList2);
        c2.setClassName("기능반");
        c2.setTeacher("최선생");

        //c3라는 학급 생성
        StudyClass c3 = new StudyClass();

        Student s7 = new Student("김윤복", 17, "부산시", 100);
        Student s8 = new Student("홍윤복", 20, "창원시", 80);
        Student s9 = new Student("최윤복", 17, "양산시", 55);

        List<Student> stuList3 = new ArrayList<>();

        stuList3.add(s7);
        stuList3.add(s8);
        stuList3.add(s9);

        c3.setStuList(stuList3);
        c3.setClassName("응용반");
        c3.setTeacher("윤선생");



        //여러 학급 정보를 저장할 수 있는 리스트를 생성
        List<StudyClass> classList = new ArrayList<>();

        classList.add(c1);
        classList.add(c2);
        classList.add(c3);


       school.setStuClass(classList);     //모든 데이터가 학교에 저장시킴

        //school이라는 학교의 모든 학급명을 출력
        for(int i =0; i < school.getStuClass().size(); i++){
            String className = school.getStuClass().get(i).getClassName();
            System.out.println(className);
        }


    }
}
