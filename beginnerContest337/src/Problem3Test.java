import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem3Test {
    private ByteArrayOutputStream stdOut = new ByteArrayOutputStream();
    private ByteArrayOutputStream errOut = new ByteArrayOutputStream();

    @Before
    public void before() {
        System.setOut(new PrintStream(stdOut));
        System.setErr(new PrintStream(errOut));
    }

    @After
    public void after() {
        System.setIn(null);
        System.setOut(null);
    }

    @Test
    public void Test1() throws Exception {

        StringBuilder inputStringBuilder = new StringBuilder();
        inputStringBuilder.append("6");
        inputStringBuilder.append(System.lineSeparator());
        inputStringBuilder.append("4 1 -1 5 3 2");
        inputStringBuilder.append(System.lineSeparator());
        String str = inputStringBuilder.toString();

        InputStream input = new ByteArrayInputStream(str.getBytes());
        System.setIn(input);

        Problem3.main(null);

        StringBuilder expectStringBuilder = new StringBuilder();
        expectStringBuilder.append("3 5 4 1 2 6");
        expectStringBuilder.append(System.lineSeparator());

        String expect = expectStringBuilder.toString();

        Assert.assertEquals(expect, stdOut.toString());

    }

    @Test
    public void Test2() throws Exception {

        StringBuilder inputStringBuilder = new StringBuilder();
        inputStringBuilder.append("10");
        inputStringBuilder.append(System.lineSeparator());
        inputStringBuilder.append("-1 1 2 3 4 5 6 7 8 9");
        inputStringBuilder.append(System.lineSeparator());
        String str = inputStringBuilder.toString();

        InputStream input = new ByteArrayInputStream(str.getBytes());
        System.setIn(input);

        Problem3.main(null);

        StringBuilder expectStringBuilder = new StringBuilder();
        expectStringBuilder.append("1 2 3 4 5 6 7 8 9 10");
        expectStringBuilder.append(System.lineSeparator());

        String expect = expectStringBuilder.toString();

        Assert.assertEquals(expect, stdOut.toString());

    }

    @Test
    public void Test3() throws Exception {

        StringBuilder inputStringBuilder = new StringBuilder();
        inputStringBuilder.append("30");
        inputStringBuilder.append(System.lineSeparator());
        inputStringBuilder.append("3 25 20 6 18 12 26 1 29 -1 21 17 23 9 8 30 10 15 22 27 4 13 5 11 16 24 28 2 19 7");
        inputStringBuilder.append(System.lineSeparator());
        String str = inputStringBuilder.toString();

        InputStream input = new ByteArrayInputStream(str.getBytes());
        System.setIn(input);

        Problem3.main(null);

        StringBuilder expectStringBuilder = new StringBuilder();
        expectStringBuilder.append("10 17 12 6 4 21 11 24 26 7 30 16 25 2 28 27 20 3 1 8 15 18 5 23 13 22 19 29 9 14");
        expectStringBuilder.append(System.lineSeparator());

        String expect = expectStringBuilder.toString();

        Assert.assertEquals(expect, stdOut.toString());

    }
}
