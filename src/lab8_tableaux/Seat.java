package lab8_tableaux;

public class Seat {
    public boolean busy;
    private char row;
    private int column;

    Seat(char row, int column){
        this.row = row;
        this.column = column;
    }

    public String getPlace(){
        String s = "";
        s += this.column;
        s += this.row;
        return s;
    }
}
