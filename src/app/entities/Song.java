package app.entities;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Song{
	private String file;
	private String title;
	private String artist;
	private ArrayList<String> fullText;
	private String[] mostUsedWords;
	
	public Song(String file, String title, String artist, ArrayList<String> fullText) {
		this.file = file;
		this.title = title;
		this.artist = artist;
		this.fullText = fullText;
	}
	
	public String toString() {
		return String.format("Title: %s - Artist: %s", title, artist);
	}
}
