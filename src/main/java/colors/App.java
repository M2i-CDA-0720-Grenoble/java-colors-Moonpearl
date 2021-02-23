package colors;

import java.util.Scanner;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.nextLine();

        int[] numbers = new int[3];
        if (userInput.length() == 6) {
            for (int i = 0; i < 3; i++) {
                int beginIndex = i * 2;
                int endIndex = beginIndex + 2;

                String numberStr = userInput.substring(beginIndex, endIndex);

                numbers[i] = Integer.parseInt(numberStr, 16);
            }
        }

        System.out.println("rgb(" + numbers[0] + ", " + numbers[1] + ", " + numbers[2] + ")");
    }
}
