
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImgMove {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedInputStream in = null;
        BufferedOutputStream out = null;
        File f = null;
        try {
            f = new File("C:\\Users\\soumya_agr\\Desktop\\pics\\note1.png");
            in = new BufferedInputStream(new FileInputStream("C:\\Users\\soumya_agr\\Desktop\\pics\\note1.png"));
            out = new BufferedOutputStream(new FileOutputStream("D:\\note1.png"));
            int r;
            while ((r = in.read()) != (-1)) {
                out.write(r);

            }

        } finally {
            
            if (out != null) {
                out.close();
            }
            if (in != null) {
                in.close();
                f.delete();
                
            }
//            if(f!=null)
//                f.delete();
        }
    }

}