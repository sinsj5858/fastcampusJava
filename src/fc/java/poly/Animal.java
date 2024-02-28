package fc.java.poly;

// 추상클래스
public abstract class Animal {
    /// 다형성의 전제조건
//    1. 상속관계
//    2. Override
//    3. Upcasting
//    4. 동적바인딩


    public abstract void eat(); //추상 메소드

    public void move() {
        System.out.println("무리지어 다닌다");  /// 추상클래스는 추상클래스내에 메소드 구현가능     ---> 인터페이스는 구현불가
    }                                          /// 추상클래스는 비슷한 클래스를 연결할때,   인터페이스는 다른 클래스를 연결할때
}                                              // 둘다 객체 생성 불가
