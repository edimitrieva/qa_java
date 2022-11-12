import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class TestCat {

    @Mock
    private Feline feline;

    @Test
    public void checkGetSoundReturnMeow (){
        Cat cat = new Cat(feline);
        Assert.assertEquals("Результат равен Мяу", "Мяу", cat.getSound());
    }

    @Test
    public void checkGetFoodReturnFoodForPredator () throws Exception {
        Cat cat = new Cat(feline);
        List listEat = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(listEat);
        Assert.assertEquals("Еда хищника - Животные, Птицы, Рыба", listEat, cat.getFood());
    }

}
