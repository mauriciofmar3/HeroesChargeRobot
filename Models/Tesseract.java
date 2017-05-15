
import java.awt.Robot;
import java.awt.*;
import java.io.*;
import javax.imageio.*;
import java.awt.image.*;
import java.util.*;
class Tesseract {
    public static void takeScreenshot(int x, int y, int width, int height) {
        try {
            // Calendar now = Calendar.getInstance();
            // String filename = "d:\\"+formatter.format(now.getTime())+".jpg";
            Robot robot = new Robot();
            Rectangle rect = new Rectangle(x, y, width, height);
            BufferedImage screenShot = robot.createScreenCapture(rect);
            ImageIO.write(screenShot, "PNG", new File("temp"));
            // System.out.println(formatter.format(now.getTime()));
        } catch (Exception e) {

        }
    }

    public static String parseScreenshot() {
    	try {
			Runtime rt = Runtime.getRuntime();
			Process pr = rt.exec("tesseract temp out");
            pr.waitFor();
			// GameMouse.sleep(500);
			Scanner in = new Scanner(new FileReader("out.txt"));
			String str = in.nextLine();
			str = str.replaceAll("[^0-9]", "");
            System.out.println("PARSED " + str);
            return str;
		} catch(Exception e) {
			System.out.println(e);
		}
        return "";
    }

    public static String parseScreenshotString() {
        try {
            Runtime rt = Runtime.getRuntime();
            Process pr = rt.exec("tesseract temp out");
            pr.waitFor();
            // GameMouse.sleep(1000);
            Scanner in = new Scanner(new FileReader("out.txt"));
            String str = in.nextLine();
            while (in.hasNext()) {
                str = str + in.next();
            }
            // str = str.replaceAll("[^0-9]", "");
            System.out.println("PARSED " + str);
            return str;
        } catch(Exception e) {
            System.out.println(e);
        }
        return "";
    }

    public static void appendStringToFile(String text, String filename) {
        try {
            FileWriter fw = new FileWriter(filename, true);
            fw.write(text + "\n");
            fw.close();
        } catch(IOException e) { }
    }
}