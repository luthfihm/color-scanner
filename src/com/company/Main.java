package com.company;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        String fileName = "Kaskus2.jpg";
        File file = new File(fileName);
        BufferedImage image = ImageIO.read(file);
        List<Integer> colors = new ArrayList<Integer>();
        for (int y = 0;y < image.getHeight();y++)
        {
            for (int x = 0;x < image.getWidth();x++)
            {
                int color = image.getRGB(x,y);
                if (!colors.contains(color))
                {
                    colors.add(color);
                }
            }
        }
        System.out.println("File Name : "+fileName);
        System.out.println("Number of colors : "+colors.size());
    }
}