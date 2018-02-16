import java.io.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Buyer
	{
		private static boolean stillShopping;
		private static int userChoice, ok, i, listMarker, pageL;
		private static String keyword;
		private static ArrayList <Game> shoppingCart = new ArrayList <Game>();
		private static ArrayList <Game> searcher = new ArrayList<Game>();
		public static void buy() throws FileNotFoundException, UnsupportedEncodingException
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
							System.out.println();
							stillShopping = false;
							InventoryMain.runProgram();
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
					System.out.println(shoppingCart.get(i).getName() + " for the " + shoppingCart.get(i).getConsole() + ".");
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
				keyword = kW.nextLine().toLowerCase();
				System.out.println();
				System.out.println("Let me check if we have that...");
				for(int j = 0, searchIndex = 1; j < InventoryMain.store.size(); j++)
					{
						if(InventoryMain.store.get(j).getName().toLowerCase().contains(keyword))
							{
							searcher.add(InventoryMain.store.get(j));
							}
					}
				}
			catch(InputMismatchException s)
				{
					System.out.println("That's not a valid answer!");
					System.out.println();
					searchGames();
				}
			if(searcher.size() == 0)
				{
				System.out.println("Sorry, we couldn't find anything that matches your search criteria.");
				}
			else
				{
				System.out.println();
				System.out.println("Here's what I found:");
				System.out.println();
				for(int j = 0, searchIn = 1; j < searcher.size(); j++, searchIn++)
					{
					System.out.println(searchIn + ") " + searcher.get(j).getName());
					}
				System.out.println();
				System.out.println("Would you like to add any of these to your cart?");
				addToCartS();
				}
			}

		private static void pay() throws FileNotFoundException, UnsupportedEncodingException
			{
			if(shoppingCart.size() > 0)
				{
				int total = 0;
				for(int j = 0; j < shoppingCart.size(); j++)
					{
					total += Integer.parseInt(InventoryMain.store.get(j).getSell());
					}
				System.out.println("Okay, your total will be: $" + total + ".");
				System.out.println();
				System.out.println("Your payment is being processed.");
				System.out.println();
				for(int j = 0; j < 5; j++)
					{
					System.out.print(". ");
					try 
						{
						TimeUnit.SECONDS.sleep(1);
						} 
					catch (InterruptedException e) 
						{
						e.printStackTrace();
						}
					}
				System.out.println();
				System.out.println();
				System.out.println("Your payment was approved! Have a nice day!");
				System.out.println();
				stillShopping = false;
				InventoryMain.runProgram();
				for(int j = 0; j < shoppingCart.size(); j++)
					{
					String temp = InventoryMain.store.get(j).getCopies();
					int temp2 = Integer.parseInt(temp);
					temp2--;
					temp += temp2;
					InventoryMain.store.get(j).setCopies(temp);
					}
				TextWriter.refresh();
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
							askIfBuyAgainL();
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
		
		private static void addToCartS()
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
						addToCartS();
						}
					else if(choice == 0)
						{
						System.out.println();
						System.out.println("Okay, I will return you to the main menu.");
						}
					else
						{
						shoppingCart.add(searcher.get(choice - 1));
						System.out.println();
						System.out.println("Okay, I will add that to your cart.");
						askIfBuyAgainS();
						}
				}
			catch(InputMismatchException catcher)
				{
					System.out.println("That's not a valid answer!");
					System.out.println();
					addToCartS();
				}
			catch(IndexOutOfBoundsException cat)
				{
					System.out.println("That's not a valid answer!");
					System.out.println();
					addToCartS();
				}
				
			}

		private static void askIfBuyAgainL()
			{
				System.out.println("Would you like to add another game from this list?");
				System.out.println("1) Yes.");
				System.out.println("2) No.");
				System.out.println();
				try
					{
						Scanner userChoice = new Scanner(System.in);
						int yesOrNo = userChoice.nextInt();
						if(yesOrNo < 1 || yesOrNo > 2)
							{
							System.out.println("That's not a valid answer!");
							System.out.println();
							askIfBuyAgainL();
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
					askIfBuyAgainL();
					}
			}
		private static void askIfBuyAgainS() 
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
						askIfBuyAgainS();
						}
					else if(yesOrNo == 2)
						{
						System.out.println();
						System.out.println("Okay, I will return you to the main menu.");
						}
					else
						{
						addToCartS();
						}
				}
			catch(InputMismatchException x)
				{
				System.out.println("That's not a valid answer!");
				System.out.println();
				askIfBuyAgainS();
				}
		}

	}
