 class ConversionToRankin implements Conversion {
    @Override
    public BaseConverter converts(BaseConverter Temp) {
        double temp1 = Temp.temp + 491.67;
        return new BaseConverter(temp1);
    }
}
