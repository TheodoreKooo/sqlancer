/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 15:49:02 GMT 2025
 */

package sqlancer.evosuite.yugabyte.ycql.ast;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import sqlancer.yugabyte.ycql.ast.YCQLBetweenOperation;
import sqlancer.yugabyte.ycql.ast.YCQLExpression;

public class YCQLBetweenOperation_ESTest {

    @Test
    public void test0() throws Throwable {
        YCQLBetweenOperation yCQLBetweenOperation0 = new YCQLBetweenOperation((YCQLExpression) null,
                (YCQLExpression) null, (YCQLExpression) null, true);
        assertTrue(yCQLBetweenOperation0.isTrue());
    }
}
