/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 12 02:08:05 GMT 2025
 */

package sqlancer.evosuite.common;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.Test;
import sqlancer.common.DBMSCommon;

public class DBMSCommon_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test00() throws Throwable {
        List<String> list0 = List.of("t%d", "t%d", ",3%S", "xxK>[\u0005r", "", "t%d", "xxK>[\u0005r",
                "YR@W{y^-iM*Ml)+!V", "QF70DjA y${C>Spe", "");
        List<String> list1 = List.of("", "QF70DjA y${C>Spe");
        boolean boolean0 = DBMSCommon.areQueryPlanSequencesSimilar(list0, list1);
        assertFalse(boolean0);
    }

    @Test
    public void test01() throws Throwable {
        boolean boolean0 = DBMSCommon.matchesIndexName("i0");
        assertTrue(boolean0);
    }

    @Test
    public void test02() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[2] = 754.9415599961028;
        int int0 = DBMSCommon.getMaxIndexInDoubleArray(doubleArray0);
        assertEquals(2, int0);
    }

    @Test
    public void test03() throws Throwable {
        LinkedList<String> linkedList0 = new LinkedList<String>();
        List<String> list0 = List.of("8(Nw", "8(Nw");
        int int0 = DBMSCommon.editDistance(list0, linkedList0);
        assertEquals(2, int0);
    }

    @Test
    public void test04() throws Throwable {
        // Undeclared exception!
        try {
            DBMSCommon.matchesIndexName((String) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test
    public void test05() throws Throwable {
        // Undeclared exception!
        try {
            DBMSCommon.getMaxIndexInDoubleArray((double[]) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.common.DBMSCommon", e);
        }
    }

    @Test
    public void test06() throws Throwable {
        LinkedList<String> linkedList0 = new LinkedList<String>();
        List<String> list0 = linkedList0.subList(0, 0);
        linkedList0.add("sqlancer.common.DBMSCommon");
        // Undeclared exception!
        try {
            DBMSCommon.editDistance(list0, linkedList0);
            fail("Expecting exception: ConcurrentModificationException");

        } catch (ConcurrentModificationException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("java.util.AbstractList$SubList", e);
        }
    }

    @Test
    public void test07() throws Throwable {
        // Undeclared exception!
        try {
            DBMSCommon.editDistance((List<String>) null, (List<String>) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.common.DBMSCommon", e);
        }
    }

    @Test
    public void test08() throws Throwable {
        // Undeclared exception!
        try {
            DBMSCommon.areQueryPlanSequencesSimilar((List<String>) null, (List<String>) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.common.DBMSCommon", e);
        }
    }

    @Test
    public void test09() throws Throwable {
        List<String> list0 = List.of("pmZBOG6AaPn)G:", "sqlancer.common.DBMSCommon");
        int int0 = DBMSCommon.editDistance(list0, list0);
        assertEquals(0, int0);
    }

    @Test
    public void test10() throws Throwable {
        LinkedList<String> linkedList0 = new LinkedList<String>();
        boolean boolean0 = DBMSCommon.areQueryPlanSequencesSimilar(linkedList0, linkedList0);
        assertTrue(boolean0);
    }

    @Test
    public void test11() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = (double) 2;
        int int0 = DBMSCommon.getMaxIndexInDoubleArray(doubleArray0);
        assertEquals(0, int0);
    }

    @Test
    public void test12() throws Throwable {
        boolean boolean0 = DBMSCommon.matchesIndexName("t-375");
        assertFalse(boolean0);
    }

    @Test
    public void test13() throws Throwable {
        String string0 = DBMSCommon.createIndexName(0);
        assertEquals("i0", string0);
    }

    @Test
    public void test14() throws Throwable {
        String string0 = DBMSCommon.createTableName(0);
        assertEquals("t0", string0);
    }

    @Test
    public void test15() throws Throwable {
        String string0 = DBMSCommon.createColumnName(0);
        assertEquals("c0", string0);
    }
}
