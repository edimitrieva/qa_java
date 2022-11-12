import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class TestLion {

    @Mock
    private Feline feline;
    @Spy
    private Feline spyFeline;

    @Test
    public void checkGetFoodReturnFoodForPredator () throws Exception {
        Lion lion = new Lion("Самец", feline);
        List listEat = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(listEat);
        Assert.assertEquals("Еда хищника - Животные, Птицы, Рыба", listEat, lion.getFood());
    }

    @Test
    public void checkGetKittensReturnOne () throws Exception {
        Lion lion = new Lion("Самец", spyFeline);
        Mockito.when(spyFeline.getKittens()).thenReturn(1);
        Assert.assertEquals("Результат равен 1",1,lion.getKittens());
    }

}
