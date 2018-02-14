import java.io.*;
import java.util.*;

public class buyer
	{
		private static boolean stillShopping;
		private static int userChoice, pageL, i, listMarker;
		private static ArrayList <Game> shoppingCart = new ArrayList <Game>();
		public static void main(String[] args)
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
							//searchGames();
							break;
							}
						case 4:
							{
							System.out.println("Understandable. Have a great day!");
							stillShopping = false;
							InventoryMain.main(args);
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
			System.out.println("Here is a list of our items:");
			System.out.println();
			int fourth = InventoryMain.store.size() / 4;
			for (i = 0, pageL = 1, listMarker = i; i < InventoryMain.store.size(); i++)
				{
					if(i > 0  && i % fourth == 0)
						{
						addToCartL();
						listMarker = i;
						}
					else
						{
						System.out.println(i + ") " + InventoryMain.store.get(i).getName() + " for the " + InventoryMain.store.get(i).getConsole() + ".");
						}
				}
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
					System.out.println(shoppingCart.get(i));
					System.out.println();
					}
				}
			else
				{
				System.out.println();
				System.out.println("Your shopping cart doesn't contain anything!");
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
				System.out.println("This is the end of page " + pageL + ". Would you like to see more games?");
				System.out.println();
				System.out.println("1) Yes.");
				System.out.println("2) I would like to add a game on this page to my shopping cart.");
				System.out.println("3) No.");
				try
					{
						Scanner userL = new Scanner(System.in);
						int choice = userL.nextInt();
						if(choice > 3 || choice < 0)
							{
							System.out.println("That's not a valid answer!");
							addToCartL();
							}
						else
							{
							switch(choice)
								{
									case 2:
										{
										System.out.println("Which game from this page would you like to purchase?");
										System.out.println();
										//for(int j = i; j < )
										//fix this ^^^
										}
								}
							}
					}
				catch(InputMismatchException catcher)
					{
						System.out.println("That's not a valid answer!");
						addToCartL();
					}
			}

	}
