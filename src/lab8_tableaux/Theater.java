package lab8_tableaux;

public class Theater {
    private Seat[][] seats;

    Theater(int r, int c){
        seats = new Seat[c][r];
        for (int i = 1; i <= c; i++) {
            for (char j = 'A'; j < 'A'+r; j++) {
                seats[i-1][j-'A'] = new Seat(j,i);
            }
        }
    }

    public String getSeat(int row, int column){
        return seats[column][row].getPlace();
    }

    public boolean isSeatBusy (int row, int column){
        return seats[column][row].busy;
    }

    public boolean occupySeat(int row, int column) {
        if (isSeatBusy(row, column)) {
            return false;
        }
        seats[column][row].busy = true;
        return true;
    }

    private int numberOfBusySeats(){
        int total =0 ;
        int r = seats[0].length;
        int c = seats.length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if(isSeatBusy(i, j)){
                    total++;
                }
            }
        }
        return total;
    }

    private int numberOfSeats(){
        int total =0 ;
        int r = seats[0].length;
        int c = seats.length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                total++;
            }
        }
        return total;
    }

    public String occupation() {
        String s = "";
        s += "Theater occupation: ";
        s += numberOfBusySeats();
        s += " / ";
        s += numberOfSeats();
        return s;
    }

    private String[] getContiguousSeats(int nbrOfSeat){
        String[] contiguousSeats = new String[nbrOfSeat];
        int contiguous =0 ;
        int r = seats[0].length;
        int c = seats.length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                contiguous = isSeatBusy(i, j) ? 0:contiguous+1;
                if (contiguous >= nbrOfSeat) {
                    for (int k = 1; k <= contiguous; k++) {
                        occupySeat(i, (j-contiguous+k));
                        contiguousSeats[k-1] = getSeat(i, (j-contiguous+k));
                    }
                    return contiguousSeats;
                }
            }
        }
        return null;
    }

    public String reserveSeat(int nbrOfSeat){
        String s = "";
        String[] reservedSeats = getContiguousSeats(nbrOfSeat);
        if(reservedSeats != null){
            s += "Got the contiguous seats : \n";
            for(int i = 0; i < reservedSeats.length; i++){
                s += "-" + reservedSeats[i] + "\n";
            }
        } else {
            s += "Could not get contiguous seats";
        }
        return s;
    }

    public String toString(){
        String s = "";
        s += "Theater seats occupation:";
        s += "\n";
        s += "\n";
        s += " ";
        int r = seats[0].length;
        int c = seats.length;
        System.out.println(c + "x" + r);
        for (int i = 0; i < c; i++) {
            s += " ";
            s += i;
        }
        s += "\n";
        for (int i = 0; i < r; i++) {
            s += i;
            s += " ";
            for (int j = 0; j < c; j++) {
                if (isSeatBusy(i, j)) {
                    s += "X";
                } else {
                    s += " ";
                }
                s += space(j);
            }
            s += "\n";
        }
        return s;
    }

    private String space (int i){
        String s = "";
        int length = String.valueOf(i).length();
        for (int j = 0; j < length; j++) {
            s += " ";
        }
        return s;
    }
}
