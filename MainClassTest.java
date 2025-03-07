import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainClassTest{
    @Test
    public void getLocalNumber() {
        //Создаём экземпляр класса MainClass
        MainClass mainClass = new MainClass();
        //Вызываем метод getLocalNumber и сохраняем результат
        int result = mainClass.getLocalNumber();
        //Проверяем, что результат равен 14
        assertEquals(14, result, "Метод getLocalNumber должен возвращать число 14");
    }
}