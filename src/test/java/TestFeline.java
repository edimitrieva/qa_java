import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class TestFeline {

    @Spy
    Feline feline;

    @Test
    public void checkGetFamilyReturnKittens (){
        Feline feline = new Feline();
        Assert.assertEquals("Результат равен Кошачьи","Кошачьи",feline.getFamily());
    }

    @Test
    public void checkGetKittensReturnOne (){
        Feline feline = new Feline();
        Assert.assertEquals("Результат равен 1",1,feline.getKittens());
    }

    @Test
    public void checkGetKittensReturnTwo (){
        Feline feline = new Feline();
        Assert.assertEquals("Результат равен 2",2,feline.getKittens(2));
    }

    @Test
    public void checkEatMeatReturnFoodForPredator () throws Exception {
        List listEat = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(listEat);
        Assert.assertEquals("Еда хищника - Животные, Птицы, Рыба", listEat, feline.eatMeat());
    }

}
