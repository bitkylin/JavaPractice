package simpleio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class test {


    public static void main(String[] args) throws IOException {
        IOoperation.copyText(new FileInputStream(args[0]), new FileOutputStream(args[1]));
    }
}
