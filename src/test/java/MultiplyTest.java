
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import test.Multiply;


public class MultiplyTest {
    @Test
    public void mul() {
        Multiply M = new Multiply();
        int a, c, b;
        a=2;
        b=3;
        c = M.mul(a, b);
        assertEquals(7, c);

    }
    @Test
    public void mul2() {
        Multiply M = new Multiply();
        int a, c, b;
        a=3;
        b=3;
        c = M.mul(a, b);
        assertEquals(9, c);
        
//        if(c!=6)
        
    }
}
