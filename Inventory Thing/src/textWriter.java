import java.io.*;

public class textWriter {
    public static void main(String [] args) {

        // The name of the file to open.
        String fileName = "Inventory.txt";

        try {
            // Assume default encoding.
            FileWriter fileWriter = new FileWriter(fileName);

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Note that write() does not automatically
            // append a newline character.
			bufferedWriter.write("Title:           Skus:           Console:        Wholesale:           Sell:            Copies:");
            bufferedWriter.write(" here is some text.");
            bufferedWriter.newLine();
            bufferedWriter.write("Wasssup");
            bufferedWriter.write(" im very tired.");

            // Always close files.
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println(
                "Error writing to file '"
                + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
    }
}
