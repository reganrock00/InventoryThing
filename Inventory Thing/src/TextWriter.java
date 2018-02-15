import java.io.*;

public class TextWriter 
{
    public static void refresh() 
    	{
        String fileName = "Inventory.txt";
        try {
            	FileWriter fileWriter = new FileWriter(fileName);
            	BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            	FileOutputStream pout = new FileOutputStream(fileName);
            	bufferedWriter.write("Inventory");
            	bufferedWriter.newLine();
            	bufferedWriter.newLine();
            	bufferedWriter.write("Title:           Skus:           Console:        Wholesale:           Sell:            Copies:");
            	bufferedWriter.newLine();
            	for(int i = 0; i < InventoryMain.store.size(); i++)
            		{
            			
            			bufferedWriter.write(InventoryMain.store.get(i).getName());
            			bufferedWriter.write("        ");
            			pout.write(InventoryMain.store.get(i).getSkus());
            			bufferedWriter.write("        ");
            			bufferedWriter.write(InventoryMain.store.get(i).getConsole());
            			bufferedWriter.write("        ");
            			pout.write(InventoryMain.store.get(i).getWhole());
            			bufferedWriter.write("        ");
            			pout.write(InventoryMain.store.get(i).getSell());
            			bufferedWriter.write("        ");
            			pout.write(InventoryMain.store.get(i).getCopies());
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