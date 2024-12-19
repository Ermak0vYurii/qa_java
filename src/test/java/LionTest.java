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
    public void constructorWithInvalidSexTest() throws Exception {
        String invalidSex = "Львица";
        String expectedMessage = "Используйте допустимые значения пола животного - самец или самка";
        assertThrows(Exception.class, () -> new Lion(invalidSex, feline));

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
