import java.util.Random;

public class Key {

    private String key;

    public Key(){
        Random random = new Random();
        int randNum = random.nextInt(14);
        chooseKey(randNum);
    }

    private void chooseKey(int randNum){
        if(randNum == 0){
            key = "C";
        } else if(randNum == 1){
            key = "G";
        } else if(randNum == 2){
            key = "D";
        } else if(randNum == 3){
            key = "A";
        } else if(randNum == 4){
            key = "E";
        } else if(randNum == 5){
            key = "B";
        } else if(randNum == 6){
            key = "F#";
        } else if(randNum == 7){
            key = "C#";
        } else if(randNum == 8){
            key = "F";
        } else if(randNum == 9){
            key = "Bflat";
        } else if(randNum == 10){
            key = "Eflat";
        } else if(randNum == 11){
            key = "Aflat";
        } else if(randNum == 12){
            key = "Dflat";
        } else if(randNum == 13){
            key = "Gflat";
        } else{
            key = "Cflat";
        }
    }

    public String getKey(){
        return key;
    }

}
