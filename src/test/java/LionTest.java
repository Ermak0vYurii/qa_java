import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

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
        assertThrows(Exception.class, () -> new Lion(sex, feline));
    }

    @Test
    public void getKittensTest(){

    }

}
