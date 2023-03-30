import org.junit.Before;
import org.junit.Test;
import vinnsla.Vidskiptavinur;

public class VidskiptavinurTest {
    private Vidskiptavinur vidskiptavinur;

    @Before
    public void constructVidskiptavinur() {
        vidskiptavinur = new Vidskiptavinur("John", "myHome");
    }

    @Test
    public void testGetNafn() {
        assert vidskiptavinur.getNafn().equals("John");
    }

    @Test
    public void testNafnProperty() {
        assert vidskiptavinur.nafnProperty().get().equals("John");
    }

    @Test
    public void testHeimilisfangProperty() {
        assert vidskiptavinur.heimilisfangProperty().get().equals("myHome");
    }

}
