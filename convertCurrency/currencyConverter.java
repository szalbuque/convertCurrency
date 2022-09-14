package convertCurrency;

 public  class  currencyConverter {
    public static double getConverted(double input){
        double converted;
        double taxa = 0.2;
        converted = (double) Math.round(input * taxa);
        return converted;
    }

}
