import java.util.Random;

public class Value {

    private double value;

    public Value(){
        Random random = new Random();
        int randNum = random.nextInt(10);
        chooseValue(randNum);
    }

    private void chooseValue(int randNum){
        if(randNum == 0 || randNum == 1 || randNum == 2){
            value = 1;
        } else if(randNum == 3 || randNum == 4){
            value = 0.5;
        } else if(randNum == 5 || randNum == 6){
            value = 2;
        } else if(randNum == 7 || randNum == 8){
            value = 1.5;
        } else if(randNum == 9){
            value = 3;
        } else{
            value = 4;
        }
    }

    public double getValue(){
        return value;
    }
}
