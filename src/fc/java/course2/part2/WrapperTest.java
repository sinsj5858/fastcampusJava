package fc.java.course2.part2;

public class WrapperTest {
    public static void main(String[] args) {
        int a = 10;
        Integer wrapperInt = new Integer(a);  //(박싱)
        System.out.println(wrapperInt.intValue()); //언박싱
        System.out.println(wrapperInt);    // 오토 언박싱
        wrapperInt = 20; // 자동 박싱 (오토 박싱)
        System.out.println(wrapperInt.intValue());
        System.out.println(wrapperInt);

        int b = wrapperInt; // 오토 언박싱

    }
}
