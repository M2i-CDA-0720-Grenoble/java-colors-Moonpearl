package colors.menu;

import java.util.Scanner;

import colors.App;
import colors.RgbColor;

public class RgbMenu extends Menu {
    
    public String getPrompt()
    {
        return "Please three values for channels red, green, and blue";
    }
    
    public RgbColor inputColor()
    {
        try {
            Scanner scanner = new Scanner(System.in);
        
            int red = Integer.parseInt( scanner.nextLine() );
            int green = Integer.parseInt( scanner.nextLine() );
            int blue = Integer.parseInt( scanner.nextLine() );
            
            return new RgbColor(red, green, blue);
        }
        catch (NumberFormatException exception) {
            App.setMenu(null);
            return null;
        }
    }
}
