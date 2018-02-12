
public class Game
	{
		private String name;
		private int skus;
		private String console;
		private int whole;
		private int sell;
		public Game(String n, int sk, String c, int w, int s)
		{
			name = n;
			skus = sk;
			console = c;
			whole = w;
			sell = s;
		}
		public String getName()
			{
				return name;
			}
		public void setName(String name)
			{
				this.name = name;
			}
		public int getSkus()
			{
				return skus;
			}
		public void setSkus(int skus)
			{
				this.skus = skus;
			}
		public String getConsole()
			{
				return console;
			}
		public void setConsole(String console)
			{
				this.console = console;
			}
		public int getWhole()
			{
				return whole;
			}
		public void setWhole(int whole)
			{
				this.whole = whole;
			}
		public int getSell()
			{
				return sell;
			}
		public void setSell(int sell)
			{
				this.sell = sell;
			}
	}
