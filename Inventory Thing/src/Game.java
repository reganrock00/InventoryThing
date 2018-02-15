
public class Game
	{
		private String name;
		private String skus;
		private String console;
		private String whole;
		private String sell;
		private String copies;
		public Game(String n, String sk, String c, String w, String s, String co)
		{
			name = n;
			skus = sk;
			console = c;
			whole = w;
			sell = s;
			copies = co;
		}
		public String getCopies()
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
		public String getSkus()
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
		public String getWhole()
			{
				return whole;
			}
		public void setWhole(int whole)
			{
				this.whole = whole;
			}
		public String getSell()
			{
				return sell;
			}
		public void setSell(int sell)
			{
				this.sell = sell;
			}
	}
