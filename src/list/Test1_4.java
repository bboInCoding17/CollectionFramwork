package list;

import java.util.ArrayList;
import java.util.List;

public class Test1_4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int rand = ((int) (Math.random() * 100 + 1));
            list.add(rand);
        }
        //모든 데이터 출력
        System.out.print("리스트에 저장된 모든 데이터 : ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        int cnt =0;
        System.out.print("짝수 : ");
        for(int i =0; i< list.size(); i++){
            if(list.get(i) %2 ==0){
                System.out.print(list.get(i) + " ");
                cnt++;
            }
        }
        System.out.println();
        System.out.println("짝수의 개수는 " + cnt);

    }
}
