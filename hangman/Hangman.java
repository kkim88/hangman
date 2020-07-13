package hangman;

import java.util.Scanner;
import java.util.stream.Stream;

public class Hangman {

    private static String wordList[] = {"teksystems", "tekcamp", "java", "terminal", "compiler", "lambda", "concurrency",
            "object", "method", "property", "inheritance", "polymorphism", "abstraction", "encapsulation", "constructor",
            "class", "abstract", "interface", "stream", "regex", "scope", "package", "array", "boolean", "string", "getter",
            "setter", "public", "private", "static", "final", "runnable", "implements", "extends", "main", "null", "return",
            "void"}; // list of words to choose from
    private static String chosenWord = wordList[(int) (Math.random() * wordList.length)]; // random chosen word from list
    private static String hiddenWord = "*".repeat(chosenWord.length()); // string of asterisks same length as chosenWord to show player
    private static int errors = 0; // count for number of errors player has made
    private static int choice; // character choice
    private static char instructions; // yes/no instructions

    public static void main(String[] args) {
        System.out.println("Welcome to Hangman DELUXE!");

        do {
            Scanner i = new Scanner(System.in); // reads next user input for instructions
            System.out.println("Do you want to learn how to play? Enter y for yes or n for no.");
            instructions = i.next().charAt(0);
        }
        while (instructions !='y' && instructions !='Y' && instructions !='n' && instructions != 'N');

        if (instructions == 'y' || instructions == 'Y') {
            WordsInterface inst = () -> {
                return "A word is randomly chosen from an existing list of words and is shown to the player obscured. " +
                        "The player then guesses a letter they think might be in the \nword when prompted. If the letter " +
                        "exists in the word, it is revealed to the player in the corresponding spots. If the letter does" +
                        " not exist, a \nportion of a stick figure being hanged is drawn. The game ends when the player " +
                        "either reveals the entire word or the stick figure is fully drawn.\n\nFor more in depth " +
                        "instructions, please see the github repo at: https://github.com/kkim88/hangman/blob/master/instructions.md";
            };
            System.out.println(inst.printWords());
        }
        else {
            WordsInterface inst = () -> {
                return "Okay then!";
            };
            System.out.println(inst.printWords());
        }

        // ask user to press enter to continue. Will be used often.

        pressEnter();

        WordsInterface intro = () -> {
            return "You are a detective at the local precinct of a small town. When I say small, I mean like, super " +
                    "duper really small town in the middle of Nowhere, USA. This \ntown is a bit behind the country when " +
                    "it comes to criminal justice. Like a hundred or so years behind. Actually, you hesitate to call " +
                    "it \"criminal justice\" \nat all. Sure, the town boasts a high conviction rate for criminals, but " +
                    "that's because the town has a near 100% conviction rate, and it's well known that \nmany of those " +
                    "found guilty are actually innocent and sent to the gallows to be hanged. (Another way this town is " +
                    "living in the past.) Few people seem to \ncare, but you do. You care about truth and justice and " +
                    "you've decided that enough innocents have been wronged. Three men are currently on death row and " +
                    "\nare scheduled to hang soon: Harry, Henry, and Hank. Quickly, you read over their information.";
        };
        System.out.println(intro.printWords());

        pressEnter();

        // create the three "dummies." I realize this is not a nice thing to call innocent men about to die. I'm sorry.

        Harry harry = new Harry();
        Henry henry = new Henry();
        Hank hank = new Hank();

        // show information of each man to the player


        System.out.println("Name: " + harry.getName());
        System.out.println("Age: " + harry.getAge());
        System.out.println("Crime: " + harry.getCrime() + "\n");
        harry.biography();

        pressEnter();

        System.out.println("Name: " + henry.getName());
        System.out.println("Age: " + henry.getAge());
        System.out.println("Crime: " + henry.getCrime() + "\n");
        henry.biography();

        pressEnter();

        System.out.println("Name: " + hank.getName());
        System.out.println("Age: " + hank.getAge());
        System.out.println("Crime: " + hank.getCrime() + "\n");
        hank.biography();

        pressEnter();

        System.out.println("Having read up on all three men, who will you try to save?");
        // user input for choice

        do {
            System.out.println("Enter 1 for Harry, 2 for Henry, or 3 for Hank.");
            Scanner c = new Scanner(System.in);
            choice = c.nextInt();
        }
        while (choice != 1 && choice != 2 && choice != 3);

        switch (choice) {
            case 1:
            {
                System.out.println("You have chosen Harry.");
                break;
            }
            case 2:
            {
                System.out.println("You have chosen Henry.");
                break;
            }
            case 3:
            {
                System.out.println("You have chosen Hank.");
            }
        }

        WordsInterface opening1 = () -> {
            return "\nYou make your way over to the prison only to learn the man you're here to save is already on his " +
                    "way to the gallows. The execution isn't supposed to be for \nanother two months! Was it moved just " +
                    "to spite you? How is this even possible, considering that bureaucracy usually makes it impossible " +
                    "for things to happen \non time much less EARLY. Regardless, you rush to the gallows, waving your " +
                    "arms and yelling everyone to stop because that man doesn't deserve to die.";
        };
        System.out.println(opening1.printWords());

        pressEnter();

        WordsInterface opening2 = () -> {
            return "\"You want to stop?\" he asks. \"This is highly unprecedented.\" He pauses and thinks for a bit. " +
                    "\"Alright,\" he continues after a moment. \"Let's make a game out \nof it. I'm thinking of a word. " +
                    "You guess letters and for every letter isn't in the word, that guy gets one step closer to " +
                    "Execution Town. If you can guess \nall the letters in the word before that, we'll cancel the execution.";
        };
        System.out.println(opening2.printWords());

        pressEnter();

        WordsInterface opening3 = () -> {
            return "That's the stupidest thing you've ever heard. And you let him know that, rather foolishly. He shrugs." +
                    "\n\n\"I make the rules around here. If you don't wanna play, that guy'll be swinging in the next five minutes.\"" +
                    "\n\nWith no other choice, you reluctantly agree. The executioner claps his hands like a giddy little girl." +
                    "\n\n\"Aww yeah, this will be fun! I always wanted to do this. Okay I got my word now. By the way," +
                    "the word is related to Java programming.\" \n\nYou ask him why. \n\nHe shrugs. \"It just is, okay?\"" +
                    "\n\nA man's life is now dependent on something that is roughly 30% your knowledge of Java programming and " +
                    "70% luck. Decent odds, you suppose. You take a deep \nbreath and begin guessing.";
        };
        System.out.println(opening3.printWords());

        // code for the actual game starts here

        Scanner guess = new Scanner(System.in); // scanner for letter inputs
        String letter; // letter guessed by player

        // while loop for game. Runs while player still has guesses left and word has not been revealed.

        while (errors < 7 && hiddenWord.contains("*")) {
            System.out.println("Word: " + hiddenWord);
            System.out.println("Enter a letter.");
            letter = guess.next();
            check(letter);
        }

    }

