/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 14:11:23 GMT 2025
 */

package sqlancer.evosuite.yugabyte.ycql.ast;

import org.junit.jupiter.api.Test;
import sqlancer.h2.H2ExpressionGenerator;
import sqlancer.yugabyte.ycql.ast.YCQLBinaryOperation;
import sqlancer.yugabyte.ycql.ast.YCQLConstant;

public class YCQLBinaryOperation_ESTest {

    @Test
    public void test0() throws Throwable {
        YCQLConstant.YCQLTextConstant yCQLConstant_YCQLTextConstant0 = new YCQLConstant.YCQLTextConstant("AFX");
        H2ExpressionGenerator.H2BinaryComparisonOperator h2ExpressionGenerator_H2BinaryComparisonOperator0 = H2ExpressionGenerator.H2BinaryComparisonOperator.NOT_EQUALS;
        YCQLBinaryOperation yCQLBinaryOperation0 = new YCQLBinaryOperation(yCQLConstant_YCQLTextConstant0,
                yCQLConstant_YCQLTextConstant0, h2ExpressionGenerator_H2BinaryComparisonOperator0);
    }
}
