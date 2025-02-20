package Demo;

import org.openqa.selenium.edge.*;

 class RunURL {
	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		String GoogleUrl="https://www.google.com/";
		driver.get(GoogleUrl);
		String title =driver.getTitle();//
		System.out.println(title);
		String Url =driver.getCurrentUrl();//Browser Url= getCurrentUrl
		System.out.println(Url);
		if (title.equals("Google")) {
				System.out.println("Match");
	
		}else {
			System.out.println("Not Match");
		}
	}

}
