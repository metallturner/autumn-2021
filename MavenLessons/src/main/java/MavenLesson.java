import com.google.gson.Gson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MavenLesson {
    public static void main(String[] args) throws FileNotFoundException {
        List<Person> listBefore = new ArrayList<>();
        List<Person> listAfter = new ArrayList<>();
        listBefore.add(new Person(1, "Ross Geller"));
        listBefore.add(new Person(2, "Monica Geller"));
        listBefore.add(new Person(3, "Rachel Green"));
        listBefore.add(new Person(4, "Joseph Tribbiany"));
        listBefore.add(new Person(5, "Phoebe Buffay"));
        listBefore.add(new Person(6, "Gunther"));


        Gson gson = new Gson();

        String separator = File.separator;
        File file = new File("src" + separator + "main" + separator + "resources" + separator + "file.txt");
        PrintWriter pw = new PrintWriter(file);
        Scanner scanner = new Scanner(file);
        System.out.println(Separators.SEPARATOR1);
        for (Person person :
                listBefore) {
            System.out.println(person);
        }
        for (Person person : listBefore) {
            pw.println(gson.toJson(person));
        }
        pw.close();
        while (scanner.hasNextLine()) {
            listAfter.add(gson.fromJson(scanner.nextLine(), Person.class));
        }
        System.out.println(Separators.SEPARATOR2);
        for (Person person : listAfter) {
            System.out.println(person);
        }

    }


}
