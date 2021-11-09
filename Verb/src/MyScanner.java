import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;


public class MyScanner {
    public static void main(String[] args) throws FileNotFoundException {
        List<Verb> listVerbs = new ArrayList<>();
        Set<Verb> setVerbs = new TreeSet<>();
        List<Verb> listNonSort = new ArrayList<>(); // нужна еще одна коллекция для вывода слов на буквы с и т, в которую закинем элементы из файла
        NavigableSet<Verb> navigableSet = new TreeSet<>();


        String separator = File.separator; //применяем сепаратор чтобы не гадать со слешами, если захотим запустить например на макосе
        String path = separator + "Users" + separator + "paul" + separator +
                "Desktop" + separator + "NetCracker lessons" + separator +
                "Verb" + separator + "verbs.csv";
        String pathResult = separator + "Users" + separator + "paul" + separator +
                "Desktop" + separator + "NetCracker lessons" + separator +
                "Verb" + separator + "Result.txt";
        File verbsFile = new File(path);        // объект файла из которого считываем
        File result = new File(pathResult);      // объект файла в который записываем
        PrintWriter pw = new PrintWriter(result);
        Scanner scanner = new Scanner(verbsFile);
        while (scanner.hasNextLine()) {            //считываем построчно файл
            String line = scanner.nextLine();
            String[] verb = line.split(";"); //разделяем элементы строки символом ; и закидываем элемент в массив. точку с запятой экранировать не нужно
            listVerbs.add(makeObject(verb));       // каждый элемент массива это параметр для объекта, добавляем объект в коллекцию
            setVerbs.add(makeObject(verb));        // после реализации compareTo в классе Verb, закидываем объекты в treeSet
            listNonSort.add(makeObject(verb));
            navigableSet.add(makeObject(verb));
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

        {
            System.out.println("------------------------------------------------------------");
            System.out.println("первое слово на букву 'с' в отсортированном по rusName списке");
            pw.println("------------------------------------------------------------");
            pw.println("первое слово на букву 'с' в отсортированном по rusName списке");
            Iterator<Verb> iteratorC = listVerbs.iterator();
            int i = 0;
            while (iteratorC.hasNext()) {
                char c = 'с';
                char C = 'С';
                if (c == (listVerbs.get(i).rusName.charAt(0)) || C == (listVerbs.get(i).rusName.charAt(0))) {
                    System.out.println(listVerbs.get(i));
                    pw.println(listVerbs.get(i));
                    break;// тут мы берем первый(нулевой) элемент строки и сравниваем его с той буквой которая нужна.
                }
                i++;
            }
        }
        {
            System.out.println("------------------------------------------------------------");
            System.out.println("первое слово на букву 'т' в отсортированном по rusName списке");
            pw.println("------------------------------------------------------------");
            pw.println("первое слово на букву 'т' в отсортированном по rusName списке");
            Iterator<Verb> iteratorC = listVerbs.iterator();
            int i = 0;
            while (iteratorC.hasNext()) {
                char t = 'т';
                char T = 'Т';
                if (t == (listVerbs.get(i).rusName.charAt(0)) || T == (listVerbs.get(i).rusName.charAt(0))) {
                    System.out.println(listVerbs.get(i));
                    pw.println(listVerbs.get(i));
                    break;// тут мы берем первый(нулевой) элемент строки и сравниваем его с той буквой которая нужна.
                }
                i++;
            }
        }
        {
            System.out.println("------------------------------------------------------------");
            System.out.println("первое слово на букву 'с' в первоначальном списке(как в файле)");
            pw.println("------------------------------------------------------------");
            pw.println("первое слово на букву 'с' в первоначальном списке(как в файле)");
            Iterator<Verb> iteratorC = listNonSort.iterator();
            int i = 0;
            while (iteratorC.hasNext()) {
                char c = 'с';
                char C = 'С';
                if (c == (listNonSort.get(i).rusName.charAt(0)) || C == (listNonSort.get(i).rusName.charAt(0))) {
                    System.out.println(listNonSort.get(i));
                    pw.println(listNonSort.get(i));
                    break;// тут мы берем первый(нулевой) элемент строки и сравниваем его с той буквой которая нужна.
                }
                i++;
            }
        }
        {
            System.out.println("------------------------------------------------------------");
            System.out.println("первое слово на букву 'т' в первоначальном списке(как в файле)");
            pw.println("------------------------------------------------------------");
            pw.println("первое слово на букву 'т' в первоначальном списке(как в файле)");
            Iterator<Verb> iteratorC = listNonSort.iterator();
            int i = 0;
            while (iteratorC.hasNext()) {
                char t = 'т';
                char T = 'Т';
                if (t == (listNonSort.get(i).rusName.charAt(0)) || T == (listNonSort.get(i).rusName.charAt(0))) {
                    System.out.println(listNonSort.get(i));
                    pw.println(listNonSort.get(i));
                    break; // тут мы берем первый(нулевой) элемент строки и сравниваем его с той буквой которая нужна.
                }
                i++;
            }
        }
        {
            System.out.println("------------------------------------------------------------");
            System.out.println("слова на букву 'с' и 'т' из navigableSet");
            pw.println("------------------------------------------------------------");
            pw.println("слова на букву 'с' и 'т' из navigableSet");
            for (Verb verb : navigableSet) {
                char c = 'с';
                char C = 'С';
                char t = 'т';
                char T = 'Т';
                if (t == (verb.rusName.charAt(0)) || T == (verb.rusName.charAt(0)) ||
                        C == (verb.rusName.charAt(0)) || c == (verb.rusName.charAt(0))) {
                    System.out.println(verb);
                    pw.println(verb);
                }
            }
        }
        pw.close();
        scanner.close();

    }

    /**
     * метод создает объекты типа Verb. Берет из массива элементы и вставляет их в параметры объекта
     *
     * @param verb массив с элементами строки из файла
     * @return новый объект
     */
    static Verb makeObject(String[] verb) {
        return new Verb(verb[0], verb[1], verb[2], verb[3]);
    }

    public static Comparator<Verb> rusNameСomparator = new Comparator<Verb>() {    // сортируем список по полю rusName
        @Override
        public int compare(Verb o1, Verb o2) {
            return o1.rusName.compareTo(o2.rusName);
        }
    };


}


