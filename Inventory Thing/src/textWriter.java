import java.io.*;

public class textWriter 
{
    public static void main(String [] args) 
    	{
        String fileName = "Inventory.txt";
        try {
            	FileWriter fileWriter = new FileWriter(fileName);
            	BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            	bufferedWriter.write("Inventory");
            	bufferedWriter.newLine();
            	bufferedWriter.newLine();
            	bufferedWriter.write("Title:           Skus:           Console:        Wholesale:           Sell:            Copies:");
            	bufferedWriter.newLine();
            	bufferedWriter.write("Wasssup");
            	bufferedWriter.write(" im very tired.");
            	bufferedWriter.close();
        	}
        catch(IOException ex) 
        	{
            System.out.println("Error writing to file '" + fileName + "'");
        	}
    }
}