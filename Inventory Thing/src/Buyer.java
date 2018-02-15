import java.io.*;
import java.util.*;

public class Buyer
	{
		private static boolean stillShopping;
		private static int userChoice, ok, i, listMarker, pageL;
		private static String keyword;
		private static ArrayList <Game> shoppingCart = new ArrayList <Game>();
		public static void buy()
			{
			greetUser();
			while(stillShopping)
				{
					giveOptions();
					switch(userChoice)
					{
						case 1:
							{
							createList();
							break;
							}
						case 2:
							{
							checkCart();
							break;
							}
						case 3:
							{
							searchGames();
							break;
							}
						case 4:
							{
							System.out.println("Understandable. Have a great day!");
							stillShopping = false;
							//InventoryMain.main(null);
							break;
							}
						case 5:
							{
							pay();
							break;
							}
					}
				}
			}

		private static void greetUser()
			{
			System.out.println("Welcome, valued customer!");
			System.out.println("This is the RetroCade Customer Site, your one stop shop for everything gaming!");
			stillShopping = true;
			}
		
		private static void giveOptions()
			{
			System.out.println();
			System.out.println("Would you like to: ");
			System.out.println();
			System.out.println("1) See a list of the items that we're currently selling.");
			System.out.println("2) Check your shopping cart to see what you're interested in so far.");
			System.out.println("3) Search our inventory to see what games we've got in stock.");
			System.out.println("4) Exit the service now.");
			System.out.println("5) Checkout with your current shopping cart.");
			System.out.println();
			try
				{
					Scanner userInput = new Scanner(System.in);
					userChoice = userInput.nextInt();
				}
			catch(InputMismatchException yes)
				{
				System.out.println();
				System.out.println("That's not an option!");
				giveOptions();
				}
			if(userChoice > 5 || userChoice < 1)
				{
				System.out.println();
				System.out.println("That's not an option!");
				giveOptions();
				}
			}
		
		private static void createList()
			{
			System.out.println();
			System.out.println("Here is a list of our items:");
			System.out.println();
			for (i = 0, ok = 1; i < InventoryMain.store.size(); i++)
				{
						System.out.println(ok + ") " + InventoryMain.store.get(i).getName() + " for the " + InventoryMain.store.get(i).getConsole() + ".");
						ok++;
				}
			System.out.println();
			addToCartL();
			}
		
		private static void checkCart()
			{
			if(shoppingCart.size() > 0)
				{
				System.out.println();
				System.out.println("Currently, your cart contains...");
				for(int i = 0; i < shoppingCart.size(); i++)
					{
					System.out.println();
					System.out.println(InventoryMain.store.get(i).getName() + " for the " + InventoryMain.store.get(i).getConsole() + ".");
					}
				}
			else
				{
				System.out.println();
				System.out.println("Your shopping cart doesn't contain anything!");
				}
			}
		
		private static void searchGames()
			{
			System.out.println("Type in a keyword please.");
			System.out.println();
			try
				{
				Scanner kW = new Scanner(System.in);
				keyword = kW.nextLine();
				System.out.println();
				System.out.println("Let me check if we have that...");
				for(int j = 0, searchIndex = 1; j < InventoryMain.store.size(); j++)
					{
						if(InventoryMain.store.get(j).getName().contains(keyword))
							{
							System.out.println("1) We have " + InventoryMain.store.get(j).getName() + " which matches your search criteria.");
							}
					}
				}
			catch(InputMismatchException s)
				{
				
				}
			}
		
		private static void pay()
			{
			if(shoppingCart.size() > 0)
				{
				
				}
			else
				{
				System.out.println();
				System.out.println("Your shopping cart doesn't contain anything! You can't pay now!");
				}
			}
		private static void addToCartL()
			{
				System.out.println("Which game from this list would you like to add to your shopping cart?");
				System.out.println("Type in the number of the game now.");
				System.out.println("If you don't want to buy a game from this list, just type 0.");
				System.out.println();
				try
					{
						Scanner fred = new Scanner(System.in);
						int choice = fred.nextInt();
						if(choice <= -1)
							{
							System.out.println("That's not a valid answer!");
							System.out.println();
							addToCartL();
							}
						else if(choice == 0)
							{
							System.out.println();
							System.out.println("Okay, I will return you to the main menu.");
							}
						else
							{
							shoppingCart.add(InventoryMain.store.get(choice - 1));
							System.out.println();
							System.out.println("Okay, I will add that to your cart.");
							askIfBuyAgain();
							}
					}
				catch(InputMismatchException catcher)
					{
						System.out.println("That's not a valid answer!");
						System.out.println();
						addToCartL();
					}
				catch(IndexOutOfBoundsException cat)
					{
						System.out.println("That's not a valid answer!");
						System.out.println();
						addToCartL();
					}
			}
		private static void askIfBuyAgain()
			{
				System.out.println("Would you like to add another game from this list?");
				System.out.println("1) Yes.");
				System.out.println("2) No.");
				System.out.println();
				try
					{
						Scanner ohBoy = new Scanner(System.in);
						int yesOrNo = ohBoy.nextInt();
						if(yesOrNo < 1 || yesOrNo > 2)
							{
							System.out.println("That's not a valid answer!");
							System.out.println();
							askIfBuyAgain();
							}
						else if(yesOrNo == 2)
							{
							System.out.println();
							System.out.println("Okay, I will return you to the main menu.");
							}
						else
							{
							createList();
							}
					}
				catch(InputMismatchException x)
					{
					System.out.println("That's not a valid answer!");
					System.out.println();
					askIfBuyAgain();
					}
			}

	}
