package colors;

public class RgbColor {
    
    public int red;
    public int green;
    public int blue;

    public RgbColor(String hex)
    {
        int[] numbers = new int[3];
        if (hex.length() == 6) {
            for (int i = 0; i < 3; i++) {
                int beginIndex = i * 2;
                int endIndex = beginIndex + 2;

                String numberStr = hex.substring(beginIndex, endIndex);

                numbers[i] = Integer.parseInt(numberStr, 16);
            }
        } else {
            throw new NumberFormatException("Hex color code must be exactly 6 characters long.");
        }

        red = numbers[0];
        green = numbers[1];
        blue = numbers[2];
    }

    public RgbColor(int red, int green, int blue)
    {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public String renderAsRgb()
    {
        return "rgb(" + red + ", " + green + ", " + blue + ")";
    }

    public String renderAsHex()
    {
        String redString = Integer.toHexString(red);
        String greenString = Integer.toHexString(green);
        String blueString = Integer.toHexString(blue);

        if (red < 16) {
            redString = "0" + redString;
        }

        if (green < 16) {
            greenString = "0" + greenString;
        }

        if (blue < 16) {
            blueString = "0" + blueString;
        }

        return "#" + redString + greenString + blueString;
    }

}
