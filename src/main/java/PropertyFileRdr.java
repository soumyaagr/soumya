import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class PropertyFileRdr {
    static String user, url, password;
    void getProp() throws IOException {
        Properties prop = new Properties();
        FileInputStream fin = null;
        try {
            fin = new FileInputStream("C:\\Users\\soumya_agr\\workspace\\soumya\\src\\main\\java\\jdbc.properties");
            prop.load(fin);

            user = prop.getProperty("jdbc.user");
            url = prop.getProperty("jdbc.url");
            password = prop.getProperty("jdbc.password");

        } catch (FileNotFoundException e) {
            System.out.println("no such file exist");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fin != null) {
                fin.close();
            }
        }

    }



}
