package org.example;

public class Cinema {
    private Hall[] halls;

    public Cinema(int numHalls, int numRows, int numSeatsPerRow) {
        halls = new Hall[numHalls];
        for (int i = 0; i < numHalls; i++) {
            halls[i] = new Hall(numRows, numSeatsPerRow);
        }
    }

    public void bookSeats(int hallNumber, int row, int[] seats) {
        if (isValidHallNumber(hallNumber)) {
            halls[hallNumber - 1].bookSeats(row, seats);
        } else {
            System.out.println("Invalid hall number.");
        }
    }

    public void cancelBooking(int hallNumber, int row, int[] seats) {
        if (isValidHallNumber(hallNumber)) {
            halls[hallNumber - 1].cancelBooking(row, seats);
        } else {
            System.out.println("Invalid hall number.");
        }
    }

    public boolean checkAvailability(int hallNumber, int numSeats) {
        if (isValidHallNumber(hallNumber)) {
            return halls[hallNumber - 1].checkAvailability(numSeats);
        } else {
            System.out.println("Invalid hall number.");
            return false;
        }
    }

    public void printSeatingArrangement(int hallNumber) {
        if (isValidHallNumber(hallNumber)) {
            halls[hallNumber - 1].printSeatingArrangement();
        } else {
            System.out.println("Invalid hall number.");
        }
    }

    private boolean isValidHallNumber(int hallNumber) {
        return hallNumber >= 1 && hallNumber <= halls.length;
    }
}
