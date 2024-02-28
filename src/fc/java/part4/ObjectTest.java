package fc.java.part4;

import fc.java.poly.A;

public class ObjectTest {
    public static void main(String[] args) {
        A a = new A();
        a.display();

        Object object = new A();
        ((A)object).display();
    }
}
