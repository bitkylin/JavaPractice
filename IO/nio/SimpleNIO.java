package nio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;

public class SimpleNIO {

    public static void main(String[] args) throws IOException {

        ReadableByteChannel read = Channels.newChannel(new FileInputStream(args[0]));
        WritableByteChannel write = Channels.newChannel(new FileOutputStream(args[1]));
        dump(read,write);
    }

    private static void dump(ReadableByteChannel readableByteChannel, WritableByteChannel writableByteChannel) throws IOException {
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        try (ReadableByteChannel src = readableByteChannel;WritableByteChannel dest = writableByteChannel){
            while (src.read(buffer)!=-1){
                buffer.flip();
                dest.write(buffer);
                buffer.clear();
            }
        }
    }

}
