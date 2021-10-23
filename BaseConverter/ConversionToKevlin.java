 class ConversionToKevlin implements Conversion {
    @Override
    public BaseConverter converts(BaseConverter Temp) {
        double temp1 = Temp.temp + 273.15;
        return new BaseConverter(temp1);
    }
}
