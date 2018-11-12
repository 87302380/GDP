package de.gdp.ws18.s4;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageEditor {

    public static void main(String[] args) throws IOException {
        String input = "/home/leichen/Pictures/wallhaven-694959.jpg";
        String output = "/home/leichen/Desktop/output.jpg";

        BufferedImage image = ImageIO.read(new File(input));
        BufferedImage edited = ImageIO.read(new File(input));

        int breite = image.getWidth();
        int hoehe = image.getHeight();


        for (int i = 0;i<breite;i++){
            for (int j = 0;j<hoehe;j++){
                int color = edited.getRGB(i,j);
                int alpha = (color >> 24) & 0xff;

                alpha &= 0xff;
                color &= 0x00ffffff;
                color |= (alpha << 24);
                edited.setRGB(i, j, color);

            }
        }


        File resultFile = new File(output);
        ImageIO.write(edited, "jpg", resultFile);
    }

}
