package books;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * TODO : Add your import here
 */
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

public class BookShopTest {

    /**
     * TODO : Put your test here
     */
	BookShop bs = new BookShop("TESTSHOP");

	@Test
	public void discount() {
	    
	    assertAll("books",
	    		() -> {
	    			int[] books = {1};
	    			assertEquals(8, bs.cost(books));
	    		},
	    		() -> {
	    			int[] books = {1, 2};
	    			assertEquals(14.88, bs.cost(books));
	    		},
	    		() -> {
	    			int[] books = {1, 2, 3};
	    			assertEquals(20.64, bs.cost(books));
	    		},
				() -> {
	    			int[] books = {1, 2, 3, 4};
	    			assertEquals(23.04, bs.cost(books));
	    		},
				() -> {
	    			int[] books = {1, 2, 3, 4, 5};
	    			assertEquals(26.0, bs.cost(books));
	    		},
				() -> {
					int[] books = {1, 1, 3, 4, 5};
	    			assertEquals(31.04, bs.cost(books));
				},
				() -> {
					int[] books = {1, 1, 2, 2, 5};
	    			assertEquals(36.64, bs.cost(books));
				}
	    );
	}

    @Test
    public void myFirstTest(){
        assertTrue(true);
    }
}