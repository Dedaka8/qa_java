import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.mockito.Mock;


import java.util.List;

import static org.junit.Assert.assertEquals;

public class CatTest {


   @Mock
   Feline feline;
 //  Predator predator;
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
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");

        //Act
        List<String>  actualResult = cat.getFood();

        //Assert
       assertEquals(expectedResult,actualResult);
    }

}
