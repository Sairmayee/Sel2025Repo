package week1.day2;

public class Browser {
	String launchBrowser(String browserName) {
		System.out.println("Browser launched successfully");
		return browserName;
	}
	
	void loadUrl() {
		System.out.println("Application url loaded successfully");
	}
	
	void edgeBrowser() {
		Browser baction = new Browser();
		String bname = baction.launchBrowser("Edge");
		baction.loadUrl();
		System.out.println("Browser Name: "+bname);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser baction = new Browser();
		String bname = baction.launchBrowser("Chrome");
		baction.loadUrl();
		System.out.println("Browser Name: "+bname);
		System.out.println("-----Edge-----");
		baction.edgeBrowser();
	}
}
