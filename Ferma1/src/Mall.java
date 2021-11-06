public class Mall <T extends Ferma> {
    T value;

    public void setValue(T value) {
        this.value = value;
    }



    void buy (Pickup<Ferma> pickup){
        System.out.println(pickup.getValue());
    }
}


