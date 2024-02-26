package fc.java.part4;

import fc.java.part4.model.RempVO;

public class EmployeeTest {
    public static void main(String[] args) {
        //일반사원 한명의 객체를 생성하고 데이터를 저장후 출력
        RempVO vo = new RempVO("홍길동",50,"010-0000-0000","2022-10-01","기획부",false);
        System.out.println(vo.toString());
    }
}
