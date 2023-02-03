package list;

import java.util.ArrayList;
import java.util.List;

public class List03 {
    public static void main(String[] args) {
        //Man 객체가 다수 저장될 수 있는 리스트 생성
        List<Man> list = new ArrayList<>();

        Man m1 = new Man("김", 20);
        Man m2 = new Man("이", 30);
        Man m3 = new Man("박", 40);

        list.add(m1);//클래스 생성하고 값 넣을 수 있다.
        list.add(m2);
        list.add(m3);

        //저장된 모든 Man 객체 출력
        for(int i =0; i<list.size(); i++){
            System.out.println(list.get(i)); // 자료형 Man , 리턴 타입 Man
            //Man 객체의 toString 실행해라.
        }
        for(Man e : list) {
            System.out.println(e);

        }//list가 반복적을 돌아가는데, 이 때 0번째~마지막까지 돌면서 정보를 리턴타입 Man에
        //변수 e에 저장한다.
        //list의 toString을 e에 대입해라.

        //list에 저장된 사람들 중에 이름이 '김'인 사람을 찾아서 그 사람의 나이를 출력 후
       for(int i =0; i<list.size(); i++){
           if(list.get(i).getName().equals("김")){
               System.out.println(list.get(i).getAge());
           }
       }


    }
}

class Man{
    private String name;
    private int age;

    //매개변수 값으로 초기값을 갖는 생성자
    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //getter setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //toString() 오버라이딩
    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Stu{
    //이름, 나이, 전공
    private Man man;//이름과 나이가 정의 된 클래스인 Man을 자료형으로 사용 변수 선언
    private String major;

    public Stu(String name, int age, String major){
        this.major = major;
        this.man = new Man(name,age);//클래스 Man에 선언된 생성자 오버로딩해서 사용한다.
    }
    public void showInfo(){
        //전공 출력 코드
        System.out.println("전공 : "+ major);
        //이름 출력
        System.out.println("이름 : "+ man.getName());
    }

}



