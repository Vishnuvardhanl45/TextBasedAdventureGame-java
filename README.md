# TextBasedAdventureGame-java


Project Name: Dungeon Adventure

Programming Language: Java

Description:

A simple text-based adventure game where the player explores a dungeon with three paths: left, middle, and right. Each path has its own outcome, which may lead to fighting a monster, finding a treasure chest, or discovering a hidden door. The game allows the player to fight the monster with a knife or a gun, open the treasure chest, or enter the hidden door. The game continues until the player decides to stop playing.

Code Structure:

TextBasedGame: The main class containing the main method that starts the game.
startGame(): Initializes the game, prints the introduction, and prompts the player to enter the dungeon.
insideDungeon(Scanner scanner): Displays the available paths and prompts the player to choose one.
leftPath(Scanner scanner): Handles the outcome when the player chooses the left path.
middlePath(Scanner scanner): Handles the outcome when the player chooses the middle path.
rightPath(Scanner scanner): Handles the outcome when the player chooses the right path.
getChoice(int maxChoice, Scanner scanner): Validates the user's choice and returns the input.
handleInvalidChoice(): Prints an error message when the user enters an invalid choice.
handleGameEnd(Scanner scanner): Handles the game end conditions and prompts the user to play again.

How to Run:

Save the provided code in a file named TextBasedGame.java.
Compile the Java file using the command javac TextBasedGame.java.
Run the compiled Java file using the command java TextBasedGame.

How to Contribute:

Feel free to modify the code, add new features, or fix any issues you find. When contributing, make sure to follow good coding practices and include clear commit messages.

License:

This project is open-source and licensed under the MIT License. You are free to use, modify, and distribute the code as you see fit.

Acknowledgments:

Thanks to the creators of Java and the developers who contributed to the language and its libraries.
