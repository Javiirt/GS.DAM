import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class PersonaTest {
    
    public PersonaTest() {
    }
    @Test
    public void testIsMayorDeEdad() {
        System.out.println("isMayorDeEdad");
        Persona instance = new Persona(18);
        boolean expResult = true;
        boolean result = instance.isMayorDeEdad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}