import java.text.FieldPosition;
import java.io.*;

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String readFile(String filename) {
		String text = "";
		BufferedReader inputStream = null;

		try {
			inputStream = new BufferedReader(new FileReader(filename));
			String line;

			while ((line = inputStream.readLine()) != null) {
				if (!text.isEmpty()) {
					text += "\n";
				}
				text += line;
			}
		} catch (IOException e) {
		} finally {
			try {
				if (inputStream != null) {
					inputStream.close();
				}
			} catch (IOException e) {
			}
		}
		text = text + "\n";
		return text;
	}

	public static String backwardsReadFile(String filename) {
		String text = "";
		BufferedReader inputStream = null;

		try {
			inputStream = new BufferedReader(new FileReader(filename));
			int c;

			while ((c = inputStream.read()) != -1) {
				text = (char)c + text;
			}
		} catch (IOException e) {
		} finally {
			try {
				if (inputStream != null) {
					inputStream.close();
				}
			} catch (IOException e) {
			}
		}
		return text;
	}
}