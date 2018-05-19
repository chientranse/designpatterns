package edu.chientran98.designpattern.chainofresponsibility;

/**
 *
 * @author yeula
 */
public class ChainOfResposibilityPatternDemo {
    
    private static AbstractLogger getChainOfLoggers() {
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }
    
    public static void main(String[] args) {
        AbstractLogger logger = getChainOfLoggers();
        
        logger.logMessage(AbstractLogger.DEBUG, "This is an debug message");
        logger.logMessage(AbstractLogger.ERROR, "This is an error message");
        logger.logMessage(AbstractLogger.INFO, "This is an info message");
    }
}
