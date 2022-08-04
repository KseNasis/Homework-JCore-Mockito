import org.junit.jupiter.api.*;
import ru.netology.entity.Country;
import ru.netology.i18n.LocalizationServiceImpl;

public class LocalizationServiceImplTest {
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
    void locale() {
        LocalizationServiceImpl localizationService=new LocalizationServiceImpl();
        String result=localizationService.locale(Country.RUSSIA);
        String expected="Добро пожаловать";
        Assertions.assertEquals(expected,result);
    }
}