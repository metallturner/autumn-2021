public class Main {
    public static void main(String[] args) throws Exception {
        SeasonService service = SeasonService.E;
        service.getSeason(Month.JANUARY);
        service.getSeason(Month.FEBRUARY);
        service.getSeason(Month.MARCH);
        service.getSeason(Month.APRIL);
        service.getSeason(Month.MAY);
        service.getSeason(Month.JUNE);
        service.getSeason(Month.JULY);
        service.getSeason(Month.AUGUST);
        service.getSeason(Month.SEPTEMBER);
        service.getSeason(Month.OCTOBER);
        service.getSeason(Month.NOVEMBER);
        service.getSeason(Month.DECEMBER);
    }
}
