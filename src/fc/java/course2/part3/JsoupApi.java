package fc.java.course2.part3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupApi {
    public static void main(String[] args) {
        String url = "https://sum.su.or.kr:8888/bible/today";
//        String url = "https://sum.su.or.kr:8888/bible/today?base_de=2023-03-20";

        try {
            Document document = Jsoup.connect(url).get();
            Element bibleText = document.getElementById("bible_text");
            Element bibleinfoBox = document.getElementById("bibleinfo_box");

            System.out.println(bibleText.text());
            System.out.println(bibleinfoBox.text());

            Elements nums = document.select(".num");
            Elements infos = document.select(".info");

            for (int i=0; i<nums.size();i++) {
                System.out.println(nums.get(i).text());
                System.out.println(infos.get(i).text());
            }

        }catch (Exception e){
            e.printStackTrace();
        }



    }
}
