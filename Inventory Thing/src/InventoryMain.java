import java.io.*;
import java.util.*;

public class InventoryMain
	{
		public static ArrayList <Game> store = new ArrayList <Game>();
		public static void main(String[] args)
			{
				fillArray();
				TextWriter.refresh();
				System.out.println("Are you a buyer or an employee?");
				System.out.println("1) Buyer");
				System.out.println("2) Employee");
				System.out.println();
				try
					{
					Scanner userInput = new Scanner(System.in);
					int userChoice = userInput.nextInt();
					if(userChoice > 2 || userChoice < 1)
						{
						System.out.println("That's not a valid answer.");
						System.out.println();
						InventoryMain.main(args);
						}
					else if(userChoice == 1)
						{
						Buyer.buy();
						}
					else
						{
						//Employee.main(args) throws FileNotFoundException, UnsupportedEncodingException;
						}
					}
				catch(InputMismatchException nice)
					{
						System.out.println("That's not a valid answer.");
						System.out.println();
						InventoryMain.main(args);
					}
			}
		
		public static void fillArray()
			{
				
				store.add(new Game("Monster Hunter",  "01234", "XBOX",  "20", "60", "10"));
				store.add(new Game("Fortnite",  "01235", "XBOX", "0", "60", "10"));
				store.add(new Game("Destiny",  "01236", "Playstation",  "4", "20", "10"));
				store.add(new Game("Hitman",  "01237", "PC", "5", "10", "10"));
				store.add(new Game("Madden",  "01233", "Playstation", "1", "30", "10"));
				store.add(new Game("Minecraft",  "01232", "PC", "10", "9", "10"));
			}

	}