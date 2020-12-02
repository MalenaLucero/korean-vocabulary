package app.utils;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import app.entities.Song;

public class InputUtil {
	public static Song inputSongData(Scanner sc) throws FileNotFoundException {
		String songTitle = null;
		String artist = null;
		String fileName = null;
		songTitle = FormatUtil.songTitleFormat(inputString("Song title: ", sc));
		artist = FormatUtil.nameFormat(inputString("Artist: ", sc));
		fileName = String.format("%s - %s.txt", artist, songTitle);
		System.out.println("Lyrics:");
		ArrayList<String> lyrics = new ArrayList<String>();
		while(sc.hasNextLine()) {
			lyrics.add(sc.nextLine());
		}
		return new Song(fileName, songTitle, artist, lyrics);
	}
	
	public static String inputString(String message, Scanner sc) {
		System.out.println(message);
		return sc.nextLine();
	}
}
