package fc.java.course2.part3;

import com.google.gson.Gson;
import fc.java.course2.part3.model.Address;
import fc.java.course2.part3.model.Person;

public class GsonPersonAddToJson {
    public static void main(String[] args) {
        Address address = new Address("서울", "대한민국");
        Person person = new Person("홍길동",20,"hong@naver.com",address);

        Gson gson = new Gson();
        String personJson = gson.toJson(person);
        System.out.println("personJson = " + personJson);
    }
}
