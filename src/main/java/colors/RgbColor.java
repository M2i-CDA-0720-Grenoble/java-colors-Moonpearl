package colors;

public class RgbColor {
    
    public int[] channels;

    public RgbColor(String hex)
    {
        channels = new int[3];
        if (hex.length() == 6) {
            for (int i = 0; i < 3; i++) {
                int beginIndex = i * 2;
                int endIndex = beginIndex + 2;

                String numberStr = hex.substring(beginIndex, endIndex);

                channels[i] = Integer.parseInt(numberStr, 16);
            }
        } else {
            throw new NumberFormatException("Hex color code must be exactly 6 characters long.");
        }
    }

    public RgbColor(int red, int green, int blue)
    {
        channels = new int[] { red, green, blue };
    }

    public int getRed()
    {
        return channels[0];
    }

    public int getGreen()
    {
        return channels[1];
    }

    public int getBlue()
    {
        return channels[2];
    }

    public String renderAsRgb()
    {
        return "rgb(" + getRed() + ", " + getGreen() + ", " + getBlue() + ")";
    }

    public String renderAsHex()
    {
        String[] channelStrings = new String[3];

        for (int i = 0; i < 3; i++) {
            String channelString = "";
            if (channels[i] < 16) {
                channelString += "0";
            }
            channelString += Integer.toHexString(channels[i]);
            channelStrings[i] = channelString;
        }

        return "#" + String.join("", channelStrings);
    }

}
