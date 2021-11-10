/**
 * Нужен еще один класс для заполнения treeSet. в классе verb в методе compareTo сортировка идет по полю РусНейм
 * для коллекции Navigable. Но тот метод не удовлетворяет условиям сортировки TreeSet, поэтому в этом классе
 * реализуем данный метод сортировкой по инфинитиву
 */
public class VerbForTreeSet implements Comparable<VerbForTreeSet> {
    String infinitive;
    String pastSimple;
    String pastParticle;
    String rusName;

    public VerbForTreeSet(String infinitive, String pastSimple, String pastParticle, String rusName) {
        this.infinitive = infinitive;
        this.pastSimple = pastSimple;
        this.pastParticle = pastParticle;
        this.rusName = rusName;
    }

    @Override
    public String toString() {
        return infinitive + "; " + pastSimple + "; " + pastParticle + "; " + rusName;

    }

    /**
     * реализуем метод интерфейса Comparable
     */
    @Override
    public int compareTo(VerbForTreeSet o) {
        return this.infinitive.compareTo(o.infinitive);
    }
}

