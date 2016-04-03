package bleh;

import java.io.*;
import org.opencv.core.*;
import org.opencv.imgcodecs.*; // imread, imwrite, etc
import org.opencv.videoio.*;   // VideoCapture

public class screwThis{

    public static void main (String args[]) throws InterruptedException, IOException{
    // Load the native library.
    System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    screwThis ImSoDone = new screwThis();
    ImSoDone.cameraCapture();
    ImSoDone.showImage();
}
    
public void cameraCapture() throws InterruptedException{
    	VideoCapture camera = new VideoCapture(0);
	    Thread.sleep(1000);
	    
	    camera.open(0); //Useless
	    if(!camera.isOpened()){
	        System.out.println("Camera Error");
	    }
	    else{
	        System.out.println("Camera OK?");
	    }
	
	    Mat frame = new Mat();
	
	    camera.read(frame);
	    System.out.println("Frame Obtained");

	    camera.release();
	
	    System.out.println("Captured Frame Width " + frame.width());
	
	    Imgcodecs.imwrite("numbers.jpg", frame);
	    System.out.println("OK");
    }

public void showImage() throws InterruptedException, IOException{
	boolean userInput = true;
    LoadImage numbersImg = null;
    while (userInput){
	    cameraCapture();
		//Read image
	  	Mat m=Imgcodecs.imread("C:\\Users\\C\\Documents\\School\\College\\BeachHacks\\numbers.jpg",Imgcodecs.CV_LOAD_IMAGE_COLOR);
	  	//Load image (by calling LoadImage class)
	  	numbersImg = new LoadImage("C:\\Users\\C\\Documents\\School\\College\\BeachHacks\\numbers.jpg",m);
	  	BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
	  	System.out.println("Take new photo? (y/n)");
	  	String input = stdin.readLine();
	  	if (input.charAt(0) != 'y' && input.charAt(0) != 'Y')
	  		userInput = false;
    }
}
}