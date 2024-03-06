package fc.java.course2.part3;

import com.google.gson.Gson;
import fc.java.course2.part3.model.Member;

public class GsonToJson {
    public static void main(String[] args) {
        Member member = new Member("홍길동",30,"hong@naver.com");
        Gson gson = new Gson();
        String memberJson = gson.toJson(member);
        System.out.println(memberJson);
    }
}
