import org.example.IpspnsFactory;
import org.example.model.Ipspns;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IpsPnsFactoryTest {


    IpspnsFactory ipspnsFactory = new IpspnsFactory();


    @Test
    public void shouldCreateCorrectInstanceOfIpsTeamUsingFactory() {
       Ipspns qa =  ipspnsFactory.createIpspnsTeam("QA");
       Assertions.assertTrue("Alsu".equals(qa.peopleNames()));
    }
}
