import com.example.Feline;
import org.junit.Test;


import java.util.List;

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

    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        String expectedFamily = "Кошачьи";
        assertEquals(expectedFamily, feline.getFamily());
    }

    @Test
    public void eatMeatTest() throws Exception {
        List<String> foodlist = List.of("Животные", "Птицы", "Рыба");
        Feline feline = new Feline();
        assertEquals(foodlist, feline.eatMeat());
    }



}
