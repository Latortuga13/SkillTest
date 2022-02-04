import org.junit.*;
import static org.junit.Assert.*;

public class AdditionTester {
   Addition test = new Addition(1,2);
   @Test 
   public void testAdd(){
       assertEquals(2, test.add());
   }
}
