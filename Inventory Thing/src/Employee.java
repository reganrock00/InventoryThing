import java.util.*;
import java.io.*;
import java.text.*;
public class Employee
	{
		private static int userChoice;
		
		private static int password;
		private static boolean keepAsking=true;
		
		public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException 
		{
			InventoryMain.fillArray();
			meetTHeUsers();
			
			
		}

		public static void meetTHeUsers()throws FileNotFoundException, UnsupportedEncodingException
		{
			System.out.println("what is the password");
				Scanner userInput = new Scanner(System.in);
				password=userInput.nextInt();
				if(password==1234568)
					{
						askUserWhatToDo();
					}
				else
					{
						System.out.println("Wrong, try it again");
						meetTHeUsers();
					}
		}
		public static void askUserWhatToDo() throws FileNotFoundException, UnsupportedEncodingException
		{
			System.out.println("Hi, here is the stock for us.");
			for(int i=0; i<InventoryMain.store.size();i++)
				{
					System.out.println(InventoryMain.store.get(i).getName()+" "+InventoryMain.store.get(i).getSkus()+" "+InventoryMain.store.get(i).getConsole()+" "+InventoryMain.store.get(i).getWhole()+" "+InventoryMain.store.get(i).getSell());
				}
			
			System.out.println("What do you want to do?");
			System.out.println("1. Buy Stock");
			System.out.println("2. Exit the website");
			while(keepAsking) 
				{
					
					Scanner userInput1 = new Scanner(System.in);
					userChoice = userInput1.nextInt();
					if(userChoice==1)
						{
							buyStock();
							break;
						}
					else if(userChoice==2)
						{
							System.out.println("Bye bye!!!");
							break;
						}
					else
						{
							System.out.println("Try it again");
						}
				}
		}
		private static void buyStock() throws FileNotFoundException, UnsupportedEncodingException
			{
				System.out.println("What stock do you want to buy?");
				
				
				try 
					{ 
						PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("Inventory.txt", true)));
						out.println("");
						out.println("the text");
						out.close();
					}
			  catch (IOException e) 
					{  
						println(e);
					}
					}
			private static void println(IOException e)
				{
					System.out.println("oops,there is a mistake.");
				}
	
	}
