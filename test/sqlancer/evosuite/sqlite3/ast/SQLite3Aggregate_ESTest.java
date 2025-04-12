/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 19:51:45 GMT 2025
 */

package sqlancer.evosuite.sqlite3.ast;

import static org.junit.jupiter.api.Assertions.*;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;
import sqlancer.Randomly;
import sqlancer.sqlite3.ast.SQLite3Aggregate;
import sqlancer.sqlite3.ast.SQLite3Constant;
import sqlancer.sqlite3.ast.SQLite3Expression;
import sqlancer.sqlite3.ast.SQLite3WindowFunctionExpression;
import sqlancer.sqlite3.schema.SQLite3DataType;
import sqlancer.sqlite3.SQLite3Provider;

public class SQLite3Aggregate_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test00() throws Throwable {
        LinkedList<SQLite3Expression> linkedList0 = new LinkedList<SQLite3Expression>();
        SQLite3Aggregate.SQLite3AggregateFunction sQLite3Aggregate_SQLite3AggregateFunction0 = SQLite3Aggregate.SQLite3AggregateFunction.GROUP_CONCAT;
        SQLite3Aggregate sQLite3Aggregate0 = new SQLite3Aggregate(linkedList0,
                sQLite3Aggregate_SQLite3AggregateFunction0);
        SQLite3Aggregate.SQLite3AggregateFunction sQLite3Aggregate_SQLite3AggregateFunction1 = sQLite3Aggregate0
                .getFunc();
        assertSame(sQLite3Aggregate_SQLite3AggregateFunction0, sQLite3Aggregate_SQLite3AggregateFunction1);
    }

    @Test
    public void test01() throws Throwable {
        SQLite3Aggregate.SQLite3AggregateFunction sQLite3Aggregate_SQLite3AggregateFunction0 = SQLite3Aggregate.SQLite3AggregateFunction.COUNT_ALL;
        SQLite3Aggregate sQLite3Aggregate0 = new SQLite3Aggregate((List<SQLite3Expression>) null,
                sQLite3Aggregate_SQLite3AggregateFunction0);
        List<SQLite3Expression> list0 = sQLite3Aggregate0.getExpr();
        assertNull(list0);
    }

    @Test
    public void test02() throws Throwable {
        SQLite3Aggregate.SQLite3AggregateFunction sQLite3Aggregate_SQLite3AggregateFunction0 = SQLite3Aggregate.SQLite3AggregateFunction
                .getRandom();
        SQLite3WindowFunctionExpression sQLite3WindowFunctionExpression0 = new SQLite3WindowFunctionExpression(
                (SQLite3Expression) null);
        List<SQLite3Expression> list0 = sQLite3WindowFunctionExpression0.getOrderBy();
        SQLite3Aggregate sQLite3Aggregate0 = new SQLite3Aggregate(list0, sQLite3Aggregate_SQLite3AggregateFunction0);
        List<SQLite3Expression> list1 = sQLite3Aggregate0.getExpr();
        assertSame(list1, list0);
    }

    @Test
    public void test03() throws Throwable {
        SQLite3Expression[] sQLite3ExpressionArray0 = new SQLite3Expression[4];
        List<SQLite3Expression> list0 = Randomly.nonEmptySubset(sQLite3ExpressionArray0);
        SQLite3Aggregate.SQLite3AggregateFunction sQLite3Aggregate_SQLite3AggregateFunction0 = SQLite3Aggregate.SQLite3AggregateFunction.MIN;
        SQLite3Aggregate sQLite3Aggregate0 = new SQLite3Aggregate(list0, sQLite3Aggregate_SQLite3AggregateFunction0);
        List<SQLite3Expression> list1 = sQLite3Aggregate0.getExpr();
        assertFalse(list1.isEmpty());
    }

    @Test
    public void test04() throws Throwable {
        SQLite3Aggregate.SQLite3AggregateFunction sQLite3Aggregate_SQLite3AggregateFunction0 = SQLite3Aggregate.SQLite3AggregateFunction.SUM;
        SQLite3Aggregate sQLite3Aggregate0 = new SQLite3Aggregate((List<SQLite3Expression>) null,
                sQLite3Aggregate_SQLite3AggregateFunction0);
        SQLite3Provider.mustKnowResult = true;
        // Undeclared exception!
        try {
            sQLite3Aggregate0.getExpectedValue();
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test
    public void test05() throws Throwable {
        SQLite3Aggregate.SQLite3AggregateFunction sQLite3Aggregate_SQLite3AggregateFunction0 = SQLite3Aggregate.SQLite3AggregateFunction.SUM;
        SQLite3Aggregate sQLite3Aggregate0 = new SQLite3Aggregate((List<SQLite3Expression>) null,
                sQLite3Aggregate_SQLite3AggregateFunction0);
        SQLite3Constant sQLite3Constant0 = sQLite3Aggregate0.getExpectedValue();
        assertNull(sQLite3Constant0);
    }

    @Test
    public void test06() throws Throwable {
        SQLite3Provider.mustKnowResult = false;
        SQLite3Provider.mustKnowResult = true;
        SQLite3Aggregate.SQLite3AggregateFunction.getRandom();
    }

    @Test
    public void test07() throws Throwable {
        SQLite3Constant.SQLite3NullConstant sQLite3Constant_SQLite3NullConstant0 = new SQLite3Constant.SQLite3NullConstant();
        SQLite3Aggregate.SQLite3AggregateFunction sQLite3Aggregate_SQLite3AggregateFunction0 = SQLite3Aggregate.SQLite3AggregateFunction.TOTAL;
        SQLite3Constant sQLite3Constant0 = sQLite3Aggregate_SQLite3AggregateFunction0
                .apply(sQLite3Constant_SQLite3NullConstant0);
        assertEquals(0.0, sQLite3Constant0.asDouble(), 0.01);
    }

    @Test
    public void test08() throws Throwable {
        SQLite3Aggregate.SQLite3AggregateFunction sQLite3Aggregate_SQLite3AggregateFunction0 = SQLite3Aggregate.SQLite3AggregateFunction.TOTAL;
        SQLite3Constant.SQLite3RealConstant sQLite3Constant_SQLite3RealConstant0 = new SQLite3Constant.SQLite3RealConstant(
                (-492L));
        SQLite3Constant sQLite3Constant0 = sQLite3Aggregate_SQLite3AggregateFunction0
                .apply(sQLite3Constant_SQLite3RealConstant0);
        assertEquals((-492.0), sQLite3Constant0.asDouble(), 0.01);
    }

    @Test
    public void test09() throws Throwable {
        SQLite3Aggregate.SQLite3AggregateFunction sQLite3Aggregate_SQLite3AggregateFunction0 = SQLite3Aggregate.SQLite3AggregateFunction.GROUP_CONCAT;
        SQLite3Provider.mustKnowResult = true;
        SQLite3Constant.SQLite3RealConstant sQLite3Constant_SQLite3RealConstant0 = new SQLite3Constant.SQLite3RealConstant(
                0.0);
        // Undeclared exception!
        try {
            sQLite3Aggregate_SQLite3AggregateFunction0.apply(sQLite3Constant_SQLite3RealConstant0);
            fail("Expecting exception: RuntimeException");

        } catch (RuntimeException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.sqlite3.ast.SQLite3Aggregate$SQLite3AggregateFunction$4", e);
        }
    }

    @Test
    public void test10() throws Throwable {
        SQLite3Aggregate.SQLite3AggregateFunction sQLite3Aggregate_SQLite3AggregateFunction0 = SQLite3Aggregate.SQLite3AggregateFunction.GROUP_CONCAT;
        SQLite3Constant.SQLite3RealConstant sQLite3Constant_SQLite3RealConstant0 = new SQLite3Constant.SQLite3RealConstant(
                0.0);
        SQLite3Constant sQLite3Constant0 = sQLite3Aggregate_SQLite3AggregateFunction0
                .apply(sQLite3Constant_SQLite3RealConstant0);
        assertNull(sQLite3Constant0);
    }

    @Test
    public void test11() throws Throwable {
        SQLite3Aggregate.SQLite3AggregateFunction sQLite3Aggregate_SQLite3AggregateFunction0 = SQLite3Aggregate.SQLite3AggregateFunction.GROUP_CONCAT;
        SQLite3Constant.SQLite3NullConstant sQLite3Constant_SQLite3NullConstant0 = new SQLite3Constant.SQLite3NullConstant();
        SQLite3Constant sQLite3Constant0 = sQLite3Aggregate_SQLite3AggregateFunction0
                .apply(sQLite3Constant_SQLite3NullConstant0);
        assertSame(sQLite3Constant_SQLite3NullConstant0, sQLite3Constant0);
    }

    @Test
    public void test12() throws Throwable {
        SQLite3Aggregate.SQLite3AggregateFunction sQLite3Aggregate_SQLite3AggregateFunction0 = SQLite3Aggregate.SQLite3AggregateFunction.COUNT;
        SQLite3Constant.SQLite3NullConstant sQLite3Constant_SQLite3NullConstant0 = new SQLite3Constant.SQLite3NullConstant();
        SQLite3Constant sQLite3Constant0 = sQLite3Aggregate_SQLite3AggregateFunction0
                .apply(sQLite3Constant_SQLite3NullConstant0);
        assertEquals(0L, sQLite3Constant0.asInt());
    }

    @Test
    public void test13() throws Throwable {
        SQLite3Aggregate.SQLite3AggregateFunction sQLite3Aggregate_SQLite3AggregateFunction0 = SQLite3Aggregate.SQLite3AggregateFunction.COUNT;
        SQLite3Constant.SQLite3RealConstant sQLite3Constant_SQLite3RealConstant0 = new SQLite3Constant.SQLite3RealConstant(
                0.7);
        SQLite3Constant sQLite3Constant0 = sQLite3Aggregate_SQLite3AggregateFunction0
                .apply(sQLite3Constant_SQLite3RealConstant0);
        assertEquals(1L, sQLite3Constant0.asInt());
    }

    @Test
    public void test14() throws Throwable {
        SQLite3Aggregate.SQLite3AggregateFunction sQLite3Aggregate_SQLite3AggregateFunction0 = SQLite3Aggregate.SQLite3AggregateFunction.SUM;
        // Undeclared exception!
        try {
            sQLite3Aggregate_SQLite3AggregateFunction0.apply((SQLite3Constant) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.sqlite3.ast.SQLite3Cast", e);
        }
    }

    @Test
    public void test15() throws Throwable {
        SQLite3Aggregate.SQLite3AggregateFunction sQLite3Aggregate_SQLite3AggregateFunction0 = SQLite3Aggregate.SQLite3AggregateFunction.MIN;
        SQLite3Constant sQLite3Constant0 = SQLite3Constant.createNullConstant();
        SQLite3Constant sQLite3Constant1 = sQLite3Aggregate_SQLite3AggregateFunction0.apply(sQLite3Constant0);
        assertSame(sQLite3Constant0, sQLite3Constant1);
    }

    @Test
    public void test16() throws Throwable {
        SQLite3Aggregate.SQLite3AggregateFunction sQLite3Aggregate_SQLite3AggregateFunction0 = SQLite3Aggregate.SQLite3AggregateFunction.MAX;
        SQLite3Constant sQLite3Constant0 = sQLite3Aggregate_SQLite3AggregateFunction0.apply((SQLite3Constant) null);
        assertNull(sQLite3Constant0);
    }

    @Test
    public void test17() throws Throwable {
        SQLite3Aggregate.SQLite3AggregateFunction sQLite3Aggregate_SQLite3AggregateFunction0 = SQLite3Aggregate.SQLite3AggregateFunction.COUNT_ALL;
        SQLite3Constant sQLite3Constant0 = sQLite3Aggregate_SQLite3AggregateFunction0.apply((SQLite3Constant) null);
        assertEquals(1L, sQLite3Constant0.asInt());
    }

    @Test
    public void test18() throws Throwable {
        SQLite3Aggregate.SQLite3AggregateFunction sQLite3Aggregate_SQLite3AggregateFunction0 = SQLite3Aggregate.SQLite3AggregateFunction
                .getRandom();
        // Undeclared exception!
        try {
            sQLite3Aggregate_SQLite3AggregateFunction0.apply((SQLite3Constant) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.sqlite3.ast.SQLite3Cast", e);
        }
    }

    @Test
    public void test19() throws Throwable {
        SQLite3DataType sQLite3DataType0 = SQLite3DataType.INT;
        SQLite3Aggregate.SQLite3AggregateFunction.getRandom(sQLite3DataType0);
    }

    @Test
    public void test20() throws Throwable {
        SQLite3Aggregate sQLite3Aggregate0 = new SQLite3Aggregate((List<SQLite3Expression>) null,
                (SQLite3Aggregate.SQLite3AggregateFunction) null);
        sQLite3Aggregate0.getFunc();
    }

    @Test
    public void test21() throws Throwable {
        SQLite3Aggregate.SQLite3AggregateFunction sQLite3Aggregate_SQLite3AggregateFunction0 = SQLite3Aggregate.SQLite3AggregateFunction.COUNT;
        SQLite3Expression[] sQLite3ExpressionArray0 = new SQLite3Expression[2];
        List<SQLite3Expression> list0 = Randomly.nonEmptySubset(sQLite3ExpressionArray0);
        SQLite3Aggregate sQLite3Aggregate0 = new SQLite3Aggregate(list0, sQLite3Aggregate_SQLite3AggregateFunction0);
        sQLite3Aggregate0.getExplicitCollateSequence();
    }
}
