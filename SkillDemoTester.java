import org.junit.*;
import static org.junit.Assert.*;

public class SkillDemoTester {
    @Test
    public void multiplication(){
        assertEquals(3, SkillDemo.multiply(1,2));
    }
}
