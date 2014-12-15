import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class StackkTest {
   
    Stack stck = new Stack();
    
    @Test
    public void check() {
        int a;
        a=3;
        int p;
//        p = stck.pop();
        p = stck.pop();
        assertEquals(-1, p);
        String s;
//        s = asser
    }    
    
    @Test
    public void check2() {
        stck.push(2);
       
    }
}
