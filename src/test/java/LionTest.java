import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void doesHaveManeMaleTrueTest() throws Exception {
        Lion lionMale = new Lion("Самец", feline);
        assertTrue(lionMale.doesHaveMane());
    }
    @Test
    public void doesHaveManeFemaleFalseTest() throws Exception {
        Lion lionFemale = new Lion("Самка", feline);
        assertFalse(lionFemale.doesHaveMane());
    }
    @Test
    public void testConstructorWithInvalidSex() throws Exception {
        String sex = "Львица";
        String expectedMessage = "Используйте допустимые значения пола животного - самец или самка";
        try {
            new Lion(sex, feline);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            assertEquals(expectedMessage, e.getMessage());
        }

    }

    @Test
    public void getKittensTest() throws Exception {
        int kittensCount = 1;
        Mockito.when(feline.getKittens()).thenReturn(1);
        Lion lion = new Lion("Самец", feline);
        assertEquals(kittensCount,lion.getKittens());
    }

    @Test
    public void getFoodTest() throws Exception {
        List<String> foodlist = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(foodlist);
        Lion lion = new Lion("Самец", feline);
        assertEquals(foodlist, lion.getFood());
    }

}
