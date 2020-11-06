public class CookingMeasurement {
//    ## Cooking Measurement (VERY EASY)
//
//    Create a class called `CookingMeasurement`. Publicly, it should only have 2 methods: `float getAmount()`, `String getUnit()`.
//    It should be created using a public constructor that takes amount and unit.
    private float amount;
    private String unit;



    public CookingMeasurement(float amount, String unit){
        this.amount=amount;
        this.unit=unit;
    }
    public float getAmount() {
        return amount;
    }

    public String getUnit() {
        return unit;
    }
}
