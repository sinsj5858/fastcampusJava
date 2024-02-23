package fc.java.part2;

public class ObjectArrayTest {
    public static void main(String[] args) {
        Book[] b1 = new Book[3];
        b1[0].title = "자바";

        Book[] b2 = new Book[3];
        b2[0] = new Book();
        b2[0].title = "자바";

    }


}
