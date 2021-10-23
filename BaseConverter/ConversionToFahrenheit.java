 class ConversionToFahrenheit implements Conversion {

    @Override
    public BaseConverter converts(BaseConverter Temp) {
        double temp1 = Temp.temp + 32;
        return new BaseConverter(temp1);
    }
}
