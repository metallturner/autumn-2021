public enum Season {
    WINTER("Cold"),
    SPRING("Normal"),
    SUMMER("YOU WILL BURN OUT"),
    AUTUMN("Slush");

    String description;
    Season(String description) {
        this.description = description;
    }
    String getDescription(){
        return this.description;
    }
}
