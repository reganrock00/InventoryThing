import java.util.*;
import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.*;
public class employee
	{
		static ArrayList<Game> stock = new ArrayList<Game>();// stock
		private static int userChoice;
		public static void main(String[] args)
			{
				
				Scanner file = new Scanner(new File("HereItIs.txt"));
				while(file.hasNextLine())
					{
						String list =file.nextLine();
						String [] reallist= list.split(" ");
						stock.add(new Game(reallist[0],reallist[1],reallist[2],reallist[3],reallist[4],reallist[5],reallist[6]));
					} 
				
				System.out.println("Hi, here is the stock for us.");
				for(int i=0; i<stock.size();i++)
					{
						System.out.println(Games.roster.get(i).getName()+Games.roster.get(i).getSkus()+Games.roster.get(i).getConsole()+Games.roster.get(i).getWhole()+Games.roster.get(i).getSell());
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
