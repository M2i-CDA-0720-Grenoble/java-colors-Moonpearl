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

        RgbColor color = new RgbColor(userInput);

        System.out.println("RGB code: " + color.renderAsRgb());
        System.out.println("Hex code: " + color.renderAsHex());
    }
}
