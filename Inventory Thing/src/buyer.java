import java.io.*;
import java.util.*;

public class buyer
	{
		private static boolean stillShopping;
		private static int userChoice;
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
							//createList();
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
							break;
							}
						case 5:
							{
							pay();	
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

	}
