import com.example.Feline;
import com.example.LionAlex;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionAlexTest {

    @Mock
    Feline feline;

    @Test
    public void getKittensTest() throws Exception {
        int expectedKittensCount = 0;
        LionAlex alex = new LionAlex(feline);
        assertEquals(expectedKittensCount, alex.getKittens());
    }

    @Test
    public void getFriendsTest() throws Exception {
        List<String> expectedList = List.of("зебра Марти", "бегемотиха Глория", "жираф Мелман");
        LionAlex alex = new LionAlex(feline);
        assertEquals(expectedList, alex.getFriends());
    }

    @Test
    public void getPlaceOfLivingTest() throws Exception {
        String expectedPlace = "Нью-Йоркский зоопарк";
        LionAlex alex = new LionAlex(feline);
        assertEquals(expectedPlace, alex.getPlaceOfLiving());
    }
}
