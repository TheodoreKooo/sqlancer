/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 18:10:01 GMT 2025
 */

package sqlancer.evosuite.yugabyte.ycql.ast;

import sqlancer.yugabyte.ycql.ast.YCQLSelect;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class YCQLSelect_ESTest {

    @Test
    public void test0() throws Throwable {
        YCQLSelect yCQLSelect0 = new YCQLSelect();
        boolean boolean0 = yCQLSelect0.isDistinct();
        assertFalse(boolean0);
    }

    @Test
    public void test1() throws Throwable {
        YCQLSelect yCQLSelect0 = new YCQLSelect();
        yCQLSelect0.setDistinct(true);
        boolean boolean0 = yCQLSelect0.isDistinct();
        assertTrue(boolean0);
    }
}
