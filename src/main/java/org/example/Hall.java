package org.example;

public class Hall {
    private int[][][] seatingArrangement;

    public Hall(int numRows, int numSeatsPerRow) {
        seatingArrangement = new int[numRows][numSeatsPerRow][];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numSeatsPerRow; j++) {
                seatingArrangement[i][j] = new int[]{0};
            }
        }
    }

    public void bookSeats(int row, int[] seats) {
        for (int seat : seats) {
            seatingArrangement[row - 1][seat - 1][0] = 1;
        }
        System.out.println("Seats booked successfully.");
    }

    public void cancelBooking(int row, int[] seats) {
        for (int seat : seats) {
            seatingArrangement[row - 1][seat - 1][0] = 0;
        }
        System.out.println("Booking canceled successfully.");
    }

    public boolean checkAvailability(int numSeats) {
        for (int i = 0; i < seatingArrangement.length; i++) {
            for (int j = 0; j <= seatingArrangement[i].length - numSeats; j++) {
                boolean available = true;
                for (int k = 0; k < numSeats; k++) {
                    if (seatingArrangement[i][j + k][0] == 1) {
                        available = false;
                        break;
                    }
                }
                if (available) {
                    System.out.println("Available seats found in row " + (i + 1));
                    return true;
                }
            }
        }
        System.out.println("No available seats found.");
        return false;
    }

    public void printSeatingArrangement() {
        for (int i = 0; i < seatingArrangement.length; i++) {
            for (int j = 0; j < seatingArrangement[i].length; j++) {
                System.out.print(seatingArrangement[i][j][0] == 1 ? "X " : "O ");
            }
            System.out.println();
        }
    }
}

