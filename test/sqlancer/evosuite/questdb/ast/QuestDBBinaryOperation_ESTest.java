/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 12 03:14:39 GMT 2025
 */

package sqlancer.evosuite.questdb.ast;

import org.junit.jupiter.api.Test;
import sqlancer.h2.H2ExpressionGenerator;
import sqlancer.questdb.ast.QuestDBBinaryOperation;
import sqlancer.questdb.ast.QuestDBSelect;

public class QuestDBBinaryOperation_ESTest {

    @Test
    public void test0() throws Throwable {
        QuestDBSelect questDBSelect0 = new QuestDBSelect();
        H2ExpressionGenerator.H2BinaryArithmeticOperator h2ExpressionGenerator_H2BinaryArithmeticOperator0 = H2ExpressionGenerator.H2BinaryArithmeticOperator.CONCAT;
        QuestDBBinaryOperation questDBBinaryOperation0 = new QuestDBBinaryOperation(questDBSelect0, questDBSelect0,
                h2ExpressionGenerator_H2BinaryArithmeticOperator0);
    }
}
