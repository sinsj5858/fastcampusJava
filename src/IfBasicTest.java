import java.util.Scanner;

public class IfBasicTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int inputNum = scan.nextInt();
        if (inputNum%7 == 0) {
            System.out.println("7의 배수입니다.");
        }else {
            System.out.println("7의 배수가 아닙니다.");
        }
        scan.nextLine();
        System.out.print("나이 입력 : ");
        int age = scan.nextInt();
        if(age>=19){
            System.out.println("성인입니다.");
        }else{
            System.out.println("미성년자입니다.");
        }
        scan.close();
    }
}
