

/**
 *Так как у treeSet и navigableSet разные сортировки, в данном классе нет смысла реализовывать метод compareTo.
 * в данной программе не требуется "естественная" сортировка.
 * TreeSet требует либо естественной сортировки по какому-либо полю, либо нужно в конструктор коллекции кидать компаратор.
 * Грубо говоря если мы не скажем как мы будем сортровать объекты, при попытке добавить объект вылезет ексепшн.
 * Касается только "самодельных" объектов. Числа и строки осортируются сами.
 */
public class Verb {
    private String infinitive;
    private String pastSimple;
    private String pastParticle;
    private String rusName;

    public String getInfinitive() {
        return infinitive;
    }

    public void setInfinitive(String infinitive) {
        this.infinitive = infinitive;
    }

    public String getPastSimple() {
        return pastSimple;
    }

    public void setPastSimple(String pastSimple) {
        this.pastSimple = pastSimple;
    }

    public String getPastParticle() {
        return pastParticle;
    }

    public void setPastParticle(String pastParticle) {
        this.pastParticle = pastParticle;
    }

    public String getRusName() {
        return rusName;
    }

    public void setRusName(String rusName) {
        this.rusName = rusName;
    }

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

}
