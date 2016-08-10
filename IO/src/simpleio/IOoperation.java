package simpleio;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOoperation {

	public static void copyText(InputStream src, OutputStream dest) throws IOException {
		try (InputStream input = src; OutputStream output = dest) {
			byte[] data = new byte[1024];
			int length;
			while ((length = input.read(data)) != -1) {
				output.write(data, 0, length);
			}
		}
	}
}
