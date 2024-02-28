package fc.java.part4;

import fc.java.poly.A;
import fc.java.poly.B;

public class ObjectPolyArray {
    public static void main(String[] args) {
        // A, B 클래스를 저장할 배열 생성
        Object[] objects = new Object[2];
        objects[0] = new A();
//        ((A)objects[0]).pringGo();
        objects[1] = new B();
//        ((B)objects[0]).pringGo();
//        for (Object object:objects) {
//            if(object instanceof A){
//                ((A) object).pringGo();
//            }else{
//                ((B)object).pringGo();
//            }
//        }
        display(objects);
        System.out.println(objects[0]);   //objects[0] == (객체를 그냥 사용한다면)toString 함수에서 재정의하지않으면 Object의 toString이 사용됨
                                          //Object에서의 toString은 선택한 객체의 번지수를 출력함  A클래스에서 toString을 재정의한다면 사용 불가
    }

    private static void display(Object[] objects) {
        for (Object object:objects) {
            if(object instanceof A){
                ((A) object).pringGo();
            }else{
                ((B)object).pringGo();
            }
        }
    }
}
// 사용자 이름 변경