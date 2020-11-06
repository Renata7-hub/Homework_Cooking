public class Cooking {
//    ## Units and Amounts (VERY EASY)
//    Create a class `Cooking`.

//            ### Units (VERY EASY)
//
//    Inside a cooking class, create a static class called `Units`.
//    Define all the measurement units inside this class.
//    Have metrics for: OZ, POUND, GALLON, QUART, PINT, CUP, FL_OUNCE, TBSP, TSP.
//            Use `public static final String` for every declaration.
    public static class Units{
    public static final String OZ="OZ";
    public static final String POUND="POUND";
    public static final String GALLON="GALLON";
    public static final String QUART="QUART";
    public static final String PINT="PINT";
    public static final String CUP="CUP";
    public static final String FL_OUNCE="L_OUNCE";
    public static final String TBSP="TBSP";
    public static final String TSP="TSP";
}
//    Also, create a method `String[] getValues()` to return all the known units. You will need this for the next steps.

    public static String[] getValues() {
        final String[] strings = {
                Units.OZ,
                Units.POUND,
                Units.GALLON,
                Units.QUART,
                Units.PINT,
                Units.CUP,
                Units.FL_OUNCE,
                Units.TBSP,
                Units.TSP};
        return strings;
    }
//### Amounts (VERY EASY)
//
//    Inside a cooking class, add one more static class called `Amounts`.
//    Each amount should translate to ML (including ML itself = 1).
//    Use the same constant syntax.
//    For example: public static final float TSP = 5;
//    public static final float ML = 1;
//    - 1/5 TSP = 1 ML
//- 1 TSP = 5 ML
//- 1 TBSP = 15 ML
//- 1 FL OUNCE = 30 ML
//- 1 CUP = 237 ML
//- 1 PINT (2 CUPS) = 473 ML
//- 1 QUART (4 CUPS) = .95 LITER
//- 1 GALLON (16 CUPS) = 3.8 LITERS
//- 1 OZ = 28 GRAMS
//- 1 POUND = 454 GRAMS

    //```
    public static class Amounts{
    public static final float ML = 1;
    public static final float TSP = 5;
    public static final float TBSP = 15;
    public static final float OUNCE = 30;
    public static final float CUP = 237;
    public static final float PINT  = 473; //2 CUPS
    public static final float QUART  = 950; //4 CUPS
    public static final float GALLON  = 3800; //16 CUPS
    public static final float OZ = 28;
    public static final float POUND = 454;
}
}
