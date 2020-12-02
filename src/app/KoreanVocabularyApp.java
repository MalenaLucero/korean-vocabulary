package app;

import java.io.IOException;
import java.util.Scanner;

import app.entities.Song;
import app.utils.InputUtil;

public class KoreanVocabularyApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			addToSongStorage(sc);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void addToSongStorage(Scanner sc) throws IOException {
		Song song = InputUtil.inputSongData(sc);
		//StorageUtil.addToStorage(song);
		System.out.println(song);
	}
}
