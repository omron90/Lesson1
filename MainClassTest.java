import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainClassTest{
    @Test
    public void testGetClassNumber(){
        MainClass mainClass = new MainClass();
        int actualResult = mainClass.getClassNumber();
        assertTrue(actualResult > 45, "Ожидалось, что значение будет больше 45, но получено: " + actualResult);
    }
}