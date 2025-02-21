import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class PruebaPrimoTest {
    
    public PruebaPrimoTest() {
    }

    @Test
    public void testEsPrimo() {
        System.out.println("esPrimo");
        String numero = "13";
        PruebaPrimo instance = new PruebaPrimo();
        boolean expResult = true;
        boolean result = instance.esPrimo(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

