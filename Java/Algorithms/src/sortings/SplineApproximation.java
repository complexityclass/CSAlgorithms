package sortings;

import compIO.StdDraw;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: complexityclass
 * Date: 8/5/13
 * Time: 12:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class SplineApproximation {

    public static void main(String[] args) throws IOException {

        File dotFile = new File("dots.txt");
        if (!dotFile.exists()) {
            dotFile.createNewFile();
        }

        String newLine = System.getProperty("line.separator");

        FileWriter fw = new FileWriter(dotFile.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);


        while (true) {

            if (StdDraw.mousePressed()) {

                bw.write(StdDraw.mouseX() + "  :  " + StdDraw.mouseY() + newLine);


            }

        }


    }


}

class Point {

    double X;
    double Y;

    Point(double x, double y) {
        this.X = x;
        this.Y = y;
    }

}