
public class Game
	{
		private String name;
		private int skus;
		private String console;
		private int whole;
		private int sell;
		private int copies;
		public Game(String n, int sk, String c, int w, int s, int co)
		{
			name = n;
			skus = sk;
			console = c;
			whole = w;
			sell = s;
			copies = co;
		}
		public int getCopies()
			{
				return copies;
			}
		public void setCopies(int copies)
			{
				this.copies = copies;
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
