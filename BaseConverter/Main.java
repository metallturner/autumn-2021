

 class Main {
    public static void main(String[] args) {


        BaseConverter Temp = new BaseConverter(0);
        BaseConverter TempK = new ConversionToFahrenheit().converts(Temp);
        BaseConverter TempF = new ConversionToKevlin().converts(Temp);
        BaseConverter TempR = new ConversionToRankin().converts(Temp);
        System.out.println("по Цельсию " + print(Temp));
        System.out.println("по Фаренгейту " + print(TempF));
        System.out.println("по Кельвину " + print(TempK));
        System.out.println("по Ранкину " + print(TempR));


    }

    public static double print(BaseConverter Temp) {
        return Temp.temp;
    }

}
