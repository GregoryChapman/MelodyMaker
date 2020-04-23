import java.util.Random;

public class Note {

    private String note;
    private double noteValue;
    private String key;
    private String accidental = "";

    public Note(String melodyKey){
        key = melodyKey;
        Random random = new Random();
        int randNum = random.nextInt(6);
        chooseValue();
        chooseNote(randNum);
        addAccidental();
    }

    private void chooseNote(int randNum){
        if(randNum == 0){
            note = "a";
        } else if(randNum == 1){
            note = "b";
        } else if(randNum == 2){
            note = "c";
        } else if(randNum == 3){
            note = "d";
        } else if(randNum == 4){
            note = "e";
        } else if(randNum == 5){
            note = "f";
        } else{
            note = "g";
        }
    }

    public String getNote(){
        return note + accidental;
    }

    private void chooseValue(){
        Value value = new Value();
        noteValue = value.getValue();
    }

    public double getValue(){
        return noteValue;
    }

    private void addAccidental(){
        switch (note) {
            case "a":
                if (key.equals("B") || key.equals("F#") || key.equals("G#")) {
                    accidental = "#";
                } else if (key.equals("Cflat") || key.equals("Gflat") || key.equals("Dflat") || key.equals("Aflat") || key.equals("Eflat")) {
                    accidental = "flat";
                }
                break;
            case "b":
                if (key.equals("F#")) {
                    accidental = "#";
                } else if (key.equals("Cflat") || key.equals("Gflat") || key.equals("Dflat") || key.equals("Aflat") || key.equals("Eflat") || key.equals("Bflat") || key.equals("F")) {
                    accidental = "flat";
                }
                break;
            case "c":
                if (key.equals("D") || key.equals("A") || key.equals("E") || key.equals("B") || key.equals("F#") || key.equals("G#")) {
                    accidental = "#";
                } else if (key.equals("Cflat") || key.equals("Gflat")) {
                    accidental = "flat";
                }
                break;
            case "d":
                if (key.equals("E") || key.equals("B") || key.equals("F#") || key.equals("G#")) {
                    accidental = "#";
                } else if (key.equals("Cflat") || key.equals("Gflat") || key.equals("Dflat") || key.equals("Aflat")) {
                    accidental = "flat";
                }
                break;
            case "e":
                if (key.equals("F#") || key.equals("G#")) {
                    accidental = "#";
                } else if (key.equals("Cflat") || key.equals("Gflat") || key.equals("Dflat") || key.equals("Aflat") || key.equals("Eflat") || key.equals("Bflat")) {
                    accidental = "flat";
                }
                break;
            case "f":
                if (key.equals("G") || key.equals("D") || key.equals("A") || key.equals("E") || key.equals("B") || key.equals("F#") || key.equals("G#")) {
                    accidental = "#";
                } else if (key.equals("Cflat")) {
                    accidental = "flat";
                }
                break;
            default:
                if (key.equals("A") || key.equals("E") || key.equals("B") || key.equals("F#") || key.equals("G#")) {
                    accidental = "#";
                } else if (key.equals("Cflat") || key.equals("Gflat") || key.equals("Dflat")) {
                    accidental = "flat";
                }
                break;
        }
    }


}
