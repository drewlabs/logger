package org.drewlabs.logger;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Logger {

    private Class clazz;

    public void Info(String logMsg){
        System.out.println("Got this log :: " + logMsg);
    }
    public void Error(String logMsg){

    }
    public void WTF(String logMsg){

    }
    public void Warn(String logMsg){

    }
    public void Debug(String logMsg){

    }
    public void Log(String logMsg){

    }



























    // getter and setter
    public Class getClazz() {
        return clazz;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }

    @Retention(value = RetentionPolicy.RUNTIME)
    @Target(value = ElementType.METHOD)
    public @interface Logi{
        String value() default "Hello";
    }
//    @interface Loge{
//
//    }
//    @interface Logw{
//
//    }
//    @interface Logl{
//
//    }
//    @interface Logv{
//
//    }
//    @interface Logiwtf{
//
//    }
//    @interface Logd{
//
//    }

}
