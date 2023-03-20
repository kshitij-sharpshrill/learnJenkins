import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {

    @Test(description = "Creating TestNG Demo code to run on Jenkins")
    public void testCodeRun(){
        System.out.println("Hello! I have started testing");
        Assert.assertTrue(true);
    }
}
