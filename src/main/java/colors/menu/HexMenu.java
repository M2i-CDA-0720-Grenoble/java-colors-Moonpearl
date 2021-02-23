package colors.menu;

import java.util.Scanner;

import colors.App;
import colors.RgbColor;

public class HexMenu extends Menu {

    public String getPrompt()
    {
        return "Please enter a hex color code";
    }
    
    public RgbColor inputColor()
    {
        Scanner scanner = new Scanner(System.in);
        String hex = scanner.nextLine();
        // scanner.close();

        if ("".equals(hex)) {
            App.setMenu(null);
            return null;
        }

        return new RgbColor(hex);
    }
}
