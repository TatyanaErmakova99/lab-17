import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.Files;

public class CopyFile {

    double copy(String src, String dst, int bufSize, Double progress) {

        Path srcpath = null;
        Path dstpath = null;

        try{

            srcpath = Paths.get(src);

            dstpath = Paths.get(dst);

        } 
	catch (InvalidPathException e)

        { 	return 1;
        }

        ByteBuffer buffer = ByteBuffer.allocate(bufSize);

        try(SeekableByteChannel fChan = Files.newByteChannel(srcpath);SeekableByteChannel outfile = Files.newByteChannel(dstpath);){

            while(fChan.read(buffer) != -1) {

                outfile.write(buffer);

            }

        }

        catch (IOException e)

        {  } return 0;

    }

}