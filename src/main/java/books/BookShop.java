package books;

public class BookShop {

    private final String name;

    /**
     * Constructor of the class Book shop
     * @param name name of the book shop
     */
    public BookShop(String name){
        this.name = name;
    }

    /**
     * method to compute the cost of a basket
     * @param books array corresponding to the number of each harry potter book the client desire to buy (books.length should return 5)
     * @return the cost in euro with the discount
     */
    public double cost(int[] books){
        //TODO complete
    	double total = 0;
    	int[] differentBooks = {0,0,0,0,0};
    	
    	if(books.length == 1) {
    		return 8.0;
    	}else if(books.length > 1) {
    		for(int i = 0; i < books.length; i++) {
    	    	int duplicates = 0;

    			for(int j = 0; j < differentBooks.length; j++) {
        			if(books[i] == differentBooks[j]) {
        				duplicates++;
        			}
        		}

    			if(duplicates == 0 && books[i] != 0) {
    				differentBooks[i] = books[i];
    				books[i] = 0;
    			}
    		}
    		
    		for(int i = 0; i < books.length; i++) {
    			if(differentBooks[i] != 0) {
    				total += 8;
    			}
    		}

    		if(total == 2*8) {	
    			total = total - (total*7/100);
    		}else if(total == 3*8) {
    			total = total - (total*14/100);
    		}else if(total == 4*8) {
    			total = total - (total*28/100);
    		}else if(total == 5*8) {
    			total = total - (total*35/100);
    		}
    		
    		for(int i = 0; i < books.length; i++) {
    			if(books[i] != 0) {
    				total += 8;
    			}
    		}
    		
    	}
    	
        return Math.round(total * 100.0) / 100.0;
    }
}
