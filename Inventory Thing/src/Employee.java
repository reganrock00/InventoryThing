import java.util.*;
import java.io.*;
import java.text.*;
public class Employee
	{
		private static int userChoice;
		private static int buyingstockChoice;
		private static int stockCopies;
		private static int password;
		private static boolean keepAsking=true;
		
		public static void employ() throws FileNotFoundException, UnsupportedEncodingException 
		{

			meetTheUser();
		}

		public static void meetTheUser()throws FileNotFoundException, UnsupportedEncodingException
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
						meetTheUser();
					}
		}
		public static void askUserWhatToDo() throws FileNotFoundException, UnsupportedEncodingException
		{
			
			System.out.println("Hi, here is the stock for us.");
			for(int i=0; i<InventoryMain.store.size();i++)
				{
					System.out.println(InventoryMain.store.get(i).getName()+" "+InventoryMain.store.get(i).getSkus()+" "+InventoryMain.store.get(i).getConsole()+" "+InventoryMain.store.get(i).getWhole()+" "+InventoryMain.store.get(i).getSell() +" "+ InventoryMain.store.get(i).getCopies());
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
			for(int i=0; i<InventoryMain.store.size();i++)
				{
					System.out.println(i+" "+ InventoryMain.store.get(i).getName());
				}
			Scanner userInput2 = new Scanner(System.in);
			buyingstockChoice= userInput2.nextInt();
			
			System.out.println("How many copies do you want.");
			Scanner userInput3 = new Scanner(System.in);
			stockCopies= userInput3.nextInt();
			int oldCopies=Integer.parseInt(InventoryMain.store.get(buyingstockChoice).getCopies());
			String newCopies=String.valueOf(oldCopies+stockCopies);
			InventoryMain.store.get(buyingstockChoice).setCopies(newCopies);
			System.out.println("You just change the copies to "+newCopies);
			try 
				{ 
					PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("Inventory.txt", true)));
					out.println("");
					out.println(InventoryMain.store.get(buyingstockChoice).getName()+" change the numbers of copies to "+newCopies);
					out.close();
				}
		  catch (IOException e) 
				{  
					println(e);
				}
			askUserWhatToDo();

		
		
			
	
			}

		private static void println(IOException e) {
			// TODO Auto-generated method stub
			
		}
		}

