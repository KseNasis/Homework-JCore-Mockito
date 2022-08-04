import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import ru.netology.entity.Country;
import ru.netology.geo.GeoServiceImpl;

import java.util.stream.Stream;

public class GeoServiceImplTest {
    private long testStartTime;

    @BeforeEach
    public void BeforeEachMethod() {
        System.out.println("Test started");
        testStartTime = System.nanoTime();
    }

    @AfterEach
    public void AfterEachMethod() {
        System.out.println("Test compiled " + (System.nanoTime() - testStartTime));
    }

    @Test
    void byIpUSA() {
        GeoServiceImpl geoService = new GeoServiceImpl();
        String ip = "96.20.55.34";
        Assertions.assertEquals(Country.USA, geoService.byIp(ip).getCountry());
    }

    @Test
    void byIpRussia() {
        GeoServiceImpl geoService = new GeoServiceImpl();
        String ip = "172.15.46.20";
        Assertions.assertEquals(Country.RUSSIA, geoService.byIp(ip).getCountry());
    }

}
