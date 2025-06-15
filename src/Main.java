import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int counter = 0;
    public static StringBuilder gallow = new StringBuilder("""
                                                            _____
                                                              |
                                                            """);
    public static void main(String[] args) {
        String[] words = {"abandon", "ability", "able", "abortion", "about", "above", "abroad", "absence", "absolute",
                "baby", "back", "background", "badly", "bake", "balance", "ball", "band", "bank",
                "cabin", "cabinet", "cable", "cake", "calculate", "call", "camera", "camp", "campaign",
                "dad", "daily", "damage", "dance", "danger", "dangerous", "dare", "dark", "darkness",
                "data"};
        Scanner scan = new Scanner(System.in);
        int number = 0;
        String randomWord = words[(int) (Math.random() * words.length)];
        StringBuilder wordGuess = new StringBuilder();
        wordGuess.append(randomWord.charAt(0));
        for(int i = 1; i < randomWord.length() - 1; i ++) {
            if(randomWord.charAt(i) == randomWord.charAt(0) || randomWord.charAt(i) == randomWord.charAt(randomWord.length() - 1)) {
                wordGuess.append(randomWord.charAt(i));
            } else {
                wordGuess.append("_");
            }
        }
        wordGuess.append(randomWord.charAt(randomWord.length() - 1));
        System.out.println(wordGuess);
        char[] guessArray = new char[wordGuess.length()];
        wordGuess.getChars(0, wordGuess.length(), guessArray, 0);
        while(!wordGuess.toString().equals(randomWord)) {
            System.out.print("Enter a letter: ");
            char letter = scan.next().charAt(0);
            if (randomWord.contains(String.valueOf(letter))) {
                System.out.println("You guessed a letter.");
                number ++;
                for (int i = 1; i <= randomWord.length() - 2; i++) {
                    if (randomWord.charAt(i) == letter) {
                        guessArray[i] = letter;
                        wordGuess = new StringBuilder(new String(guessArray));
                        System.out.println(wordGuess);
                    } else if (wordGuess.toString().equals(randomWord)) {
                        break;
                    }
                }
            } else {
                printHangman();
                counter ++;
                if(counter == 8) {
                    break;
                }
            }
        }
        System.out.println("You guessed the word!");
    }

    public static void printHangman() {
        switch (counter) {
            case 0:
                System.out.println(gallow);
                break;
            case 1:
                gallow.append("  o\n");
                System.out.println(gallow);
                break;
            case 2:
                gallow.append(" /");
                System.out.println(gallow);
                break;
            case 3:
                gallow.append("|");
                System.out.println(gallow);
                break;
            case 4:
                gallow.append("\\\n");
                System.out.println(gallow);
                break;
            case 5:
                gallow.append("  |\n");
                System.out.println(gallow);
                break;
            case 6:
                gallow.append(" /");
                System.out.println(gallow);
                break;
            case 7:
                gallow.append(" \\\n");
                System.out.println(gallow);
            default:
                System.out.println("You lost hangman");
                break;
        }
    }
}