package lab8_tableaux;


public class TheaterApplication {
    public static void main(String[] args) {
        Theater cinema = new Theater(7, 11);
        cinema.occupySeat(0, 1);
        cinema.occupySeat(0, 3);
        cinema.occupySeat(0, 6);
        cinema.occupySeat(0, 7);
        cinema.occupySeat(1, 0);
        cinema.occupySeat(1, 1);
        cinema.occupySeat(1, 5);
        cinema.occupySeat(3, 3);
        cinema.occupySeat(3, 7);
        cinema.occupySeat(4, 7);
        cinema.occupySeat(5, 5);
        cinema.occupySeat(5, 8);
        cinema.occupySeat(6, 8);
        System.out.println(cinema);
        System.out.println(cinema.occupation());

        System.out.println(cinema.reserveSeat(4));
        System.out.println(cinema);
        System.out.println(cinema.occupation());

        System.out.println(cinema.reserveSeat(2));
        System.out.println(cinema);
        System.out.println(cinema.occupation());
    }
}
