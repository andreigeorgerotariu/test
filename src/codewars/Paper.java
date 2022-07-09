package codewars;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runners.JUnit4;

public class Paper {

    public static int paperWork(int n, int m) {
        if (n <= 0 || m <= 0) {
            return 0;
        } else {
            return n * m;
        }
    }

    @Test
    public void test1(){
        assertEquals("Failed at paperWork(5,5)",25, Paper.paperWork(5,5));
    }

    @Test
    public void test2(){
        assertEquals("Failed at paperWork(5,-5)",0, Paper.paperWork(5,-5));
    }

    @Test
    public void test3(){
        assertEquals("Failed at paperWork(-5,-5)",0, Paper.paperWork(-5,-5));
    }

    @Test
    public void test4(){
        assertEquals("Failed at paperWork(-5,5)",0, Paper.paperWork(-5,5));
    }

    @Test
    public void test5(){
        assertEquals("Failed at paperWork(5,0)",0, Paper.paperWork(5,0));
    }
}