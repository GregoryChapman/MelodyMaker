import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int bars;
        int randNum;
        double maxValue;
        double tempValue = 0;
        Random random = new Random();

        System.out.println("Welcome to the MelodyMaker (VER 1.0.0)\nChoose number of bars (2 or 4)");
        bars = sc.nextInt();

        if(bars == 2){
            maxValue = 8;
        } else{
            maxValue = 16;
        }

        Key key = new Key();
        System.out.println(key.getKey());
        System.out.println("_______________");

        while(tempValue < maxValue){
            randNum = random.nextInt(10);
            if(randNum != 10){
                Note note = new Note(key.getKey());
                System.out.println("Note: " + note.getNote());
                System.out.println("Value: " + note.getValue());
                System.out.println("_______________");
                tempValue = tempValue + note.getValue();
            } else{
                Rest rest = new Rest();
                System.out.println("Rest");
                System.out.println("Value: " + rest.getValue());
                System.out.println("_______________");
                tempValue = tempValue + rest.getValue();
            }
        }





    }




}
