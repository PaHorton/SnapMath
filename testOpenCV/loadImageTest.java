package testOpenCV;

import org.opencv.core.*;
import org.opencv.imgcodecs.*; // imread, imwrite, etc

public class loadImageTest{
	public static void main(String[] args){
		//Open current OpenCV library (ie version 2.4.4 = opencv_java244, 3.1.0 = opencv_java310 or (see below)
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		//Read image
		Mat m=Imgcodecs.imread("C:\\Users\\C\\Documents\\School\\College\\BeachHacks\\numbersTestImage.png",Imgcodecs.CV_LOAD_IMAGE_COLOR);
		//Load image (by calling LoadImage class)
		new LoadImage("C:\\Users\\C\\Documents\\School\\College\\BeachHacks\\numbersTestImage.png",m);
	}
}