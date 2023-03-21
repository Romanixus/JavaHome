import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        ArrayList<Person> phoneBook = new ArrayList<>();
        ObjectMapper mapper = new ObjectMapper();
        File phonebook = new File("target/phonebook.json");
        File phonebook2 = new File("target/phonebook2.json");

        Person irina = new Person("Ирина", 903747292);
        Person vasiliy = new Person("Василий", 956234543);

        phoneBook.add(irina);
        phoneBook.add(vasiliy);

        mapper.writeValue(phonebook, phoneBook);
        ArrayList<Person> phoneBook2 = mapper.readValue(phonebook2, new TypeReference<ArrayList<Person>>(){});

        System.out.println(phoneBook);
        System.out.println(phoneBook2);
    }
}
