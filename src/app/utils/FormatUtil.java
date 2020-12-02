package app.utils;

public class FormatUtil {
	public static String songTitleFormat(String songTitle) {
		String[] words = songTitle.split(" ");
		String formattedTitle = "";
		for(int i = 0; i < words.length; i++) {
			words[i] = words[i].toLowerCase();
			formattedTitle += " ";
			formattedTitle += words[i];
		}
		return formattedTitle.trim();
	}
	
	public static String nameFormat(String name) {
		String[] words = name.split(" ");
		String formattedName = "";
		for(int i = 0; i < words.length; i++) {
			char firstLetter = Character.toUpperCase(words[i].charAt(0));
			String rest = words[i].substring(1).toLowerCase();
			words[i] = firstLetter + rest;
			formattedName += " ";
			formattedName += words[i];
		}
		return formattedName.trim();
	}
	
	public static String firstWordUppercase(String title) {
		char firstLetter = Character.toUpperCase(title.charAt(0));
		String rest = title.substring(1).toLowerCase();
		return firstLetter + rest;
	}
}
