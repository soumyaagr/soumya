

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.commons.io.IOUtils;

public class IOUtilCopy {
    public static void main(String args[]) throws FileNotFoundException, IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("C:\\Users\\soumya_agr\\Desktop\\pics\\Untitled.png");
            out = new FileOutputStream("C:\\Users\\soumya_agr\\Desktop\\pics\\copy.png");
            
            IOUtils.copy(in, out);
        }finally {
            if (out != null) {
                out.close();
            }
            if (in != null) {
                in.close();
                
            }
        }
    }
}
