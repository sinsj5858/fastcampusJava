package fc.java.part3;

import fc.java.part3.model.PersonDTO;

public class PersonInfoHide {
    public static void main(String[] args) {
        PersonDTO person = new PersonDTO("홍길동",30,"010-0000-0000");
        System.out.println(person.getName()+person.getAge()+person.getPhoneNumber());
    }
}
