import org.junit.*;
import static org.junit.Assert.*;

public class Testid1{
    @Test
    public void nimetus(){
        Jook j=new Jook("limonaad",0.2, 1.1);
        assertEquals("limonaad", j.kysiNimetus())
    }
}