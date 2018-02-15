import java.util.*;
import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.*;
public class Employee
	{
		private static int userChoice;
		public static void employ()
			{
				
				
				System.out.println("Hi, here is the stock for us.");
				for(int i=0; i<InventoryMain.store.size();i++)
					{
						System.out.println(InventoryMain.store.get(i).getName()+Games.roster.get(i).getSkus()+Games.roster.get(i).getConsole()+Games.roster.get(i).getWhole()+Games.roster.get(i).getSell());
					}
				
				System.out.println("What do you want to do?");
				System.out.println("1. Buy Stock");
				System.out.println("2. Exit the website");
				Scanner userInput = new Scanner(System.in);
				userChoice = userInput.nextInt();
				if(userChoice==1)
					{
						
					}
				else if(userChoice
						==2)
					{
						System.out.println("Bye bye!!!");
					}
				
			}

	}
