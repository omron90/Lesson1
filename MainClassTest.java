import org.junit.Test;

import static org.junit.Assert.fail;

public class MainClassTest{
    @Test
    public void testGetClassString(){
        MainClass mainClass = new MainClass();
        String actualResult = mainClass.getClassString();
        boolean containsSubstring = actualResult.toLowerCase().contains("hallo");
        if (!containsSubstring){
            fail("Строка должна содержать подстроку 'hallo' или 'Hallo', но вместо этого получена: " + actualResult);
        }
    }
}