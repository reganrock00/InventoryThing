import java.io.*;
import java.util.ArrayList;

public class InventoryMain
	{
		public static ArrayList <Game> store = new ArrayList <Game>();
		public static void main(String[] args)
			{
				
				store.add(new Game("Monster Hunter: World",  01234, "XBOX",  20, 60));
				store.add(new Game("Fortnite",  01235, "XBOX", 0, 60));
				store.add(new Game("Destiny",  01236, "Playstation",  4, 20));
				store.add(new Game("Hitman",  01237, "PC", 5, 10));
				store.add(new Game("Madden",  01233, "Playstation", 1, 30));
				store.add(new Game("Minecraft",  01232, "PC", 10, 9));
			}

	}