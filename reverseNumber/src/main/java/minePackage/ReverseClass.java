package minePackage;

import java.util.Scanner;

public class ReverseClass {
    /**
     * Private Constructor.
     */
    private ReverseClass() {
    }

    /**
     * Create Instance by a method!!
     */
    public static void initiateNewInstance() {
        ReverseClass test = new ReverseClass();
        test.userInput();
    }

    /**
     *
     * @param name is the User's word.
     * @return The User's word reverse.
     */
    private String wordReverse(String name) {

        StringBuilder builder = new StringBuilder();

        try {
            if (name.length() == 0) {
                return "Please write a valid word!!";
            }

            for (int i = name.length() - 1; i >= 0; i--) {
                builder.append(name.charAt(i));
            }
            return "The reversed word is: " + builder + "\n";

        } catch (Exception ex) {
            return ex.toString();
        }
    }

    private void userInput() {

        while (true) {
            Scanner scannerUserWord = new Scanner(System.in);
            System.out.println("Enter the word you want and we'll reverse it:");
            String userWord = scannerUserWord.nextLine();

            if (userWord.equalsIgnoreCase("exit")) {
                System.out.println("Process finished!!");
                System.exit(0);
            }
            System.out.println(wordReverse(userWord));
        }
    }
}
