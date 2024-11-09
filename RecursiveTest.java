import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RecursiveTest {
    @Test
    public void test1() {
        assertEquals(Main.count8(8), 1);
    }

    @Test
    public void test2() {
        assertEquals(Main.count8(818), 2);
    }

    @Test
    public void test3() {
        assertEquals(Main.count8(818), 3);
    }

    @Test
    public void test4() {
        assertEquals(Main.count8(8818), 4);
    }
    
    @Test
    public void test5() {
        assertEquals(Main.count8(88188), 6);
    }
}
