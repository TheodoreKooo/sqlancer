/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 12 01:06:06 GMT 2025
 */

package sqlancer.evosuite.yugabyte.ycql;

import static org.junit.jupiter.api.Assertions.*;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;
import sqlancer.yugabyte.ycql.YCQLOptions;
import sqlancer.yugabyte.ycql.YCQLOracleFactory;

public class YCQLOptions_ESTest {

    @Test
    public void test0() throws Throwable {
        YCQLOptions yCQLOptions0 = new YCQLOptions();
        yCQLOptions0.oracles = null;
        yCQLOptions0.getTestOracleFactory();
        assertEquals(1, yCQLOptions0.maxNumDeletes);
        assertEquals(5, yCQLOptions0.maxNumUpdates);
    }

    @Test
    public void test1() throws Throwable {
        YCQLOptions yCQLOptions0 = new YCQLOptions();
        yCQLOptions0.oracles = yCQLOptions0.oracles;
        yCQLOptions0.oracles = yCQLOptions0.oracles;
        LinkedList<YCQLOracleFactory> linkedList0 = new LinkedList<YCQLOracleFactory>();
        yCQLOptions0.oracles = (List<YCQLOracleFactory>) linkedList0;
        yCQLOptions0.getTestOracleFactory();
        assertEquals(1, yCQLOptions0.maxNumDeletes);
        assertEquals(5, yCQLOptions0.maxNumUpdates);
    }

    @Test
    public void test2() throws Throwable {
        YCQLOptions yCQLOptions0 = new YCQLOptions();
        LinkedList<YCQLOracleFactory> linkedList0 = new LinkedList<YCQLOracleFactory>();
        YCQLOracleFactory yCQLOracleFactory0 = YCQLOracleFactory.FUZZER;
        linkedList0.add(yCQLOracleFactory0);
        yCQLOptions0.oracles = (List<YCQLOracleFactory>) linkedList0;
        yCQLOptions0.getTestOracleFactory();
        assertEquals(5, yCQLOptions0.maxNumUpdates);
        assertEquals(1, yCQLOptions0.maxNumDeletes);
    }
}
