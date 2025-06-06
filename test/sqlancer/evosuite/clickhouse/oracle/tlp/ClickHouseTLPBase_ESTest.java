/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 12 03:32:25 GMT 2025
 */

package sqlancer.evosuite.clickhouse.oracle.tlp;

import static org.junit.jupiter.api.Assertions.*;
import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.Test;
import sqlancer.clickhouse.ast.ClickHouseAliasOperation;
import sqlancer.clickhouse.ast.ClickHouseColumnReference;
import sqlancer.clickhouse.ast.ClickHouseExpression;
import sqlancer.clickhouse.ast.constant.ClickHouseUInt8Constant;
import sqlancer.clickhouse.ClickHouseProvider;
import sqlancer.clickhouse.oracle.tlp.ClickHouseTLPBase;
import sqlancer.common.gen.ExpressionGenerator;

public class ClickHouseTLPBase_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test0() throws Throwable {
        ClickHouseProvider.ClickHouseGlobalState clickHouseProvider_ClickHouseGlobalState0 = new ClickHouseProvider.ClickHouseGlobalState();
        ClickHouseTLPBase clickHouseTLPBase0 = new ClickHouseTLPBase(clickHouseProvider_ClickHouseGlobalState0);
        LinkedList<ClickHouseColumnReference> linkedList0 = new LinkedList<ClickHouseColumnReference>();
        List<ClickHouseExpression> list0 = clickHouseTLPBase0.generateFetchColumns(linkedList0);
        assertTrue(list0.isEmpty());
    }

    @Test
    public void test1() throws Throwable {
        ClickHouseProvider.ClickHouseGlobalState clickHouseProvider_ClickHouseGlobalState0 = new ClickHouseProvider.ClickHouseGlobalState();
        ClickHouseTLPBase clickHouseTLPBase0 = new ClickHouseTLPBase(clickHouseProvider_ClickHouseGlobalState0);
        LinkedList<ClickHouseColumnReference> linkedList0 = new LinkedList<ClickHouseColumnReference>();
        ClickHouseUInt8Constant clickHouseUInt8Constant0 = new ClickHouseUInt8Constant(183);
        ClickHouseAliasOperation clickHouseAliasOperation0 = new ClickHouseAliasOperation(clickHouseUInt8Constant0,
                "CONCAT");
        ClickHouseColumnReference clickHouseColumnReference0 = new ClickHouseColumnReference(clickHouseAliasOperation0);
        linkedList0.add(clickHouseColumnReference0);
        clickHouseTLPBase0.generateFetchColumns(linkedList0);
    }

    @Test
    public void test2() throws Throwable {
        ClickHouseTLPBase clickHouseTLPBase0 = new ClickHouseTLPBase((ClickHouseProvider.ClickHouseGlobalState) null);
        // Undeclared exception!
        try {
            clickHouseTLPBase0.check();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.clickhouse.oracle.tlp.ClickHouseTLPBase", e);
        }
    }

    @Test
    public void test3() throws Throwable {
        ClickHouseProvider.ClickHouseGlobalState clickHouseProvider_ClickHouseGlobalState0 = new ClickHouseProvider.ClickHouseGlobalState();
        ClickHouseTLPBase clickHouseTLPBase0 = new ClickHouseTLPBase(clickHouseProvider_ClickHouseGlobalState0);
        // Undeclared exception!
        try {
            clickHouseTLPBase0.check();
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // null
            //
        }
    }

    @Test
    public void test4() throws Throwable {
        ClickHouseProvider.ClickHouseGlobalState clickHouseProvider_ClickHouseGlobalState0 = new ClickHouseProvider.ClickHouseGlobalState();
        ClickHouseTLPBase clickHouseTLPBase0 = new ClickHouseTLPBase(clickHouseProvider_ClickHouseGlobalState0);
        ExpressionGenerator<ClickHouseExpression> expressionGenerator0 = clickHouseTLPBase0.getGen();
        assertNull(expressionGenerator0);
    }

    @Test
    public void test5() throws Throwable {
        ClickHouseTLPBase clickHouseTLPBase0 = new ClickHouseTLPBase((ClickHouseProvider.ClickHouseGlobalState) null);
        // Undeclared exception!
        try {
            clickHouseTLPBase0.generateFetchColumns((List<ClickHouseColumnReference>) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.clickhouse.oracle.tlp.ClickHouseTLPBase", e);
        }
    }
}
