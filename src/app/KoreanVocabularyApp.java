package app;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import app.entities.Song;
import app.utils.InputUtil;
import app.utils.RetrieveFromStorage;

public class KoreanVocabularyApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			List<String> lyrics = RetrieveFromStorage.getSongLyrics();
			List<String> words = new ArrayList<String>();
			for(int i = 0; i < lyrics.size(); i++) {
				String[] lineWords = lyrics.get(i).split(" ");
				for(String word: lineWords) words.add(word);
			}
			List<String> koreanWords = new ArrayList<String>();
			for(int i = 0; i < words.size(); i++) {
				if((int)words.get(i).charAt(0) > 122) {
					koreanWords.add(words.get(i));
				}
			}
			for(int i = 0; i < koreanWords.size(); i++) {
				if(koreanWords.get(i).charAt(koreanWords.get(i).length() - 1) < 122) {
					koreanWords.remove(i);
					koreanWords.add(i, koreanWords.get(i).substring(0, koreanWords.get(i).length() - 1));
				}
			}
			System.out.println(koreanWords.size());
			Set<String> nonRepeatedWords = new HashSet<String>();
			for(String word: koreanWords) nonRepeatedWords.add(word);
			Map<String, Integer> wordQuantity = new HashMap<String, Integer>();
			for(String key: nonRepeatedWords) {
				int quantity = 0;
				for(String word: koreanWords) {
					if(word.equals(key)) {
						quantity++;
					}
				}
				if(key.length() > 0) {
					wordQuantity.put(key, quantity);
				}
			}
			System.out.println(wordQuantity);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private static void addToSongStorage(Scanner sc) throws IOException {
		Song song = InputUtil.inputSongData(sc);
		//StorageUtil.addToStorage(song);
		System.out.println(song);
	}
}
