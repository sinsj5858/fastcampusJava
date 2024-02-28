package fc.java.part4;

import fc.java.poly.Radio;
import fc.java.poly.RemoCon;
import fc.java.poly.TV;

public class InterfaceTest {
    public static void main(String[] args) {
        //리모콘으로 Radio 와 TV동작
        //인터페이스 특징
        //다형성 100%보장;
        RemoCon remoCon = new Radio();
        remoCon.chUp();
        remoCon.chDown();
        remoCon.volUp();
        remoCon.volDown();
        remoCon.internet();

        remoCon = new TV();
        for (int i=0; i<12;i++){
            remoCon.chDown();
        }
        remoCon.volUp();
        remoCon.volDown();
        remoCon.internet();
    }
}
