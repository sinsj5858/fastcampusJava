package fc.java.part2;

public class BinaryExam {
    public static void main(String[] args) {
        int data = 123;
        String binary = Integer.toBinaryString(data);
        System.out.println("binary = " + binary);
        String octal = Integer.toOctalString(data);
        System.out.println("octal = " + octal);
        String hex = Integer.toHexString(data);
        System.out.println("hex = " + hex);
    }
}
