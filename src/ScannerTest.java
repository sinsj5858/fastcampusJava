import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요:");
        int num = scanner.nextInt();
        System.out.println(num);

        System.out.print("문자열을 입력하세요: ");
        String str = scanner.next();
        System.out.println("str = " + str);

        scanner.nextLine();
        System.out.print("문자열을 입력하세요: ");
        String str2 = scanner.nextLine();
        System.out.println("str2 = " + str2);
        scanner.close();
    }
}
