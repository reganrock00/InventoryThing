import java.util.*;
import java.util.ArrayList;
import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.*;
public class employee
	{

		public static void main(String[] args)
			{
				static ArrayList<Game> stock = new ArrayList<Game>();// stock
				System.out.println("Hi, here is the stock for us.");
				for(int i=0; i<stock.size();i++)
					{
						System.out.println(Games.roster.get(i).getName()+Games.roster.get(i).getSkus()+Games.roster.get(i).getConsole()+Games.roster.get(i).getWhole()+Games.roster.get(i).getSell());
					}
			}

	}
