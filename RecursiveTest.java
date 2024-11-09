//Jasmin Cervantes
//Date: 11.08.2024
//Recursion and JUnit Assignment
//Purposely made one test for each method wrong to make sure it was working correctly

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
        assertEquals(Main.count8(8818), 4);
    }

    @Test
    public void test4() {
        assertEquals(Main.count8(88188), 6);
    }
    
    @Test
    public void test5() {
        assertEquals(Main.count8(818), 3);
    }

    @Test
    public void test6() {
        assertEquals(Main.countHi("xxhixx"), 1);
    }

    @Test
    public void test7() {
        assertEquals(Main.countHi("xhixhix"), 2);
    }

    @Test
    public void test8() {
        assertEquals(Main.countHi("hi"), 1);
    }

    @Test
    public void test9() {
        assertEquals(Main.countHi("bhi"), 1);
    }

    @Test
    public void test10() {
        assertEquals(Main.countHi("hicih"), 2);
    }

    @Test
    public void test11() {
        assertEquals(Main.countHi2("ahixhi"), 1);
    }

    @Test
    public void test12() {
        assertEquals(Main.countHi2("ahibhi"), 2);
    }

    @Test
    public void test13() {
        assertEquals(Main.countHi2("hixhi"), 1);
    }

    @Test
    public void test14() {
        assertEquals(Main.countHi2("xhixhi"), 0);
    }

    @Test
    public void test15() {
        assertEquals(Main.countHi2("xhixhi"), 2);
    }

    @Test
    public void test16() {
        assertEquals(Main.strCount("catcowcat", "cat"), 2);
    }

    @Test
    public void test17() {
        assertEquals(Main.strCount("catcowcat", "cow"), 1);
    }

    @Test
    public void test18() {
        assertEquals(Main.strCount("catcowcat", "dog"), 0);
    }

    @Test
    public void test19() {
        assertEquals(Main.strCount("batballbat", "bat"), 2);
    }

    @Test
    public void test20() {
        assertEquals(Main.strCount("batballbat", "bats"), 2);
    }

    @Test
    public void test21() {
        assertEquals(Main.stringClean("yyzzza"), "yza");
    }

    @Test
    public void test22() {
        assertEquals(Main.stringClean("abbbcdd"), "abcd");
    }

    @Test
    public void test23() {
        assertEquals(Main.stringClean("Hello"), "Helo");
    }

    @Test
    public void test24() {
        assertEquals(Main.stringClean("Pallet"), "Palet");
    }

    @Test
    public void test25() {
        assertEquals(Main.stringClean("ball"), "ball");
    }
}
