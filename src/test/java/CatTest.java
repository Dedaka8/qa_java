import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {


   @Mock
   Feline feline;

    @Test
    public void getSoundReturnCorrectValueTest(){
        //AAA
        //Arrange
        Cat cat = new Cat(feline);
        String expectedResult = "Мяу";

        //Act
        String actualResult = cat.getSound();

        //Assert
        assertEquals(expectedResult,actualResult);
    }


    @Test
    public void getFoodReturnCorrectValueTest() throws Exception{
        //AAA
        //Arrange

        Cat cat = new Cat(feline);
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(expectedResult);

        //Act
        List<String>  actualResult = cat.getFood();

        //Assert
       assertEquals(expectedResult,actualResult);
    }

}
