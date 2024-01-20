import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem2Test {
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
        inputStringBuilder.append("AAABBBCCCCCCC");
        inputStringBuilder.append(System.lineSeparator());
        String str = inputStringBuilder.toString();

        InputStream input = new ByteArrayInputStream(str.getBytes());
        System.setIn(input);

        Problem2.main(null);

        StringBuilder expectStringBuilder = new StringBuilder();
        expectStringBuilder.append("Yes");
        expectStringBuilder.append(System.lineSeparator());

        String expect = expectStringBuilder.toString();

        Assert.assertEquals(expect, stdOut.toString());

    }

    @Test
    public void Test2() throws Exception {

        StringBuilder inputStringBuilder = new StringBuilder();
        inputStringBuilder.append("ACABABCBC");
        inputStringBuilder.append(System.lineSeparator());
        String str = inputStringBuilder.toString();

        InputStream input = new ByteArrayInputStream(str.getBytes());
        System.setIn(input);

        Problem2.main(null);

        StringBuilder expectStringBuilder = new StringBuilder();
        expectStringBuilder.append("No");
        expectStringBuilder.append(System.lineSeparator());

        String expect = expectStringBuilder.toString();

        Assert.assertEquals(expect, stdOut.toString());

    }

    @Test
    public void Test3() throws Exception {

        StringBuilder inputStringBuilder = new StringBuilder();
        inputStringBuilder.append("A");
        inputStringBuilder.append(System.lineSeparator());
        String str = inputStringBuilder.toString();

        InputStream input = new ByteArrayInputStream(str.getBytes());
        System.setIn(input);

        Problem2.main(null);

        StringBuilder expectStringBuilder = new StringBuilder();
        expectStringBuilder.append("Yes");
        expectStringBuilder.append(System.lineSeparator());

        String expect = expectStringBuilder.toString();

        Assert.assertEquals(expect, stdOut.toString());

    }

    @Test
    public void Test4() throws Exception {

        StringBuilder inputStringBuilder = new StringBuilder();
        inputStringBuilder.append("ABBBBBBBBBBBBBCCCCCC");
        inputStringBuilder.append(System.lineSeparator());
        String str = inputStringBuilder.toString();

        InputStream input = new ByteArrayInputStream(str.getBytes());
        System.setIn(input);

        Problem2.main(null);

        StringBuilder expectStringBuilder = new StringBuilder();
        expectStringBuilder.append("Yes");
        expectStringBuilder.append(System.lineSeparator());

        String expect = expectStringBuilder.toString();

        Assert.assertEquals(expect, stdOut.toString());

    }

}
