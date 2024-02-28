package fc.java.poly;

//import java.lang.* 생략
public class A { //extends Object 생략
//    public A(){
//        super();
//    }    생략
    private String title = "게시글";

    public void display() {
        System.out.println("A입니다.");
    }
    public void pringGo(){
        System.out.println("A입니다.");
    }

    @Override
    public String toString() {
        System.out.println(super.toString());    //// 부모의 toString 즉 A의 부모인 Object의 toString사용 객체의 번지수
        return "A{" +
                "title='" + title + '\'' +
                '}';
    }
}
