import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(Parameterized.class)
public class TestLionDoesHaveMane {

    @Mock
    private Feline feline;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    private final String sex;
    private final boolean expected;

    public TestLionDoesHaveMane(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][]{
                {"Самка", false},
                {"Самец", true},
                {"Нет пола", true},
        };
    }

    @Test
    public void checkDoesHaveMane() throws Exception {
        Feline feline = new Feline();
        Exception exception = null;

        try {
            Lion lion = new Lion(sex, feline);
            Assert.assertEquals( expected, lion.doesHaveMane());
        } catch (Exception ex) {
            exception = ex;
            Assert.assertEquals("Используйте допустимые значения пола животного - самей или самка", exception.getMessage());
        }

    }

}
