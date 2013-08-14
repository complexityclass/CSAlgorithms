package sortings;

import compIO.StdDraw;

import java.io.*;
import java.nio.charset.Charset;

/**
 * Created with IntelliJ IDEA.
 * User: complexityclass
 * Date: 8/5/13
 * Time: 1:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class Approx {


    public static void main(String[] args) throws FileNotFoundException, IOException {

        InputStream fis = new FileInputStream("dots.txt");
        BufferedReader bf = new BufferedReader(new InputStreamReader(fis, Charset.forName("UTF-8")));

        String line = null;

        while ((line = bf.readLine()) != null){

            String[] cord = line.split(" : ");
            double x = Double.parseDouble(cord[0]);
            double y = Double.parseDouble(cord[1]);

            StdDraw.circle(x,y,0.005);


        }
        StdDraw.show(10);

    }

}
