import java.io.*;

public class TextWriter 
{
    public static void refresh() 
    	{
        String fileName = "Inventory.txt";
        try {
            	FileWriter fileWriter = new FileWriter(fileName);
            	BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            	bufferedWriter.write("Inventory");
            	bufferedWriter.newLine();
            	bufferedWriter.newLine();
            	
            	for(int i = 0; i < InventoryMain.store.size(); i++)
            		{
            			bufferedWriter.write("Title:           Skus:           Console:        Wholesale:           Sell:            Copies:");
            			bufferedWriter.newLine();
            			bufferedWriter.write(InventoryMain.store.get(i).getName());
            			bufferedWriter.write("           ");
            			bufferedWriter.write(InventoryMain.store.get(i).getSkus());
            			bufferedWriter.write("           ");
            			bufferedWriter.write(InventoryMain.store.get(i).getConsole());
            			bufferedWriter.write("             ");
            			bufferedWriter.write(InventoryMain.store.get(i).getWhole());
            			bufferedWriter.write("               ");
            			bufferedWriter.write(InventoryMain.store.get(i).getSell());
            			bufferedWriter.write("               ");
            			bufferedWriter.write(InventoryMain.store.get(i).getCopies());
            			bufferedWriter.newLine();
            			bufferedWriter.newLine();
            		}
            	
            	bufferedWriter.close();
        	}
        catch(IOException ex) 
        	{
            System.out.println("Error writing to file '" + fileName + "'");
        	}
    }
}