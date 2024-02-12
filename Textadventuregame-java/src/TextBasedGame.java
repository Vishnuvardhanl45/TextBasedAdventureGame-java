import java.util.Scanner;

public class TextBasedGame {

    public static void main(String[] args) {
        startGame();
    }

    public static void startGame() {
        System.out.println("Welcome to the Dungeon Adventure!");
        System.out.println("You find yourself in front of a dark and mysterious dungeon entrance.");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you want to enter the dungeon? (yes/no):");
        String decision = scanner.next().toLowerCase();

        if (decision.equals("yes")) {
            insideDungeon(scanner);
        } else if (decision.equals("no")) {
            System.out.println("You decided not to enter the dungeon. Game over!");
            handleGameEnd(scanner);
        } else {
            handleInvalidChoice();
            startGame();
        }

        scanner.close(); // Close the scanner
    }

    public static void insideDungeon(Scanner scanner) {
        System.out.println("You entered into the  dungeon and saw three different paths.");
        System.out.println("1. Take the left path");
        System.out.println("2. Take the middle path");
        System.out.println("3. Take the right path");

        int pathChoice = getChoice(3, scanner);

        switch (pathChoice) {
            case 1:
                leftPath(scanner);
                break;
            case 2:
                middlePath(scanner);
                break;
            case 3:
                rightPath(scanner);
                break;
        }
    }

    public static void leftPath(Scanner scanner) {
        System.out.println("You took the left path and you saw a monster!");
        System.out.println("What do you want to do?");
        System.out.println("1. Fight with monster");
        System.out.println("2. Try to run away from monster");

        int actionChoice = getChoice(2, scanner);

        if (actionChoice == 1) {
            System.out.println("Choose a weapon-(Knife,Gun)");
            String decision = scanner.nextLine().toLowerCase();
            if (decision.equals("Knife")) {
                System.out.println("You bravely fought with monster and emerge victorious!");
            } else if (decision.equals("Gun")) {
                System.out.println("You bravely fought with monster and emerge victorious!");
            }

            System.out.println("Congratulations! You've completed the adventure.");
            handleGameEnd(scanner);
        } else if (actionChoice == 2) {
            System.out.println("You try to run away from the  monster, but it notices you. Game over.");
            handleGameEnd(scanner);
        } else {
            handleInvalidChoice();
            leftPath(scanner);
        }
    }

    public static void middlePath(Scanner scanner) {
        System.out.println("You took the middle path and found a treasure chest!");
        System.out.println("Do you want to open the chest? (yes/no)");

        String decision = scanner.nextLine().toLowerCase();

        if (decision.equals("yes")) {
            System.out.println("You opened the chest and found a valuable artifact!");
            System.out.println("Congratulations! You've completed the adventure.");
            handleGameEnd(scanner);
        } else if (decision.equals("no")) {
            System.out.println("You decided not to open the chest. Game over.");
            handleGameEnd(scanner);
        } else

        {
            handleInvalidChoice();
            middlePath(scanner);
        }
    }

    public static void rightPath(Scanner scanner) {
        System.out.println("You took the right path and discovered a hidden door.");
        System.out.println("Do you want to enter the door? (yes/no)");

        String decision = scanner.nextLine().toLowerCase();

        if (decision.equals("yes")) {
            System.out.println("You entered into the door and found a secret passage!");
            System.out.println("Congratulations! You've completed the adventure.");
            handleGameEnd(scanner);
        } else if (decision.equals("no")) {
            System.out.println("You decided not to enter the door. Game over.");
            handleGameEnd(scanner);
        } else {
            handleInvalidChoice();
            rightPath(scanner);
        }
    }

    public static int getChoice(int maxChoice, Scanner scanner) {
        int choice = -1;

        while (choice < 1 || choice > maxChoice) {
            System.out.print("Enter your choice: ");

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine();
            } else {
                handleInvalidChoice();
                scanner.nextLine();
            }

            if (choice < 1 || choice > maxChoice) {
                System.out.println("Invalid choice. Please enter a number between 1 to " + maxChoice + ".");
            }
        }

        return choice;
    }

    public static void handleInvalidChoice() {
        System.out.println("Invalid choice. Please enter a valid choice.");
    }

    public static void handleGameEnd(Scanner scanner) {
        System.out.println("Do you want to play again? (yes/no)");
        String decision = scanner.nextLine().toLowerCase();

        if (decision.equals("yes")) {
            startGame();
        } else if (decision.equals("no")) {
            System.out.println("Thanks for playing! Goodbye.");
        } else {
            System.out.println("Exiting the game. Goodbye.");
        }
    }
}
