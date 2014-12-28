import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class PropertiesRdr {
    FileReader fr;
    BufferedReader br;
    StringTokenizer st;
    String line;
//    String driver,url,user,password;

    PropertiesRdr() {

        try{
            fr = new FileReader("C:\\Users\\soumya_agr\\workspace\\soumya\\src\\main\\java\\UserPassword");
            br = new BufferedReader(fr);

            line = br.readLine();
            st = new StringTokenizer(line, ",");
               /* String d = st.nextToken();
                static String driver = d;
                url = st.nextToken();
                user = st.nextToken();
                password = st.nextToken();
                */
        } catch (FileNotFoundException e) {
            System.out.println("File not found...");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    String getDriver() {
        return (st.nextToken());
    }

    String getUrl() {
        return (st.nextToken());
    }

    String getUser() {
        return (st.nextToken());
    }

    String getPassword() {
        return (st.nextToken());
    }
}
