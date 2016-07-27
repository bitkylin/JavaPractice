import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class test {

	public test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws FileNotFoundException, IOException {
		IOoperation.copyText(new FileInputStream(args[0]), new FileOutputStream(args[1]));
	}
}
