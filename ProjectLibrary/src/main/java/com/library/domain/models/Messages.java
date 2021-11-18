package com.library.domain.models;

public enum Messages {
    CREATE("For Create press 1"),
    DELETE("For Delete by ID press 2"),
    SEARCH("For Search by ID press 3"),
    UPDATE("For Update press 4"),
    CONTENT("For show content press 5"),
    EXIT("For Exit enter Exit"),
    ID("Введите ID"),
    SHOW_CONTENT("Показать содержимое"),
    NAME("Введите название"),
    ISBN("Введите ISBN книги"),
    AUTHOR("Введите автора"),
    LOCATION("Введите локацию"),
    YEAR_PUB("Введите год публикации"),
    MONTH_PUB("Введите месяц публикации"),
    DAY_PUB("Введите день публикации"),
    YEAR_ADD("Введите год добавления в библиотеку"),
    MONTH_ADD("Введите месяц добавления в библиотеку"),
    DAY_ADD("Введите день добавления в библиотеку"),
    YEAR_MOD("Введите год изменения в библиотеке"),
    MONTH_MOD("Введите месяц изменения в библиотеке"),
    DAY_MOD("Введите день изменения в библиотеке");

    String message;

    Messages(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;

    }
}
