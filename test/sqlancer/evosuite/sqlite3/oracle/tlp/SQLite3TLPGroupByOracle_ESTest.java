/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 19:26:04 GMT 2025
 */

package sqlancer.evosuite.sqlite3.oracle.tlp;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import org.junit.jupiter.api.Test;
import sqlancer.sqlite3.oracle.tlp.SQLite3TLPGroupByOracle;
import sqlancer.sqlite3.schema.SQLite3Schema;
import sqlancer.sqlite3.SQLite3GlobalState;

public class SQLite3TLPGroupByOracle_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test0() throws Throwable {
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        SQLite3TLPGroupByOracle sQLite3TLPGroupByOracle0 = new SQLite3TLPGroupByOracle(sQLite3GlobalState0);
        LinkedList<SQLite3Schema.SQLite3Table> linkedList0 = new LinkedList<SQLite3Schema.SQLite3Table>();
        SQLite3Schema.SQLite3Tables sQLite3Schema_SQLite3Tables0 = new SQLite3Schema.SQLite3Tables(linkedList0);
        sQLite3TLPGroupByOracle0.targetTables = sQLite3Schema_SQLite3Tables0;
        // Undeclared exception!
        try {
            sQLite3TLPGroupByOracle0.generateFetchColumns();
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // [] 1
            //
        }
    }

    @Test
    public void test1() throws Throwable {
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        SQLite3TLPGroupByOracle sQLite3TLPGroupByOracle0 = new SQLite3TLPGroupByOracle(sQLite3GlobalState0);
        // Undeclared exception!
        try {
            sQLite3TLPGroupByOracle0.check();
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // null
            //
        }
    }

    @Test
    public void test2() throws Throwable {
        SQLite3TLPGroupByOracle sQLite3TLPGroupByOracle0 = new SQLite3TLPGroupByOracle((SQLite3GlobalState) null);
        // Undeclared exception!
        try {
            sQLite3TLPGroupByOracle0.check();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.sqlite3.oracle.tlp.SQLite3TLPBase", e);
        }
    }

    @Test
    public void test3() throws Throwable {
        SQLite3TLPGroupByOracle sQLite3TLPGroupByOracle0 = new SQLite3TLPGroupByOracle((SQLite3GlobalState) null);
        // Undeclared exception!
        try {
            sQLite3TLPGroupByOracle0.generateFetchColumns();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.sqlite3.oracle.tlp.SQLite3TLPGroupByOracle", e);
        }
    }

    @Test
    public void test4() throws Throwable {
        SQLite3TLPGroupByOracle sQLite3TLPGroupByOracle0 = new SQLite3TLPGroupByOracle((SQLite3GlobalState) null);
        String string0 = sQLite3TLPGroupByOracle0.getLastQueryString();
        assertNull(string0);
    }
}
