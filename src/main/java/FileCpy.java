
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//import java.nio.file.Path;

public class FileCpy {
	public static void main(String args[]) throws IOException {
		//String source = "C:/Users/soumya_agr/workspace/abc/src/csv";
		FileReader fr = new FileReader("C:\\Users\\soumya_agr\\Documents\\NetBeansProjects\\abc\\src\\csv");
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter("C:\\Users\\soumya_agr\\Documents\\NetBeansProjects\\abc\\src\\abc\\csv2");
		BufferedWriter bw = new BufferedWriter(fw);
		String line;
		while((line = br.readLine())!=null) {
			bw.write(line);
                        bw.write("\n");
		}
		bw.close();
	}
}
