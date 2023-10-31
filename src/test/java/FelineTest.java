import com.example.Feline;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void getFamilyReturnCorrectValueTest(){
        //AAA
        //Arrange
        Feline feline = new Feline();
        String expectedResult = "Кошачьи";

        //Act
        String actualResult = feline.getFamily();

        //Assert
        assertEquals(expectedResult,actualResult);

    }


    @Test
    public void getKittensWithoutParametersReturnCorrectValueTest(){
        //AAA
        //Arrange
        Feline feline = new Feline();
        int expectedResult = 1;

        //Act
        int actualResult = feline.getKittens();

        //Assert
        assertEquals(expectedResult,actualResult);

    }
    @Test
    public void getKittensWithParametersReturnCorrectValueTest(){
        //AAA
        //Arrange
        Feline feline = new Feline();
        int expectedResult = 2;

        //Act
        int actualResult = feline.getKittens(2);

        //Assert
        assertEquals(expectedResult,actualResult);

    }

    @Test
    public void eatMeatReturnCorrectValueTest() throws Exception {
        //AAA
        //Arrange
        Feline feline = new Feline();
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");

        //Act
        List<String>  actualResult = feline.eatMeat();

        //Assert
        assertEquals(expectedResult,actualResult);

    }



}
