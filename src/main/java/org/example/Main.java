package org.example;

public class Main {
    public static void main(String[] args) {
        Cinema cinema = new Cinema(5, 10, 20);

        cinema.bookSeats(1, 3, new int[]{5, 6, 7});
        cinema.bookSeats(2, 2, new int[]{8, 9, 10});

        cinema.printSeatingArrangement(1);
        cinema.printSeatingArrangement(2);

        cinema.cancelBooking(1, 3, new int[]{5, 6, 7});

        cinema.printSeatingArrangement(1);

        cinema.checkAvailability(1, 3);
    }
}
