package books;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookShop bs = new BookShop("TEST");
		
		int[] i = {1,1,3,3,5};
		
		System.out.println(bs.cost(i));
	}
} 
