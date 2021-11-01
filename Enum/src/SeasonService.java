import java.util.EnumMap;
import java.util.concurrent.Callable;

public enum SeasonService implements Seasonable {
    E;
    EnumMap<Month, Callable<Season>> enumMap;

    SeasonService() {
        enumMap = new EnumMap<>(Month.class);
        for (Month month : Month.values()) {
            if ((month.name().equals("JANUARY")) || (month.name().equals("FEBRUARY")) || (month.name().equals("DECEMBER"))) {
                enumMap.put(month, () -> Season.WINTER);
            }
            if ((month.name().equals("JUNE")) || (month.name().equals("JULY")) || (month.name().equals("AUGUST"))) {
                enumMap.put(month, () -> Season.SUMMER);
            }
            if ((month.name().equals("SEPTEMBER")) || (month.name().equals("OCTOBER")) || (month.name().equals("NOVEMBER"))) {
                enumMap.put(month, () -> Season.AUTUMN);
            }
            if ((month.name().equals("MARCH")) || (month.name().equals("APRIL")) || (month.name().equals("MAY"))) {
                enumMap.put(month, () -> Season.SPRING);
            }

        }
    }

    @Override
    public void getSeason(Month month) throws Exception {
        Season s = enumMap.get(month).call();
        System.out.println("Season -" + " " + s.name() + ", Month - " + month.name() + " Weather - " + s.getDescription());
    }

}
