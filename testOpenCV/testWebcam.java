package testOpenCV;

import org.opencv.core.*;
import org.opencv.imgcodecs.*; // imread, imwrite, etc
import org.opencv.videoio.*;   // VideoCapture



public class testWebcam {

    public static void main (String args[]) throws InterruptedException{

    // Load the native library.
    System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

    // Rev up them video cameras
    VideoCapture camera = new VideoCapture(0);
    Thread.sleep(1000);
    
    //Check dem opened cameras
    camera.open(0); //Useless
    if(!camera.isOpened()){
        System.out.println("Camera Error");
    }
    else{
        System.out.println("Camera OK?");
    }

    //Make dat Matrix
    Mat matFrame = new Mat();

    //camera.grab();
    //System.out.println("matFrame Grabbed");
    //camera.retrieve(matFrame);
    //System.out.println("matFrame Decoded");

    //Take dem pics
    camera.read(matFrame);
    System.out.println("matFrame Obtained");

    /* No difference
    camera.release();
    */

    System.out.println("Captured matFrame Width " + matFrame.width());

    //Save dem pics
    Imgcodecs.imwrite("camera.jpg", matFrame);
    System.out.println("OK");
    //System.exit(0);
    }
}