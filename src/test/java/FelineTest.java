import com.example.Feline;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void getKittensWithArgumentReturnArgumentTest() {
        Feline feline = new Feline();
        assertEquals(5, feline.getKittens(5));
    }

    @Test
    public void getKittensWithoutArgumentReturnOneTest() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }

}
