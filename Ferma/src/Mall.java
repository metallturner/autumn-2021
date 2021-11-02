public class Mall <T> {
    T value;

    public void setValue(T value) {
        this.value = value;
    }

    Ferma buyFruit(Pickup<Ferma> pickup, String fruit) {
        if (fruit.equals("apple")) {
            pickup.setValue(new Apple("яблоко"));
            return (Apple) pickup.getValue();
        }
        if (fruit.equals("pinapple")) {
            pickup.setValue(new Pinapple("ананас"));
            return (Pinapple) pickup.getValue();
        } else {
            return null;
        }
    }
}


