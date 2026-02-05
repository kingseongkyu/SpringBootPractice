import org.junit.jupiter.api.*;

public class JUnitCycleTest {
    @BeforeAll  //테스트 시작 전 한번만 실행
    static void beforeAll() {
        System.out.println("@BeforeAll");
    }

    @BeforeEach //테스트 케이스를 시작하기 전 매번 실행
    public void beforeEach() {
        System.out.println("@beforeEach");
    }

    @Test
    public void test1() {
        System.out.println("test1");
    }

    @Test
    public void test2() {
        System.out.println("test2");
    }

    @Test
    public void test3() {
        System.out.println("test3");
    }

    @AfterAll   //테스트 마치고 종료전에 한번 실행
    static void afterAll() {
        System.out.println("@AfterAll");
    }

    @AfterEach  //테스트 케이스를 종료하기 전 매번 실행
    public void afterEach() {
        System.out.println("@AfterEach");
    }
}