    // method that asks user to press enter to continue game. Used a lot for breaks in narration.

    private static void pressEnter()
    {
        System.out.println("\nPress the Enter key to continue...");
        try
        {
            System.in.read();
        }
        catch(Exception e)
        {

        }

    }

    // method to check player guesses

    public static void check(String letter) {
        String newWord = "";
        for (int j = 0; j < chosenWord.length(); j++) {
            if (chosenWord.charAt(j) == letter.charAt(0)) {
                newWord += letter.charAt(0);
            }
            else if (hiddenWord.charAt(j) != '*') {
                newWord += chosenWord.charAt(j);
            }
            else {
                newWord += "*";
            }
        }

        // if guess is wrong, add 1 to errors and print dummy

        if (hiddenWord.equals(newWord)) {
            errors++;
            printDummy();
        }
        else {
            hiddenWord = newWord;
        }

        // if hiddenWord is identical to chosenWord, player wins

        if (hiddenWord.equals(chosenWord)) {
            System.out.println(chosenWord);
            System.out.println("You win!");
            WordsInterface winner = () -> {
                return "\"Well, I'll be,\" the executioner muses casually. \"You did it. A deal's a deal, I guess.\" " +
                        "The absolute casualness of his tone infuriates you. This really is \njust a game to him, isn't it? " +
                        "Still, you played and you won, and though this victory may seem hollow, you will claim it all the same. " +
                        "Real change will come \nto this town one day, and although that day is not today, this is an important " +
                        "step towards towards that future. Until that day arrives, however, you still \nhave your work cut out for you.\n";
            };
            System.out.println(winner.printWords());
            if (choice == 1) {
                Harry.goodEnd();
            }
            else if (choice == 2) {
                Henry.goodEnd();
            }
            else {
                Hank.goodEnd();
            }
        }

    }

