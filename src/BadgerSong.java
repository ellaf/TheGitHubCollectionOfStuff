public class BadgerSong {
	public static void main(String[] args) {

		for (int i = 0; i < 2; i++) {
			song();
		}

	}

	private static void song() {
		for (int i = 0; i < 10; i++) {
			speak("Badger!");
		}
		for (int i = 0; i < 3; i++) {
			speak("Mushroom!");
		}
		for (int i = 0; i < 3; i++) {
			speak("Snake!");
		}
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
					e.printStackTrace();
				}
	}

}
