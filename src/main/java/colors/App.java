package colors;

import java.util.Scanner;

import colors.menu.HexMenu;
import colors.menu.Menu;
import colors.menu.RgbMenu;

/**
 * Hello world!
 */
public final class App {
    
    private static Menu currentMenu;
    private static boolean isRunning;

    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        isRunning = true;

        Scanner scanner = new Scanner(System.in);

        while (isRunning) {
            if (currentMenu == null) {
                System.out.println("1. Input RGB color");
                System.out.println("2. Input hex color");
    
                String userInput = scanner.nextLine();
    
                switch (userInput) {
                    case "1":
                        setMenu(new RgbMenu());
                        break;
                    
                    case "2":
                        setMenu(new HexMenu());
                        break;
                    
                    case "":
                        isRunning = false;
                        break;
                    
                    default:
                        System.out.println("2. Input hex color");
                }
    
            } else {
                System.out.println( currentMenu.getPrompt() );
                RgbColor color = currentMenu.inputColor();
    
                if (color != null) {
                    System.out.println("RGB code: " + color.renderAsRgb());
                    System.out.println("Hex code: " + color.renderAsHex());    
                }
            }

            System.out.println("");
        }

        scanner.close();
    }

    public static void setMenu(Menu menu)
    {
        currentMenu = menu;
    }
}