    // method to print dummy

    public static void printDummy() {
        switch (errors) {
            case 1: {
                Stream<String> image = Stream.of("  +---+",
                                                 "  |   |",
                                                 "      |",
                                                 "      |",
                                                 "      |",
                                                 "      |",
                                                 "=========");
                image.forEach(System.out::println);
                break;
            }
            case 2: {
                Stream<String> image = Stream.of("  +---+",
                                                 "  |   |",
                                                 "  O   |",
                                                 "      |",
                                                 "      |",
                                                 "      |",
                                                 "=========");
                image.forEach(System.out::println);
                break;
            }
            case 3: {
                Stream<String> image = Stream.of("  +---+",
                                                 "  |   |",
                                                 "  O   |",
                                                 "  |   |",
                                                 "      |",
                                                 "      |",
                                                 "=========");
                image.forEach(System.out::println);
                break;
            }
            case 4: {
                Stream<String> image = Stream.of("  +---+",
                                                 "  |   |",
                                                 "  O   |",
                                                 " /|   |",
                                                 "      |",
                                                 "      |",
                                                 "=========");
                image.forEach(System.out::println);
                break;
            }
            case 5: {
                Stream<String> image = Stream.of("  +---+",
                                                 "  |   |",
                                                 "  O   |",
                                                 " /|\\  |",
                                                 "      |",
                                                 "      |",
                                                 "=========");
                image.forEach(System.out::println);
                break;
            }
            case 6: {
                Stream<String> image = Stream.of("  +---+",
                                                 "  |   |",
                                                 "  O   |",
                                                 " /|\\  |",
                                                 " /    |",
                                                 "      |",
                                                 "=========");
                image.forEach(System.out::println);
                break;
            }
            case 7: {
                Stream<String> image = Stream.of("  +---+",
                                                 "  |   |",
                                                 "  O   |",
                                                 " /|\\  |",
                                                 " / \\  |",
                                                 "      |",
                                                 "=========");
                image.forEach(System.out::println);
                System.out.println("GAME OVER!");
                System.out.println("\nThe word was " + chosenWord + "\n");
                WordsInterface gameOver = () -> {
                    return ("The executioner shrugs. \"Aww, too bad, so sad,\" he coos. \"Looks like you're donezo!\" No, " +
                            "no...! This can't be! You cry out in frustration. This is ludicrous, \nstaking a human being's " +
                            "life on a word game of all things! But that's the way this town has always been, hasn't it? " +
                            "A cruel place that doesn't actually \ndeal with problems, but sweeps them under the rug by " +
                            "ruining lives. They may have won today, but you can't let this stop you. One day, one day " +
                            "justice will \nprevail.\n");
                };
                System.out.println(gameOver.printWords());
                if (choice == 1) {
                    Harry.badEnd();
                }
                else if (choice == 2) {
                    Henry.badEnd();
                }
                else {
                    Hank.badEnd();
                }
            }
        }
    }

    // interface for simple print statements
    @FunctionalInterface
    interface WordsInterface {
        public String printWords();
    }


}
