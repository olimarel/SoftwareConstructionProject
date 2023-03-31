import org.junit.Before;
import org.junit.Test;
import vinnsla.Customer;

public class CustomerTest {
    private Customer customer;

    @Before
    public void constructVidskiptavinur() {
        customer = new Customer("John", "myHome");
    }

    @Test
    public void testGetNafn() {
        assert customer.getName().equals("John");
    }

    @Test
    public void testNafnProperty() {
        assert customer.nameProperty().get().equals("John");
    }

    @Test
    public void testHeimilisfangProperty() {
        assert customer.addressProperty().get().equals("myHome");
    }

}
