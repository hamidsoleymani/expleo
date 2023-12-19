import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChildLearnsAdditionTest {

    @Test
    public void testChildLearnsAddition(){
       String actual = ChildLearnsAddition.printCodeIfIncorrectAdded(123, 456, 578);
       assertEquals("1", actual);
        actual = ChildLearnsAddition.printCodeIfIncorrectAdded(123, 456, 579);
        assertEquals("ok", actual);
        actual = ChildLearnsAddition.printCodeIfIncorrectAdded(123, 456, 589);
        assertEquals("2", actual);
        actual = ChildLearnsAddition.printCodeIfIncorrectAdded(123, 456, 679);
        assertEquals("3", actual);
        actual = ChildLearnsAddition.printCodeIfIncorrectAdded(23, 456, 479);
        assertEquals("ok", actual);
        actual = ChildLearnsAddition.printCodeIfIncorrectAdded(153, 456, 509);
        assertEquals("3", actual);
        actual = ChildLearnsAddition.printCodeIfIncorrectAdded(153, 457, 510);
        assertEquals("3", actual);
        actual = ChildLearnsAddition.printCodeIfIncorrectAdded(1553, 1457, 2010);
        assertEquals("4", actual);
        actual = ChildLearnsAddition.printCodeIfIncorrectAdded(553, 457, 788);
        assertEquals("1", actual);
        actual = ChildLearnsAddition.printCodeIfIncorrectAdded(553, 457, 910);
        assertEquals("3", actual);
    }

}
