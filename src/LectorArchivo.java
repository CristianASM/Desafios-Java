import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class LectorArchivo {
    public static void main(String[] args) {
        String inputFile = "Reader/input.txt";
        String outputFile = "Reader/output.txt";

        try {
            FileReader fileReader = new FileReader(inputFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            int wordCount = 0;
            String line;

            while((line = bufferedReader.readLine()) != null){
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
            bufferedReader.close();

            FileWriter fileWriter = new FileWriter(outputFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("Total de palabras: " + wordCount);
            bufferedWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
