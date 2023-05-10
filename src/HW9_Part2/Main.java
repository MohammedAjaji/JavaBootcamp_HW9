import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        MovablePoint move = new MovablePoint(5, 5, 1,1);

        while (true) {
            for (int i = 0; i < 11; i++) {
                for (int j = 0; j < 11; j++) {
                    if (i == move.getY() && j == move.getX()) {
                        System.out.print("#  ");
                    } else {
                        System.out.print(".  ");
                    }
                }
                System.out.println();
            }
            System.out.print("Enter (w /a /s / d) to move or 'q' to quit: ");
            String input = s.next().toLowerCase();
            switch (input) {
                case "w":
                    move.moveUp();
                    break;
                case "a":
                    move.moveLeft();
                    break;
                case "s":
                    move.moveDown();
                    break;
                case "d":
                    move.moveRight();
                    break;
            }

            if (input.equals("q")) {
                break;
            }else{
                System.out.print("Invalid input please enter (w /a /s / d) to move or 'q' to quit: \n");
            }
        }
    }




}