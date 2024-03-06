package fc.java.course2.part3;

import com.google.gson.Gson;
import fc.java.course2.part3.model.Person;

public class GsonPersonAddFromJson {
    public static void main(String[] args) {
        String json = "{\"name\":\"홍길동\",\"age\":20,\"email\":\"hong@naver.com\",\"address\":{\"city\":\"서울\",\"country\":\"대한민국\"}}";
        Gson gson = new Gson();
        Person person = gson.fromJson(json, Person.class);
        System.out.println(person.toString());
    }
}
