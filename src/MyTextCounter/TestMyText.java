package MyTextCounter;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestMyText {

    @Test
    public void TestGetTextLine() {

        //Arrange
        CountMyText nrOfLine = new CountMyText();


        //Act
        int actual = nrOfLine.getHowManyLine();


        //Assert
        int expected = 0;

        assertEquals(expected, actual);

    }

    @Test
    public void TestGetNumberOfCharacter() {
        //Arrange
        //CountMyText nrOfLine = new CountMyText();
        CountMyText nrOfCha = new CountMyText();


        //Act

        int actual = nrOfCha.getNrOfCharacter();

        //Assert
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void TestCalcNumberOfCharacter() {
        //Arrange
        //CountMyText nrOfLine = new CountMyText();
        CountMyText nrOfCha = new CountMyText();


        //Act
        nrOfCha.calcCharacter("hej");
        int actual = nrOfCha.getNrOfCharacter();



        //Assert
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void TestCheckIfThereIsStop() {
        //Arrange
        CountMyText text = new CountMyText();
        CountMyText isEnd = new CountMyText();
        CountMyText textStop = new CountMyText();


        //Act

        boolean actual = text.checkIfTextContainsStop("stop");


        //Assert
        boolean expected=true;

        assertEquals(expected, actual);
    }
    @Test
    public void TestIfTextGetStop() {
        //Arrange
        CountMyText text = new CountMyText();
        CountMyText isEnd = new CountMyText();
        CountMyText textStop = new CountMyText();


        //Act

       boolean actual = !text.getShouldStop();


        //Assert
        boolean expected=true;

        assertEquals(expected, actual);
    }



    //containsStop

}


