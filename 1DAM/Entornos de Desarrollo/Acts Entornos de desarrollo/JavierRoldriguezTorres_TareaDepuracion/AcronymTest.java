import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class AcronymTest {
    
    public AcronymTest() {
    }

    @Test
    public void testNewAcronym() {
        System.out.println("newAcronym");
        Acronym instance = new Acronym("Objeto Volador No Identificado");
        String expResult = "OVNI";
        String result = instance.get();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}