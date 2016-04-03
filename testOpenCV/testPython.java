package testOpenCV;

import java.io.*;

public class testPython {

	public static void main(String[] args) throws IOException {
		//If writing to a file just run Process p line, if printing to console, run all of the following code
		//Runs python script
		Process p = Runtime.getRuntime().exec("python testPy.py");

		//Enables ability to read input (output of script) and errors (if any)
		BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
		BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));

		// read the output from the command and print
		String s = null;
		while ((s = stdInput.readLine()) != null) {
		    System.out.println(s);
		}

		// read any errors from the attempted command and print
		while ((s = stdError.readLine()) != null) {
		    System.out.println(s);
		}
	}
}