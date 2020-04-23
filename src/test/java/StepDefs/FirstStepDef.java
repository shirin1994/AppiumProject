package StepDefs;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import util.AndroidUtil;
import java.net.MalformedURLException;

public class FirstStepDef {


    AndroidDriver<AndroidElement> driver;

    @Before
    public void setup() throws MalformedURLException {

        DesiredCapabilities caps= AndroidUtil.setupDesiredCapabilities("higi");
        driver=AndroidUtil.getAndroidDriver(caps);
    }

    @Test
    public void first(){

        
    }
}
