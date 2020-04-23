public class Rest {

    private double restValue;

    public Rest(){
        chooseValue();
    }

    private void chooseValue(){
        Value value = new Value();
        restValue = value.getValue();
    }

    public double getValue(){
        return restValue;
    }

}
