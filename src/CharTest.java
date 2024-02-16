public class CharTest {
    public static void main(String[] args) {
        char kor = '가';
        char c = 'A';
        System.out.println("c = " + c);
        int a = c;
        System.out.println("a = " + a);
        System.out.println("a = " + (char)a);
        System.out.println("kor = " + kor);
        System.out.println("kor = " + (char)(kor+1));

        char i='1';
        char j='2';
        char k = '0';
        System.out.println((i-k)+(j-k));
    }
}
