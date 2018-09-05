package org.drewlabs.logger;

public class LoggerInstance {

    public static Logger getInstance(Class clazz){
        Logger logger = new Logger();
        logger.setClazz(clazz);
        return logger;
    }
}
