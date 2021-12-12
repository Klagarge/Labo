package lab8_tableaux;


public class TheaterApplication {
    public static void main(String[] args) {
        Theater cinema = new Theater(10, 20);
        cinema.occupySeat(2, 1);
        cinema.occupySeat(2, 3);
        cinema.occupySeat(2, 5);
        cinema.occupySeat(2, 8);
        cinema.occupySeat(0, 1);
        cinema.occupySeat(0, 3);
        cinema.occupySeat(0, 5);
        cinema.occupySeat(0, 8);
        cinema.occupySeat(0, 9);
        cinema.occupySeat(0, 10);
        cinema.occupySeat(0, 11);
        cinema.occupySeat(0, 13);
        cinema.occupySeat(0, 15);
        cinema.occupySeat(0, 18);
        System.out.println(cinema);
        System.out.println(cinema.occupation());
    }
}
