public enum Separators {

    SEPARATOR1("вывод объектов из коллекции ДО сериализации"),
    SEPARATOR2("вывод объектов ПОСЛЕ сериализации с последующей десериализацией");
    private String text;

    Separators(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
