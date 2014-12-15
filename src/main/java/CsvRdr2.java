

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class CsvRdr2 {

    public static void main(String args[]) throws IOException {
        BufferedReader br;
        try (FileReader fr = new FileReader("C:\\Users\\soumya_agr\\Documents\\NetBeansProjects\\abc\\src\\csv")) {
            br = new BufferedReader(fr);
            String line;
            String l1, l2, l3;
            line = br.readLine();
            StringTokenizer st = new StringTokenizer(line, ",");
            l1 = st.nextToken();
            l2 = st.nextToken();
            l3 = st.nextToken();
            while ((line = br.readLine()) != null) {
                st = new StringTokenizer(line, ",");
                System.out.println(l1 +"-" + st.nextToken());
                System.out.println(l2 + "-" + st.nextToken());
                System.out.println(l3 + "-" + st.nextToken() +"\n");
            }
        }
        
    }

}
