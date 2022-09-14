package convertCurrency;

 public  class  currencyConverter {
    public static double getConverted(double input, double taxa){
        double converted;
        converted = (double) Math.round(input * taxa);
        return converted;
    }

}
