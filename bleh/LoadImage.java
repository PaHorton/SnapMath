package bleh;
import java.awt.*;
import javax.swing.*;

import org.opencv.core.Mat;
//import org.opencv.highgui.Highgui; DNE, became below
import org.opencv.imgcodecs.*; // imread, imwrite, etc

public class LoadImage extends JFrame {	
	//Load Image for user to see
	public LoadImage(String imgStr,Mat m){
		//Write passed in image to GUI
		Imgcodecs.imwrite(imgStr,m);
		//Make GUI
		JFrame frame = new JFrame("SnapCalc");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//GUI stuff
		frame.setResizable(true);
		frame.setLocationRelativeTo(null);
		 
		// Inserts the image icon
		ImageIcon image = new ImageIcon(imgStr);
		frame.setSize(image.getIconWidth()+10,image.getIconHeight()+35);
		// Draw the Image data into the BufferedImage
		JLabel label1 = new JLabel(" ", image, JLabel.CENTER);
		frame.getContentPane().add(label1);
		//Show image
		frame.validate();
		frame.setVisible(true);
		}
}