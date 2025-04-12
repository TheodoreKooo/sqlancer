/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 20:16:57 GMT 2025
 */

package sqlancer.evosuite;

import sqlancer.MainOptions;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MainOptions_ESTest {

    @Test
    public void test00() throws Throwable {
        MainOptions mainOptions0 = MainOptions.DEFAULT_OPTIONS;
        boolean boolean0 = mainOptions0.logExecutionTime();
        assertTrue(boolean0);
    }

    @Test
    public void test01() throws Throwable {
        MainOptions mainOptions0 = MainOptions.DEFAULT_OPTIONS;
        boolean boolean0 = mainOptions0.printSucceedingStatements();
        assertFalse(boolean0);
    }

    @Test
    public void test02() throws Throwable {
        MainOptions mainOptions0 = MainOptions.DEFAULT_OPTIONS;
        boolean boolean0 = mainOptions0.printAllStatements();
        assertFalse(boolean0);
    }

    @Test
    public void test03() throws Throwable {
        MainOptions mainOptions0 = MainOptions.DEFAULT_OPTIONS;
        boolean boolean0 = mainOptions0.useReducer();
        assertFalse(boolean0);
    }

    @Test
    public void test04() throws Throwable {
        MainOptions mainOptions0 = MainOptions.DEFAULT_OPTIONS;
        boolean boolean0 = mainOptions0.isDefaultUsername();
        assertTrue(boolean0);
    }

    @Test
    public void test05() throws Throwable {
        MainOptions mainOptions0 = MainOptions.DEFAULT_OPTIONS;
        boolean boolean0 = mainOptions0.isHelp();
        assertFalse(boolean0);
    }

    @Test
    public void test06() throws Throwable {
        MainOptions mainOptions0 = new MainOptions();
        boolean boolean0 = mainOptions0.performConnectionTest();
        assertEquals(16, mainOptions0.getNumberConcurrentThreads());
        assertEquals(100, mainOptions0.getConstantCacheSize());
        assertTrue(boolean0);
        assertEquals((-1), mainOptions0.getErrorExitCode());
        assertEquals("sqlancer", mainOptions0.getPassword());
        assertEquals(1000, mainOptions0.getNrStatementRetryCount());
        assertEquals(3, mainOptions0.getMaxExpressionDepth());
        assertEquals((-1), mainOptions0.getMaxGeneratedDatabases());
        assertTrue(mainOptions0.printProgressInformation());
        assertTrue(mainOptions0.logEachSelect());
        assertEquals(10, mainOptions0.getMaxStringConstantLength());
        assertEquals((-1L), mainOptions0.getRandomSeed());
        assertEquals(100000, mainOptions0.getNrQueries());
        assertTrue(mainOptions0.loggerPrintFailed());
        assertEquals(30, mainOptions0.getMaxNumberInserts());
        assertEquals((-1), mainOptions0.getPort());
        assertTrue(mainOptions0.useConstantCaching());
        assertEquals("sqlancer", mainOptions0.getUserName());
        assertEquals(100, mainOptions0.getTotalNumberTries());
        assertEquals((-1), mainOptions0.getTimeoutSeconds());
    }

    @Test
    public void test07() throws Throwable {
        MainOptions mainOptions0 = new MainOptions();
        double double0 = mainOptions0.getQPGk();
        assertEquals(10, mainOptions0.getMaxStringConstantLength());
        assertTrue(mainOptions0.logEachSelect());
        assertEquals("sqlancer", mainOptions0.getPassword());
        assertEquals(1000, mainOptions0.getNrStatementRetryCount());
        assertEquals(100000, mainOptions0.getNrQueries());
        assertEquals("sqlancer", mainOptions0.getUserName());
        assertEquals(100, mainOptions0.getTotalNumberTries());
        assertEquals(0.25, double0, 0.01);
        assertEquals((-1), mainOptions0.getPort());
        assertEquals((-1), mainOptions0.getErrorExitCode());
        assertTrue(mainOptions0.printProgressInformation());
        assertTrue(mainOptions0.useConstantCaching());
        assertEquals(3, mainOptions0.getMaxExpressionDepth());
        assertEquals((-1), mainOptions0.getTimeoutSeconds());
        assertEquals((-1), mainOptions0.getMaxGeneratedDatabases());
        assertEquals((-1L), mainOptions0.getRandomSeed());
        assertEquals(100, mainOptions0.getConstantCacheSize());
        assertEquals(30, mainOptions0.getMaxNumberInserts());
        assertEquals(16, mainOptions0.getNumberConcurrentThreads());
        assertTrue(mainOptions0.loggerPrintFailed());
        assertTrue(mainOptions0.performConnectionTest());
    }

    @Test
    public void test08() throws Throwable {
        MainOptions mainOptions0 = MainOptions.DEFAULT_OPTIONS;
        String string0 = mainOptions0.getHost();
        assertNull(string0);
    }

    @Test
    public void test09() throws Throwable {
        MainOptions mainOptions0 = new MainOptions();
        boolean boolean0 = mainOptions0.printProgressInformation();
        assertTrue(mainOptions0.loggerPrintFailed());
        assertEquals(1000, mainOptions0.getNrStatementRetryCount());
        assertEquals((-1L), mainOptions0.getRandomSeed());
        assertEquals("sqlancer", mainOptions0.getPassword());
        assertEquals(3, mainOptions0.getMaxExpressionDepth());
        assertEquals(30, mainOptions0.getMaxNumberInserts());
        assertEquals((-1), mainOptions0.getMaxGeneratedDatabases());
        assertEquals(100, mainOptions0.getConstantCacheSize());
        assertEquals(16, mainOptions0.getNumberConcurrentThreads());
        assertTrue(mainOptions0.performConnectionTest());
        assertEquals("sqlancer", mainOptions0.getUserName());
        assertEquals((-1), mainOptions0.getTimeoutSeconds());
        assertTrue(mainOptions0.useConstantCaching());
        assertTrue(boolean0);
        assertEquals(100000, mainOptions0.getNrQueries());
        assertEquals(10, mainOptions0.getMaxStringConstantLength());
        assertEquals((-1), mainOptions0.getErrorExitCode());
        assertEquals(100, mainOptions0.getTotalNumberTries());
        assertEquals((-1), mainOptions0.getPort());
        assertTrue(mainOptions0.logEachSelect());
    }

    @Test
    public void test10() throws Throwable {
        MainOptions mainOptions0 = MainOptions.DEFAULT_OPTIONS;
        double double0 = mainOptions0.getQPGProbability();
        assertEquals(0.7, double0, 0.01);
    }

    @Test
    public void test11() throws Throwable {
        MainOptions mainOptions0 = MainOptions.DEFAULT_OPTIONS;
        long long0 = mainOptions0.getRandomSeed();
        assertEquals((-1L), long0);
    }

    @Test
    public void test12() throws Throwable {
        MainOptions mainOptions0 = new MainOptions();
        mainOptions0.getDatabasePrefix();
        assertEquals(100, mainOptions0.getConstantCacheSize());
        assertEquals(100, mainOptions0.getTotalNumberTries());
        assertEquals("sqlancer", mainOptions0.getUserName());
        assertTrue(mainOptions0.performConnectionTest());
        assertEquals(16, mainOptions0.getNumberConcurrentThreads());
        assertEquals(30, mainOptions0.getMaxNumberInserts());
        assertEquals((-1), mainOptions0.getTimeoutSeconds());
        assertEquals((-1L), mainOptions0.getRandomSeed());
        assertTrue(mainOptions0.useConstantCaching());
        assertTrue(mainOptions0.loggerPrintFailed());
        assertEquals((-1), mainOptions0.getMaxGeneratedDatabases());
        assertTrue(mainOptions0.logEachSelect());
        assertTrue(mainOptions0.printProgressInformation());
        assertEquals((-1), mainOptions0.getPort());
        assertEquals((-1), mainOptions0.getErrorExitCode());
        assertEquals("sqlancer", mainOptions0.getPassword());
        assertEquals(3, mainOptions0.getMaxExpressionDepth());
        assertEquals(10, mainOptions0.getMaxStringConstantLength());
        assertEquals(1000, mainOptions0.getNrStatementRetryCount());
        assertEquals(100000, mainOptions0.getNrQueries());
    }

    @Test
    public void test13() throws Throwable {
        MainOptions mainOptions0 = MainOptions.DEFAULT_OPTIONS;
        boolean boolean0 = mainOptions0.testOnlyWithMoreThanZeroRows();
        assertFalse(boolean0);
    }

    @Test
    public void test14() throws Throwable {
        MainOptions mainOptions0 = MainOptions.DEFAULT_OPTIONS;
        int int0 = mainOptions0.getNrStatementRetryCount();
        assertEquals(1000, int0);
    }

    @Test
    public void test15() throws Throwable {
        MainOptions mainOptions0 = new MainOptions();
        String string0 = mainOptions0.getPassword();
        assertEquals(16, mainOptions0.getNumberConcurrentThreads());
        assertEquals((-1), mainOptions0.getTimeoutSeconds());
        assertTrue(mainOptions0.performConnectionTest());
        assertEquals(100, mainOptions0.getTotalNumberTries());
        assertEquals(3, mainOptions0.getMaxExpressionDepth());
        assertEquals("sqlancer", mainOptions0.getUserName());
        assertEquals(100, mainOptions0.getConstantCacheSize());
        assertEquals(100000, mainOptions0.getNrQueries());
        assertEquals((-1), mainOptions0.getMaxGeneratedDatabases());
        assertEquals((-1), mainOptions0.getErrorExitCode());
        assertEquals("sqlancer", string0);
        assertEquals(10, mainOptions0.getMaxStringConstantLength());
        assertTrue(mainOptions0.printProgressInformation());
        assertTrue(mainOptions0.logEachSelect());
        assertEquals(1000, mainOptions0.getNrStatementRetryCount());
        assertEquals((-1), mainOptions0.getPort());
        assertEquals(30, mainOptions0.getMaxNumberInserts());
        assertEquals((-1L), mainOptions0.getRandomSeed());
        assertTrue(mainOptions0.loggerPrintFailed());
        assertTrue(mainOptions0.useConstantCaching());
    }

    @Test
    public void test16() throws Throwable {
        MainOptions mainOptions0 = MainOptions.DEFAULT_OPTIONS;
        boolean boolean0 = mainOptions0.canonicalizeSqlString();
        assertTrue(boolean0);
    }

    @Test
    public void test17() throws Throwable {
        MainOptions mainOptions0 = MainOptions.DEFAULT_OPTIONS;
        boolean boolean0 = mainOptions0.printProgressSummary();
        assertFalse(boolean0);
    }

    @Test
    public void test18() throws Throwable {
        MainOptions mainOptions0 = new MainOptions();
        mainOptions0.enableQPG();
        assertEquals((-1L), mainOptions0.getRandomSeed());
        assertTrue(mainOptions0.loggerPrintFailed());
        assertEquals(100000, mainOptions0.getNrQueries());
        assertEquals((-1), mainOptions0.getPort());
        assertTrue(mainOptions0.logEachSelect());
        assertTrue(mainOptions0.printProgressInformation());
        assertEquals(3, mainOptions0.getMaxExpressionDepth());
        assertEquals(10, mainOptions0.getMaxStringConstantLength());
        assertEquals((-1), mainOptions0.getErrorExitCode());
        assertEquals((-1), mainOptions0.getMaxGeneratedDatabases());
        assertEquals(1000, mainOptions0.getNrStatementRetryCount());
        assertEquals("sqlancer", mainOptions0.getPassword());
        assertEquals(100, mainOptions0.getConstantCacheSize());
        assertTrue(mainOptions0.performConnectionTest());
        assertEquals(100, mainOptions0.getTotalNumberTries());
        assertEquals("sqlancer", mainOptions0.getUserName());
        assertEquals(16, mainOptions0.getNumberConcurrentThreads());
        assertEquals(30, mainOptions0.getMaxNumberInserts());
        assertEquals((-1), mainOptions0.getTimeoutSeconds());
        assertTrue(mainOptions0.useConstantCaching());
    }

    @Test
    public void test19() throws Throwable {
        MainOptions mainOptions0 = new MainOptions();
        int int0 = mainOptions0.getTotalNumberTries();
        assertTrue(mainOptions0.loggerPrintFailed());
        assertEquals((-1L), mainOptions0.getRandomSeed());
        assertTrue(mainOptions0.logEachSelect());
        assertEquals(100000, mainOptions0.getNrQueries());
        assertTrue(mainOptions0.printProgressInformation());
        assertEquals((-1), mainOptions0.getPort());
        assertTrue(mainOptions0.useConstantCaching());
        assertEquals(30, mainOptions0.getMaxNumberInserts());
        assertEquals((-1), mainOptions0.getTimeoutSeconds());
        assertEquals(100, mainOptions0.getConstantCacheSize());
        assertEquals("sqlancer", mainOptions0.getUserName());
        assertEquals(100, int0);
        assertEquals(16, mainOptions0.getNumberConcurrentThreads());
        assertTrue(mainOptions0.performConnectionTest());
        assertEquals(3, mainOptions0.getMaxExpressionDepth());
        assertEquals((-1), mainOptions0.getErrorExitCode());
        assertEquals("sqlancer", mainOptions0.getPassword());
        assertEquals(10, mainOptions0.getMaxStringConstantLength());
        assertEquals((-1), mainOptions0.getMaxGeneratedDatabases());
        assertEquals(1000, mainOptions0.getNrStatementRetryCount());
    }

    @Test
    public void test20() throws Throwable {
        MainOptions mainOptions0 = MainOptions.DEFAULT_OPTIONS;
        int int0 = mainOptions0.getQPGMaxMutationInterval();
        assertEquals(1000, int0);
    }

    @Test
    public void test21() throws Throwable {
        MainOptions mainOptions0 = MainOptions.DEFAULT_OPTIONS;
        boolean boolean0 = mainOptions0.logEachSelect();
        assertTrue(boolean0);
    }

    @Test
    public void test22() throws Throwable {
        MainOptions mainOptions0 = MainOptions.DEFAULT_OPTIONS;
        boolean boolean0 = mainOptions0.DEFAULT_OPTIONS.isDefaultPassword();
        assertTrue(boolean0);
    }

    @Test
    public void test23() throws Throwable {
        MainOptions mainOptions0 = new MainOptions();
        int int0 = mainOptions0.getMaxStringConstantLength();
        assertEquals((-1), mainOptions0.getErrorExitCode());
        assertEquals(3, mainOptions0.getMaxExpressionDepth());
        assertEquals(100000, mainOptions0.getNrQueries());
        assertEquals(16, mainOptions0.getNumberConcurrentThreads());
        assertEquals(100, mainOptions0.getConstantCacheSize());
        assertEquals((-1), mainOptions0.getMaxGeneratedDatabases());
        assertEquals(1000, mainOptions0.getNrStatementRetryCount());
        assertEquals((-1), mainOptions0.getPort());
        assertEquals("sqlancer", mainOptions0.getPassword());
        assertEquals(30, mainOptions0.getMaxNumberInserts());
        assertTrue(mainOptions0.printProgressInformation());
        assertEquals(10, int0);
        assertTrue(mainOptions0.logEachSelect());
        assertTrue(mainOptions0.performConnectionTest());
        assertEquals((-1L), mainOptions0.getRandomSeed());
        assertEquals("sqlancer", mainOptions0.getUserName());
        assertTrue(mainOptions0.loggerPrintFailed());
        assertEquals(100, mainOptions0.getTotalNumberTries());
        assertEquals((-1), mainOptions0.getTimeoutSeconds());
        assertTrue(mainOptions0.useConstantCaching());
    }

    @Test
    public void test24() throws Throwable {
        MainOptions mainOptions0 = new MainOptions();
        long long0 = mainOptions0.getMaxASTReduceTime();
        assertEquals(3, mainOptions0.getMaxExpressionDepth());
        assertEquals((-1), mainOptions0.getErrorExitCode());
        assertEquals(16, mainOptions0.getNumberConcurrentThreads());
        assertEquals(100, mainOptions0.getTotalNumberTries());
        assertEquals((-1L), mainOptions0.getRandomSeed());
        assertTrue(mainOptions0.performConnectionTest());
        assertEquals("sqlancer", mainOptions0.getUserName());
        assertTrue(mainOptions0.loggerPrintFailed());
        assertEquals((-1), mainOptions0.getTimeoutSeconds());
        assertTrue(mainOptions0.useConstantCaching());
        assertEquals((-1), mainOptions0.getPort());
        assertEquals("sqlancer", mainOptions0.getPassword());
        assertEquals(1000, mainOptions0.getNrStatementRetryCount());
        assertEquals(10, mainOptions0.getMaxStringConstantLength());
        assertEquals(30, mainOptions0.getMaxNumberInserts());
        assertTrue(mainOptions0.logEachSelect());
        assertEquals((-1L), long0);
        assertTrue(mainOptions0.printProgressInformation());
        assertEquals(100, mainOptions0.getConstantCacheSize());
        assertEquals(100000, mainOptions0.getNrQueries());
        assertEquals((-1), mainOptions0.getMaxGeneratedDatabases());
    }

    @Test
    public void test25() throws Throwable {
        MainOptions mainOptions0 = MainOptions.DEFAULT_OPTIONS;
        int int0 = mainOptions0.getNumberConcurrentThreads();
        assertEquals(16, int0);
    }

    @Test
    public void test26() throws Throwable {
        MainOptions mainOptions0 = MainOptions.DEFAULT_OPTIONS;
        boolean boolean0 = mainOptions0.logQueryPlan();
        assertFalse(boolean0);
    }

    @Test
    public void test27() throws Throwable {
        MainOptions mainOptions0 = MainOptions.DEFAULT_OPTIONS;
        long long0 = mainOptions0.getMaxStatementReduceSteps();
        assertEquals((-1L), long0);
    }

    @Test
    public void test28() throws Throwable {
        MainOptions mainOptions0 = MainOptions.DEFAULT_OPTIONS;
        boolean boolean0 = mainOptions0.testAggregateFunctionsPQS();
        assertFalse(boolean0);
    }

    @Test
    public void test29() throws Throwable {
        MainOptions mainOptions0 = new MainOptions();
        int int0 = mainOptions0.getTimeoutSeconds();
        assertEquals((-1L), mainOptions0.getRandomSeed());
        assertEquals(100000, mainOptions0.getNrQueries());
        assertEquals((-1), mainOptions0.getMaxGeneratedDatabases());
        assertTrue(mainOptions0.loggerPrintFailed());
        assertEquals(3, mainOptions0.getMaxExpressionDepth());
        assertEquals(1000, mainOptions0.getNrStatementRetryCount());
        assertEquals(30, mainOptions0.getMaxNumberInserts());
        assertEquals(16, mainOptions0.getNumberConcurrentThreads());
        assertEquals(100, mainOptions0.getConstantCacheSize());
        assertEquals(100, mainOptions0.getTotalNumberTries());
        assertTrue(mainOptions0.performConnectionTest());
        assertEquals("sqlancer", mainOptions0.getUserName());
        assertEquals("sqlancer", mainOptions0.getPassword());
        assertTrue(mainOptions0.useConstantCaching());
        assertEquals((-1), mainOptions0.getPort());
        assertEquals((-1), int0);
        assertEquals(10, mainOptions0.getMaxStringConstantLength());
        assertEquals((-1), mainOptions0.getErrorExitCode());
        assertTrue(mainOptions0.logEachSelect());
        assertTrue(mainOptions0.printProgressInformation());
    }

    @Test
    public void test30() throws Throwable {
        MainOptions mainOptions0 = MainOptions.DEFAULT_OPTIONS;
        long long0 = mainOptions0.getMaxASTReduceSteps();
        assertEquals((-1L), long0);
    }

    @Test
    public void test31() throws Throwable {
        MainOptions mainOptions0 = new MainOptions();
        String string0 = mainOptions0.getUserName();
        assertEquals(10, mainOptions0.getMaxStringConstantLength());
        assertEquals(1000, mainOptions0.getNrStatementRetryCount());
        assertEquals("sqlancer", mainOptions0.getPassword());
        assertEquals((-1L), mainOptions0.getRandomSeed());
        assertTrue(mainOptions0.loggerPrintFailed());
        assertEquals(100, mainOptions0.getConstantCacheSize());
        assertEquals((-1), mainOptions0.getMaxGeneratedDatabases());
        assertEquals(30, mainOptions0.getMaxNumberInserts());
        assertEquals(16, mainOptions0.getNumberConcurrentThreads());
        assertTrue(mainOptions0.performConnectionTest());
        assertTrue(mainOptions0.useConstantCaching());
        assertEquals((-1), mainOptions0.getErrorExitCode());
        assertEquals(3, mainOptions0.getMaxExpressionDepth());
        assertEquals((-1), mainOptions0.getTimeoutSeconds());
        assertEquals(100, mainOptions0.getTotalNumberTries());
        assertEquals(100000, mainOptions0.getNrQueries());
        assertTrue(mainOptions0.printProgressInformation());
        assertEquals((-1), mainOptions0.getPort());
        assertEquals("sqlancer", string0);
        assertTrue(mainOptions0.logEachSelect());
    }

    @Test
    public void test32() throws Throwable {
        MainOptions mainOptions0 = new MainOptions();
        int int0 = mainOptions0.getNrQueries();
        assertTrue(mainOptions0.performConnectionTest());
        assertEquals((-1), mainOptions0.getTimeoutSeconds());
        assertTrue(mainOptions0.useConstantCaching());
        assertEquals(100000, int0);
        assertEquals(3, mainOptions0.getMaxExpressionDepth());
        assertEquals(30, mainOptions0.getMaxNumberInserts());
        assertEquals((-1), mainOptions0.getMaxGeneratedDatabases());
        assertEquals(100, mainOptions0.getConstantCacheSize());
        assertEquals(16, mainOptions0.getNumberConcurrentThreads());
        assertTrue(mainOptions0.loggerPrintFailed());
        assertEquals(1000, mainOptions0.getNrStatementRetryCount());
        assertEquals((-1L), mainOptions0.getRandomSeed());
        assertEquals("sqlancer", mainOptions0.getPassword());
        assertEquals(10, mainOptions0.getMaxStringConstantLength());
        assertEquals((-1), mainOptions0.getErrorExitCode());
        assertEquals("sqlancer", mainOptions0.getUserName());
        assertEquals(100, mainOptions0.getTotalNumberTries());
        assertEquals((-1), mainOptions0.getPort());
        assertTrue(mainOptions0.logEachSelect());
        assertTrue(mainOptions0.printProgressInformation());
    }

    @Test
    public void test33() throws Throwable {
        MainOptions mainOptions0 = MainOptions.DEFAULT_OPTIONS;
        boolean boolean0 = mainOptions0.validateResultSizeOnly();
        assertFalse(boolean0);
    }

    @Test
    public void test34() throws Throwable {
        MainOptions mainOptions0 = MainOptions.DEFAULT_OPTIONS;
        boolean boolean0 = mainOptions0.useConstantCaching();
        assertTrue(boolean0);
    }

    @Test
    public void test35() throws Throwable {
        MainOptions mainOptions0 = MainOptions.DEFAULT_OPTIONS;
        boolean boolean0 = mainOptions0.loggerPrintFailed();
        assertTrue(boolean0);
    }

    @Test
    public void test36() throws Throwable {
        MainOptions mainOptions0 = MainOptions.DEFAULT_OPTIONS;
        int int0 = mainOptions0.getMaxExpressionDepth();
        assertEquals(3, int0);
    }

    @Test
    public void test37() throws Throwable {
        MainOptions mainOptions0 = new MainOptions();
        mainOptions0.reduceAST();
        assertEquals(10, mainOptions0.getMaxStringConstantLength());
        assertEquals(1000, mainOptions0.getNrStatementRetryCount());
        assertTrue(mainOptions0.printProgressInformation());
        assertEquals((-1), mainOptions0.getPort());
        assertTrue(mainOptions0.logEachSelect());
        assertEquals(100000, mainOptions0.getNrQueries());
        assertEquals((-1), mainOptions0.getMaxGeneratedDatabases());
        assertEquals("sqlancer", mainOptions0.getPassword());
        assertTrue(mainOptions0.useConstantCaching());
        assertEquals(3, mainOptions0.getMaxExpressionDepth());
        assertEquals((-1), mainOptions0.getErrorExitCode());
        assertEquals((-1), mainOptions0.getTimeoutSeconds());
        assertEquals(16, mainOptions0.getNumberConcurrentThreads());
        assertTrue(mainOptions0.performConnectionTest());
        assertEquals(100, mainOptions0.getConstantCacheSize());
        assertEquals((-1L), mainOptions0.getRandomSeed());
        assertEquals("sqlancer", mainOptions0.getUserName());
        assertTrue(mainOptions0.loggerPrintFailed());
        assertEquals(100, mainOptions0.getTotalNumberTries());
        assertEquals(30, mainOptions0.getMaxNumberInserts());
    }

    @Test
    public void test38() throws Throwable {
        MainOptions mainOptions0 = MainOptions.DEFAULT_OPTIONS;
        int int0 = mainOptions0.getConstantCacheSize();
        assertEquals(100, int0);
    }

    @Test
    public void test39() throws Throwable {
        MainOptions mainOptions0 = new MainOptions();
        long long0 = mainOptions0.getMaxStatementReduceTime();
        assertEquals(100, mainOptions0.getConstantCacheSize());
        assertEquals(100, mainOptions0.getTotalNumberTries());
        assertEquals(16, mainOptions0.getNumberConcurrentThreads());
        assertEquals(30, mainOptions0.getMaxNumberInserts());
        assertTrue(mainOptions0.performConnectionTest());
        assertEquals((-1), mainOptions0.getPort());
        assertTrue(mainOptions0.useConstantCaching());
        assertEquals((-1), mainOptions0.getTimeoutSeconds());
        assertEquals("sqlancer", mainOptions0.getUserName());
        assertEquals((-1L), mainOptions0.getRandomSeed());
        assertTrue(mainOptions0.printProgressInformation());
        assertTrue(mainOptions0.logEachSelect());
        assertEquals(10, mainOptions0.getMaxStringConstantLength());
        assertEquals(100000, mainOptions0.getNrQueries());
        assertTrue(mainOptions0.loggerPrintFailed());
        assertEquals((-1), mainOptions0.getErrorExitCode());
        assertEquals("sqlancer", mainOptions0.getPassword());
        assertEquals(3, mainOptions0.getMaxExpressionDepth());
        assertEquals((-1L), long0);
        assertEquals(1000, mainOptions0.getNrStatementRetryCount());
        assertEquals((-1), mainOptions0.getMaxGeneratedDatabases());
    }

    @Test
    public void test40() throws Throwable {
        MainOptions mainOptions0 = new MainOptions();
        mainOptions0.getRandomStringGenerationStrategy();
        assertTrue(mainOptions0.useConstantCaching());
        assertEquals(3, mainOptions0.getMaxExpressionDepth());
        assertEquals(16, mainOptions0.getNumberConcurrentThreads());
        assertEquals(100000, mainOptions0.getNrQueries());
        assertEquals((-1), mainOptions0.getErrorExitCode());
        assertTrue(mainOptions0.performConnectionTest());
        assertEquals(100, mainOptions0.getConstantCacheSize());
        assertEquals((-1), mainOptions0.getMaxGeneratedDatabases());
        assertEquals(1000, mainOptions0.getNrStatementRetryCount());
        assertEquals(10, mainOptions0.getMaxStringConstantLength());
        assertEquals((-1), mainOptions0.getPort());
        assertEquals("sqlancer", mainOptions0.getPassword());
        assertEquals(30, mainOptions0.getMaxNumberInserts());
        assertTrue(mainOptions0.printProgressInformation());
        assertTrue(mainOptions0.logEachSelect());
        assertEquals((-1L), mainOptions0.getRandomSeed());
        assertTrue(mainOptions0.loggerPrintFailed());
        assertEquals("sqlancer", mainOptions0.getUserName());
        assertEquals(100, mainOptions0.getTotalNumberTries());
        assertEquals((-1), mainOptions0.getTimeoutSeconds());
    }

    @Test
    public void test41() throws Throwable {
        MainOptions mainOptions0 = MainOptions.DEFAULT_OPTIONS;
        int int0 = mainOptions0.getPort();
        assertEquals((-1), int0);
    }

    @Test
    public void test42() throws Throwable {
        MainOptions mainOptions0 = MainOptions.DEFAULT_OPTIONS;
        int int0 = mainOptions0.getErrorExitCode();
        assertEquals((-1), int0);
    }

    @Test
    public void test43() throws Throwable {
        MainOptions mainOptions0 = MainOptions.DEFAULT_OPTIONS;
        int int0 = mainOptions0.getMaxGeneratedDatabases();
        assertEquals((-1), int0);
    }

    @Test
    public void test44() throws Throwable {
        MainOptions mainOptions0 = MainOptions.DEFAULT_OPTIONS;
        int int0 = mainOptions0.getMaxNumberInserts();
        assertEquals(30, int0);
    }
}
