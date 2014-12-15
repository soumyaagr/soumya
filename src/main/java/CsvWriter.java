import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CsvWriter {
    public static void main(String args[]) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\soumya_agr\\Documents\\NetBeansProjects\\abc\\src\\abc\\csv2");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("soumya");
        bw.close();
    }
}

   
