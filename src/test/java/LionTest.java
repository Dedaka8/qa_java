import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void getKittensReturnCorrectValueTest() throws Exception {
        //AAA
        //Arrange
        Lion lion = new Lion("Самец",feline);
        int expectedResult = 1;
       Mockito.when(feline.getKittens()).thenReturn(1);

        //Act
        int actualResult = lion.getKittens();

        //Assert
        assertEquals(expectedResult,actualResult);

    }

    @Test
    public void getFoodReturnCorrectValueTest() throws Exception {
        //AAA
        //Arrange
        Lion lion = new Lion("Самец",feline);
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
          Mockito.when(feline.getFood("Хищник")).thenReturn(expectedResult);

        //Act
        List<String>  actualResult = lion.getFood();

        //Assert
        assertEquals(expectedResult,actualResult);

    }




}
