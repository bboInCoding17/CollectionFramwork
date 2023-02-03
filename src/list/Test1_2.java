package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1_2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("정수 5개를 입력하시오");
        for(int i =0; i<5; i++){
            System.out.println("숫자 입력 : ");
            int num = sc.nextInt();
            list.add(num);
        }


        int sum =0;
        for(int i =0; i< list.size(); i++){
            sum = sum + list.get(i);

        }
        System.out.println(sum);


        }
    }

