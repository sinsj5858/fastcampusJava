package fc.java.course2.part3;

import com.google.gson.Gson;
import fc.java.course2.part3.model.Member;

public class GsonFromJson {
    public static void main(String[] args) {
        String memberJson = "{\"name\":\"홍길동\",\"age\":30,\"email\":\"hong@naver.com\"}";
        Gson gson = new Gson();
        Member member = gson.fromJson(memberJson, Member.class);
        System.out.println("member = " + member);
    }
}
