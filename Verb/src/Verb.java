

/**
 * чтобы мы могли закинуть в treeset что либо, мы должны указать по какие параметрам мы будем сортировать
 * объекты, поэтому нужно реализовать интерфейс Comparable. Мы должны явно указать джаве что объекты сортируемые по
 * параметру infinitive. Без реализации коллекция просто не будет знать по какому алгоритму производить сортировку.
 * p.s комменты и доки пишу в основном для себя, чтобы через месяц не вспоминать что тут происходит..
 */
public class Verb implements Comparable<Verb> {
    String infinitive;
    String pastSimple;
    String pastParticle;
    String rusName;

    public Verb(String infinitive, String pastSimple, String pastParticle, String rusName) {
        this.infinitive = infinitive;
        this.pastSimple = pastSimple;
        this.pastParticle = pastParticle;
        this.rusName = rusName;
    }

    @Override
    public String toString() {
        return infinitive +"; "+ pastSimple +"; "+ pastParticle +"; "+ rusName;

    }

    /**
     *реализуем метод интерфейса Comparable
     */
    @Override
    public int compareTo(Verb o) {
        return this.infinitive.compareTo(o.infinitive);
    }
}
