/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 12 03:33:35 GMT 2025
 */

package sqlancer.evosuite.materialize.gen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import sqlancer.materialize.gen.MaterializeIndexGenerator;
import sqlancer.materialize.MaterializeGlobalState;

public class MaterializeIndexGenerator_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test0() throws Throwable {
        // Undeclared exception!
        try {
            MaterializeIndexGenerator.generate((MaterializeGlobalState) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.materialize.gen.MaterializeIndexGenerator", e);
        }
    }

    @Test
    public void test1() throws Throwable {
        MaterializeGlobalState materializeGlobalState0 = new MaterializeGlobalState();
        // Undeclared exception!
        try {
            MaterializeIndexGenerator.generate(materializeGlobalState0);
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // null
            //
        }
    }
}
