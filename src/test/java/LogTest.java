import org.drewlabs.logger.Logger;
import org.drewlabs.logger.LoggerInstance;
import org.junit.Test;

public class LogTest {
    @Test
    public void ErrorLog(){
        Logger log = LoggerInstance.getInstance(LogTest.class);
        log.Info("This is a very good log");
    }

    @Logger.Logi(value = "me")
    public void LogiTest(){

    }
}
