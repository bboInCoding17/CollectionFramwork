package student1;

import java.util.ArrayList;
import java.util.List;

public class TestStudent1 {
    public static void main(String[] args) {
        List < Student1> student1List = new ArrayList<>();

        Student1 stu1 = new Student1();
        stu1.setStudentName("홍길동");
        stu1.setEngScore(90);
        stu1.setKorScore(100);
        stu1.setAve();
        student1List.add(stu1);

        Student1 stu2 = new Student1();
        stu2.setStudentName("김길동");
        stu2.setEngScore(70);
        stu2.setKorScore(80);
        stu2.setAve();
        student1List.add(stu2);

        Student1 stu3 = new Student1();
        stu3.setStudentName("박길동");
        stu3.setEngScore(60);
        stu3.setKorScore(40);
        stu3.setAve();
        student1List.add(stu3);

//        //모든 학생의 정보 출력 1번
//        for(int i =0; i<student1List.size(); i++) {
//            System.out.println(student1List.get(i));
//        }
        //모든 학생의 정보 출력 2번
        for(Student1 student1 : student1List){
            System.out.println(student1.toString());//toString 생략 가능
        }
        System.out.println();
        //총점이 150점 이상의 학생의 정보 출력
        for(int i =0; i<student1List.size(); i++) {
            if (student1List.get(i).getAve()>=150) {
                System.out.println(student1List.get(i).toString());//toString 생략 가능

            }
        }
        System.out.println();

        int sum =0;
        //모든 학생의 평균 점수 출력
        for(Student1 student1 : student1List) {
            sum = sum + student1.getAve();
        }
        double a =  sum / (double) student1List.size();
        System.out.println("모든 학생의 평균 : " + a);


        //총점이 1등인 학생의 모든 정보 출력
        int maxIndex =0;//제일 높은 총점을 가진 학생의 순번을 가진다
        for(int i =1; i<student1List.size(); i++) {//maxIndex에 이미 0번째부터 시작하는 걸로 해두었으니, i는 1번째로 둔다
           if(student1List.get(maxIndex).getAve() < student1List.get(i).getAve()){//0번째 정보에 있는 총점과 1번째 학생 정보의 크기를 비교해
               //0번째 있는 학생의 총합 과 1번 째 있는 학생의 총합 중 1번째 학생의 총합이 크다면,
               maxIndex = i;//maxIndex는 i가 되면 된다(+1이 된다고 생각해보기) / student1List.get(i).getAve()의 i는 2가 됨
                //결국 총합이 가장 큰 학생의 점수는 maxIndex에 저장됨

        }
            System.out.println(student1List.get(maxIndex).toString());//toString 생략 가능

      }
    }
}

