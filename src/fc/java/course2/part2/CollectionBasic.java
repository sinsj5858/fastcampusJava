package fc.java.course2.part2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionBasic {
    public static void main(String[] args) {
        // ArrayList에 10,20,30,40,50 5개의 정수(int)를 저장하고 출력하세요
        // ArrayList -> Object[] <--x-- int
        // ArrayList -> Object[] <----- Integer(Wrapper)
        // ArrayList -> Object[] <----- (Auto-boxing:Integer)int  = 이젠 int를 넣을 수 있음
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);  // 오토 박싱
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        for (int data:list) {  // 오토 언박싱
            System.out.println(data);
        }
        ArrayList arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(2);
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));

    }
}
