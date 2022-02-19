package tests;

import com.company.homework4.Operations;
import com.company.homework4.Parser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class ParserTests {
    private Parser parser;

    @Before
    public void setUp() {
        parser = new Parser();
    }

    @Test
    public void shouldReturnPlusOperation() {
        String op = "+";
        Operations result = parser.parseUserResponse(op);

        Assert.assertEquals(Operations.Plus, result);
    }

    @Test
    public void shouldReturnMinusOperation() {
        String op = "-";
        Operations result = parser.parseUserResponse(op);

        Assert.assertEquals(Operations.Minus, result);
    }

    @Test
    public void shouldReturnMultiplyOperation() {
        String op = "*";
        Operations result = parser.parseUserResponse(op);

        Assert.assertEquals(Operations.Multiply, result);
    }

    @Test
    public void shouldReturnDivideOperation() {
        String op = "/";
        Operations result = parser.parseUserResponse(op);

        Assert.assertEquals(Operations.Divide, result);
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenOpIsNotSupported() {
        String op = "asd";
        Assert.assertThrows(IllegalArgumentException.class, () -> parser.parseUserResponse(op));
    }
}
