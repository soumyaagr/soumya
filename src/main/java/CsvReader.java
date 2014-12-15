import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class CsvReader {
    public static void main(String args[]) throws IOException {
	FileReader fr = new FileReader("C:\\Users\\soumya_agr\\Documents\\NetBeansProjects\\abc\\src\\csv");
	BufferedReader br = new BufferedReader(fr);
	String line;
	while((line = br.readLine())!=null) {
        	StringTokenizer st = new StringTokenizer(line, ",");
		String a = st.nextToken();
		System.out.println("name=" + a);
		System.out.println("age=" + st.nextToken());
		System.out.println("address=" + st.nextToken());
			
		}
	}

}
