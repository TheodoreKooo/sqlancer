/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 19:01:25 GMT 2025
 */

package sqlancer.evosuite.yugabyte.ysql;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

import org.junit.jupiter.api.Test;
import sqlancer.common.query.ExpectedErrors;
import sqlancer.yugabyte.ysql.YSQLErrors;

public class YSQLErrors_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test00() throws Throwable {
        // Undeclared exception!
        try {
            YSQLErrors.addViewErrors((ExpectedErrors) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.yugabyte.ysql.YSQLErrors", e);
        }
    }

    @Test
    public void test01() throws Throwable {
        // Undeclared exception!
        try {
            YSQLErrors.addToCharFunctionErrors((ExpectedErrors) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.yugabyte.ysql.YSQLErrors", e);
        }
    }

    @Test
    public void test02() throws Throwable {
        // Undeclared exception!
        try {
            YSQLErrors.addCommonTableErrors((ExpectedErrors) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.yugabyte.ysql.YSQLErrors", e);
        }
    }

    @Test
    public void test03() throws Throwable {
        // Undeclared exception!
        try {
            YSQLErrors.addCommonRegexExpressionErrors((ExpectedErrors) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.yugabyte.ysql.YSQLErrors", e);
        }
    }

    @Test
    public void test04() throws Throwable {
        // Undeclared exception!
        try {
            YSQLErrors.addCommonRangeExpressionErrors((ExpectedErrors) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.yugabyte.ysql.YSQLErrors", e);
        }
    }

    @Test
    public void test05() throws Throwable {
        // Undeclared exception!
        try {
            YSQLErrors.addCommonInsertUpdateErrors((ExpectedErrors) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.yugabyte.ysql.YSQLErrors", e);
        }
    }

    @Test
    public void test06() throws Throwable {
        // Undeclared exception!
        try {
            YSQLErrors.addCommonFetchErrors((ExpectedErrors) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.yugabyte.ysql.YSQLErrors", e);
        }
    }

    @Test
    public void test07() throws Throwable {
        // Undeclared exception!
        try {
            YSQLErrors.addCommonExpressionErrors((ExpectedErrors) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.yugabyte.ysql.YSQLErrors", e);
        }
    }

    @Test
    public void test08() throws Throwable {
        // Undeclared exception!
        try {
            YSQLErrors.addBitStringOperationErrors((ExpectedErrors) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.yugabyte.ysql.YSQLErrors", e);
        }
    }

    @Test
    public void test09() throws Throwable {
        // Undeclared exception!
        try {
            YSQLErrors.addFunctionErrors((ExpectedErrors) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.yugabyte.ysql.YSQLErrors", e);
        }
    }

    @Test
    public void test10() throws Throwable {
        List<String> list0 = YSQLErrors.getCommonTableErrors();
        assertEquals(9, list0.size());
    }

    @Test
    public void test12() throws Throwable {
        List<String> list0 = YSQLErrors.getFunctionErrors();
        assertFalse(list0.isEmpty());
    }

    @Test
    public void test13() throws Throwable {
        List<String> list0 = YSQLErrors.getViewErrors();
        assertEquals(11, list0.size());
    }

    @Test
    public void test16() throws Throwable {
        List<String> list0 = YSQLErrors.getCommonExpressionErrors();
        assertFalse(list0.isEmpty());
    }

    @Test
    public void test17() throws Throwable {
        List<String> list0 = YSQLErrors.getCommonFetchErrors();
        assertFalse(list0.isEmpty());
    }

    @Test
    public void test18() throws Throwable {
        List<String> list0 = YSQLErrors.getCommonRangeExpressionErrors();
        assertFalse(list0.isEmpty());
    }

    @Test
    public void test19() throws Throwable {
        ExpectedErrors expectedErrors0 = new ExpectedErrors();
        YSQLErrors.addGroupingErrors(expectedErrors0);
    }

    @Test
    public void test20() throws Throwable {
        ExpectedErrors expectedErrors0 = new ExpectedErrors();
        YSQLErrors.addCommonRangeExpressionErrors(expectedErrors0);
    }

    @Test
    public void test21() throws Throwable {
        List<String> list0 = YSQLErrors.getGroupingErrors();
        assertEquals(4, list0.size());
    }

    @Test
    public void test22() throws Throwable {
        ExpectedErrors expectedErrors0 = new ExpectedErrors();
        YSQLErrors.addCommonRegexExpressionErrors(expectedErrors0);
    }

    @Test
    public void test23() throws Throwable {
        ExpectedErrors expectedErrors0 = new ExpectedErrors();
        YSQLErrors.addBitStringOperationErrors(expectedErrors0);
    }

    @Test
    public void test24() throws Throwable {
        ExpectedErrors expectedErrors0 = new ExpectedErrors();
        YSQLErrors.addCommonInsertUpdateErrors(expectedErrors0);
    }

    @Test
    public void test25() throws Throwable {
        ExpectedErrors expectedErrors0 = new ExpectedErrors();
        YSQLErrors.addCommonTableErrors(expectedErrors0);
    }

    @Test
    public void test26() throws Throwable {
        ExpectedErrors expectedErrors0 = new ExpectedErrors();
        YSQLErrors.addViewErrors(expectedErrors0);
    }

    @Test
    public void test27() throws Throwable {
        ExpectedErrors expectedErrors0 = new ExpectedErrors();
        YSQLErrors.addCommonExpressionErrors(expectedErrors0);
    }

    @Test
    public void test28() throws Throwable {
        ExpectedErrors expectedErrors0 = new ExpectedErrors();
        YSQLErrors.addCommonFetchErrors(expectedErrors0);
    }

    @Test
    public void test29() throws Throwable {
        ExpectedErrors expectedErrors0 = new ExpectedErrors();
        YSQLErrors.addToCharFunctionErrors(expectedErrors0);
    }
}
