package fc.java.poly;

public class Cat extends Animal {
//    public void eat(){
//        System.out.println("고양이처럼 먹다.");
//    }
    public void night(){
        System.out.println("밤");
    }

    @Override
    public void eat() {
        System.out.println("고양이처럼 먹다.");
    }
}
