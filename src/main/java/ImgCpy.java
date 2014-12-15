

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.imageio.*;
import java.io.InputStream;
import java.io.OutputStream;

public class ImgCpy {

    public static void main(String args[]) throws IOException {
        
        BufferedInputStream in = null;

        BufferedOutputStream out = null;

        try {
            
            in = new BufferedInputStream(new FileInputStream("C:\\Users\\soumya_agr\\Desktop\\pics\\note.png"));
            out = new BufferedOutputStream(new FileOutputStream("C:\\Users\\soumya_agr\\Desktop\\pics\\note1.png"));

            int r;
            while (((r = in.read()) != (-1))) {
                out.write(r);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}