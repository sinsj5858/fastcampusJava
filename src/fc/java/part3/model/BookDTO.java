package fc.java.part3.model;

public class BookDTO {
    public String title;
    public int price;
    public String company;
    public String author;
    public int page;
    public String isbn;

    public void read(){
        System.out.println("책을 읽는다");
    }
    public void buy(){
        System.out.println("책을 산다");

    }

}
