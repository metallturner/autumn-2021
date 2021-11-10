import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
public class MyScanner {
    public static void main(String[] args)  {
        List<Verb> listVerbs = new ArrayList<>();
        Set<Verb> setVerbs = new TreeSet<>(infinitiveNameСomparator);           //сортируем по инфинитиву
        List<Verb> listNonSort = new ArrayList<>();                         //несортированная коллекция
        NavigableSet <Verb> navigableSet = new TreeSet<>(rusNameСomparator);         //сортируем по русНейм

        String separator = File.separator; //применяем сепаратор чтобы не гадать со слешами, если захотим запустить например на макосе
        String path = separator + "Users" + separator + "paul" + separator +
                "Desktop" + separator + "NetCracker lessons" + separator +
                "Verb" + separator + "verbs.csv";
        String pathResult = separator + "Users" + separator + "paul" + separator +
                "Desktop" + separator + "NetCracker lessons" + separator +
                "Verb" + separator + "Result.txt";

        File verbsFile = new File(path);        // объект файла из которого считываем
        File result = new File(pathResult);      // объект файла в который записываем
        try (PrintWriter pw = new PrintWriter(result)) {
            try (Scanner scanner = new Scanner(verbsFile)) {
                while (scanner.hasNextLine()) {            //считываем построчно файл
                    String line = scanner.nextLine();
                    String[] verb = line.split(";"); //разделяем элементы строки символом ; и закидываем элемент в массив. точку с запятой экранировать не нужно
                    listVerbs.add(makeObject(verb));       // каждый элемент массива это параметр для объекта, добавляем объект в коллекцию
                    setVerbs.add(makeObject(verb));
                    listNonSort.add(makeObject(verb));
                    navigableSet.add(makeObject(verb));
                }
            } catch (FileNotFoundException x) {
                System.out.println("Файл для считывания не найден или не существет");
            }
            Collections.shuffle(listVerbs);  // шафлим коллекцию
            System.out.println("перемешанная коллекция");
            pw.println("перемешанная коллекция");
            for (Verb verb : listVerbs) {         // выводим ее на экран
                System.out.println(verb);
                pw.println(verb);
            }
            Collections.sort(listVerbs, rusNameСomparator); // сортируем  коллекцию по русНейм. Передаем в качестве параметра компаратор
            System.out.println("------------------------------------------------------------");
            System.out.println("отсортированная по rusName");
            pw.println("------------------------------------------------------------");
            pw.println("отсортированная по rusName");
            for (Verb verb : listVerbs) {   // выводим ее на экран
                System.out.println(verb);
                pw.println(verb);
            }
            //выводим содержимое treeSet
            System.out.println("------------------------------------------------------------");
            System.out.println("содержимое treeSet");
            pw.println("------------------------------------------------------------");
            pw.println("содержимое treeSet");
            for (Verb verb : setVerbs) {
                System.out.println(verb);
                pw.println(verb);
            }
            System.out.println("------------------------------------------------------------");
            System.out.println("первое слово на букву 'с' в отсортированном по rusName списке");
            pw.println("------------------------------------------------------------");
            pw.println("первое слово на букву 'с' в отсортированном по rusName списке");
                System.out.println(getFirstVerbStartWith("с", listVerbs));
                pw.println(getFirstVerbStartWith("с", listVerbs));
            System.out.println("------------------------------------------------------------");
            System.out.println("первое слово на букву 'т' в отсортированном по rusName списке");
            pw.println("------------------------------------------------------------");
            pw.println("первое слово на букву 'т' в отсортированном по rusName списке");
                System.out.println(getFirstVerbStartWith("т", listVerbs));
                pw.println(getFirstVerbStartWith("т", listVerbs));
            System.out.println("------------------------------------------------------------");
            System.out.println("первое слово на букву 'с' в первоначальном списке(как в файле)");
            pw.println("------------------------------------------------------------");
            pw.println("первое слово на букву 'с' в первоначальном списке(как в файле)");
                System.out.println(getFirstVerbStartWith("с", listNonSort));
                pw.println(getFirstVerbStartWith("с", listNonSort));
            System.out.println("------------------------------------------------------------");
            System.out.println("первое слово на букву 'т' в первоначальном списке(как в файле)");
            pw.println("------------------------------------------------------------");
            pw.println("первое слово на букву 'т' в первоначальном списке(как в файле)");
                System.out.println(getFirstVerbStartWith("т", listNonSort));
                pw.println(getFirstVerbStartWith("т", listNonSort));
            {
                System.out.println("------------------------------------------------------------");
                System.out.println("слова на букву 'с' и 'т' из navigableSet");
                pw.println("------------------------------------------------------------");
                pw.println("слова на букву 'с' и 'т' из navigableSet");

                Verb verb1 = getFirstVerbStartWith("с", listVerbs);
                Verb verb2 = getFirstVerbStartWith("т", listVerbs);
                Verb verb3 = getFirstVerbStartWith("т", listVerbs);
                Verb verb4 = getFirstVerbStartWith("у", listVerbs);

                SortedSet<Verb> result1 = navigableSet.subSet(verb1, verb2);
                SortedSet<Verb> result2 = navigableSet.subSet(verb3, verb4);

                for (Verb verb : result1) {
                    System.out.println(verb);
                    pw.println(verb);
                }
                for (Verb verb : result2) {
                    System.out.println(verb);
                    pw.println(verb);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файла для записи не найден или не существует");
        }
    }
    /**
     * метод создает объекты типа Verb. Берет из массива элементы и вставляет их в параметры объекта
     * @param verb массив с элементами строки из файла
     * @return новый объект
     */
    static Verb makeObject(String[] verb) {
        return new Verb(verb[0], verb[1], verb[2], verb[3]);
    }
    public static Comparator<Verb> rusNameСomparator = new Comparator<Verb>() {    // сортируем список по полю rusName
        @Override
        public int compare(Verb o1, Verb o2) {
            return o1.getRusName().compareTo(o2.getRusName());
        }
    };
    public static Comparator<Verb> infinitiveNameСomparator = new Comparator<Verb>() {    // сортируем список по полю infinitive
        @Override
        public int compare(Verb o1, Verb o2) {
            return o1.getInfinitive().compareTo(o2.getInfinitive());
        }
    };
    public static Verb getFirstVerbStartWith(String startWithValue, List<Verb> verb) {
        Iterator<Verb> iterator = verb.iterator();
        while (iterator.hasNext()) {
            Verb next = iterator.next();
            if (next.getRusName().toUpperCase().startsWith(startWithValue.toUpperCase())) {
                return next;
            }
        }
        return new Verb("в коллекции", "нет", "таких", "слов");
    }



}





