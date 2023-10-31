import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParamTest {
    private final String sex;
    private final boolean hasMane;
    public LionParamTest(String sex, boolean hasMane){
        this.sex = sex;
        this.hasMane = hasMane;
    }
    @Parameterized.Parameters()
    public static Object[][] getData(){
        return new Object[][]{
                {"Самец",true},
                {"Самка",false}
        };
    }
    @Mock
    Feline feline;

    @Test
    public void doesHaveManeReturnCorrectValueTest() throws Exception {
        //AAA
        //Arrange
        Lion lion = new Lion(sex,feline);

        //Act
        boolean actualResult = lion.doesHaveMane();

        //Assert
        assertEquals(hasMane,actualResult);

    }
}
