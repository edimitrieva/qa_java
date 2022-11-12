import com.example.Alex;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class TestAlex {

    @Mock
    private Feline feline;

    @Test
    public void checkCountKittensReturnNull () throws Exception {
        Alex alex = new Alex(feline);
        Assert.assertEquals(0,alex.getKittens());
    }

    @Test
    public void checkFriendsAlexReturmListNames() throws Exception {
        Alex alex = new Alex(feline);
        List<String> friends = List.of("Марти", "Глория", "Мелман");
        Assert.assertEquals(friends,alex.getFriends());
    }

    @Test
    public void checkPlaceOfLivingReturnString() throws Exception {
        Alex alex = new Alex(feline);
        Assert.assertEquals("Нью-Йоркский зоопарк",alex.getPlaceOfLiving());
    }
}
