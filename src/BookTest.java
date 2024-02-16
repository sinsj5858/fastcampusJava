public class BookTest {
    public static void main(String[] args) {
        Book book = new Book();
        book.title = "자바";
        book.price = 30000;
        book.company = "패스트캠퍼스";
        book.author = "신원준";
        book.page = 700;
        book.isbn = "12345678";
        System.out.println(book.title+"\t"+book.price+"\t"+book.company+"\t"+book.author+"\t"+book.page+"\t"+book.isbn);
    }
}
