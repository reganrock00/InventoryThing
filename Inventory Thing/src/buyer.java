import java.io.*;
import java.util.*;

public class buyer
	{
		private static boolean stillShopping;
		private static int userChoice;
		public static void main(String[] args)
			{
			greetUser();
			while(stillShopping)
				{
					giveOptions();
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
			if(userChoice > 4)
				{
				System.out.println();
				System.out.println("That's not an option!");
				giveOptions();
				}
			}

	}
