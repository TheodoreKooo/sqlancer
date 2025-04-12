/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 14:39:18 GMT 2025
 */

package sqlancer.evosuite.tidb.gen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import sqlancer.tidb.gen.TiDBDropTableGenerator;
import sqlancer.tidb.TiDBProvider;

public class TiDBDropTableGenerator_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test0() throws Throwable {
        // Undeclared exception!
        try {
            TiDBDropTableGenerator.dropTable((TiDBProvider.TiDBGlobalState) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.tidb.gen.TiDBDropTableGenerator", e);
        }
    }

    @Test
    public void test1() throws Throwable {
        TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
        // Undeclared exception!
        try {
            TiDBDropTableGenerator.dropTable(tiDBProvider_TiDBGlobalState0);
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // null
            //
        }
    }
}
