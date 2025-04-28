package week1.day2;

public class EdgeBrowser {
				
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Browser baction = new Browser();
			String bname = baction.launchBrowser("Edge");
			baction.loadUrl();
			System.out.println("Browser Name: "+bname);
			
			
		}
	}

