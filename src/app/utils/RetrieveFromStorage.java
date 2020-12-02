package app.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RetrieveFromStorage {
	public static List<String> getSongLyrics() throws FileNotFoundException{
		Scanner filesc = new Scanner(new File("Fire.txt"));	
		List<String> lyrics = new ArrayList<String>();
		while(filesc.hasNextLine()) {
			lyrics.add(filesc.nextLine());
		}	
		filesc.close();
		return lyrics;
	}
}
