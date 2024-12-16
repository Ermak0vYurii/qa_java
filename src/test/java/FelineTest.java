import com.example.Feline;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void getKittensWithArgumentReturnArgumentTest() {
        Feline feline = new Feline();
        int expectedKittenCount = 5;
        int actualKittenCount = feline.getKittens(expectedKittenCount);
        assertEquals(expectedKittenCount, actualKittenCount);
    }

    @Test
    public void getKittensWithoutArgumentReturnOneTest() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }

}
