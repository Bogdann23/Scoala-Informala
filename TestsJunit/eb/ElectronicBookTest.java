package eb;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests of ElectronicBook class.
 */
public class ElectronicBookTest {

    private ElectronicBook electronicBook;
    private String ISBN = "232323";
    private String[] authors = {"author name"};
    private String[] downloadLinks = {"https://thepiratebay.org"};
    private String[] remarksAndNotes = {"reader", "remark"};

    /**
     * Create an ElectronicBook for use in tests.
     */
    @Before
    public void initialize() {
        electronicBook = new ElectronicBook(ISBN, authors, downloadLinks, remarksAndNotes);
    }

    /**
     * Test of getISBN method, of class ElectronicBook.
     */
    @Test
    public void testGetISBN() {
        String result = electronicBook.getISBN();

        assertEquals(ISBN, result);
    }

    /**
     * Test of gettAuthors method, of class ElectronicBook.
     */
    @Test
    public void testGetAuthors() {
        String[] result = electronicBook.getAuthors();

        assertArrayEquals(authors, result);
    }

    /**
     * Test of getGetDownloadLinks method, of class ElectronicBook.
     */
    @Test
    public void testGetDownloadLinks() {
        String[] result = electronicBook.getDownloadLinks();

        assertArrayEquals(downloadLinks, result);
    }

    /**
     * Test of getRemarksAndNotes method, of class ElectronicBook.
     */
    @Test
    public void testGetRemarksAndNotes() {
        String[] result = electronicBook.getRemarksAndNotes();

        assertArrayEquals(remarksAndNotes, result);
    }

    /**
     * Test of setPublisher method, of class ElectronicBook.
     */
    @Test
    public void testSetPublisher() {
        String expResult = "Publisher";
        electronicBook.setPublisher(expResult);
        String result = electronicBook.getPublisher();

        assertEquals(expResult, result);
    }

    /**
     * Test of setPrice method, of class ElectronicBook.
     */
    @Test
    public void testSetPrice() {
        float expResult = 29.99f;
        electronicBook.setPrice(expResult);
        float result = electronicBook.getPrice();

        assertEquals(expResult, result, 0.005);
    }

    /**
     * Test of setElectronicFormat method, of class ElectronicBook.
     */
    @Test
    public void testSetElectronicFormat() {
        ElectronicBook.FormatOfElectronicBook expResult = ElectronicBook.FormatOfElectronicBook.AZW;
        electronicBook.setElectronicFormat(expResult);
        ElectronicBook.FormatOfElectronicBook result = electronicBook.getElectronicFormat();

        assertEquals(expResult, result);
    }

    /**
     * Test of setYearOfPublication method, of class ElectronicBook.
     */
    @Test
    public void testSetYearOfPublication() {
        ElectronicBook.YearOfPublication expResult = ElectronicBook.YearOfPublication.Y2005;
        electronicBook.setYearOfPublication(expResult);
        ElectronicBook.YearOfPublication result = electronicBook.getYearOfPublication();

        assertEquals(expResult, result);
    }

    /**
     * Test of setTitle method, of class ElectronicBook.
     */
    @Test
    public void testSetTitle() {
        String expResult = "Title";
        electronicBook.setTitle(expResult);
        String result = electronicBook.getTitle();

        assertEquals(expResult, result);
    }
}
