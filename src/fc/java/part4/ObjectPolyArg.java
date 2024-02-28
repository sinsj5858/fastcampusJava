package fc.java.part4;

import fc.java.poly.A;
import fc.java.poly.B;

public class ObjectPolyArg {
    public static void main(String[] args) {
        A a = new A();
        display(a);
        B b = new B();
        display(b);
    }
//    public static void display(A a){
//        a.pringGo();
//    }
//    public static void display(B b){
//        b.pringGo();
//    }
    public static void display(Object object){
        if(object instanceof A) {
            ((A) object).pringGo();
        }else{
            ((B) object).pringGo();
        }
    }
}
