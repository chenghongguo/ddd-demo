import org.easymock.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author chenghongguo
 * @date 2022/1/26
 */
@RunWith(EasyMockRunner.class)
public class MathApplicationTester {
    // @TestSubject annotation is used to identify class which is going to use the //mock object
    @TestSubject
    private final MathApplication mathApplication = new MathApplication();

    // @Mock annotation is used to create the mock object to be injected
    @Mock
    private CalculatorService calculatorService;

    @Test
    public void testAdd() {
        // add the behavior of calc service to add two numbers
        EasyMock.expect(calculatorService.add(10.0, 20.0)).andReturn(30.00);
        // activate the mock
        EasyMock.replay(calculatorService);
        // test the add functionality
        Assert.assertEquals(mathApplication.add(10.0, 20.0), 30.0, 0);
        // verify call to calculatorService is made or not
        EasyMock.verify(calculatorService);
    }
}
