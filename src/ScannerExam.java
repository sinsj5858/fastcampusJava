import java.util.Scanner;

public class ScannerExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("제목 : ");
        String title = scan.nextLine();
        System.out.print("가격 : ");
        int price = scan.nextInt();
        scan.nextLine();
        System.out.print("출판사 : ");
        String company = scan.nextLine();
        System.out.print("저자 : ");
        String author = scan.nextLine();
        System.out.print("페이지 수 : ");
        int page = scan.nextInt();
        scan.nextLine();
        System.out.print("ISBN : ");
        String isbn = scan.nextLine();
        System.out.println("title = " + title);
        System.out.println("price = " + price);
        System.out.println("company = " + company);
        System.out.println("author = " + author);
        System.out.println("page = " + page);
        System.out.println("isbn = " + isbn);
        scan.close();
    }
}
