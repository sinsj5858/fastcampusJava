package fc.java.part3;

import fc.java.part3.model.BookDTO;

public class BookTest {
    public static void main(String[] args) {
        BookDTO book = new BookDTO();
        book.title = "테스트";
        book.price = 30000;
        book.company = "패스트캠퍼스";
        book.author = "신원준";
        book.page =10;
        book.isbn = "111111";
        book.buy();
        book.read();
    }
}
