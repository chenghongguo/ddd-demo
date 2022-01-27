import org.easymock.EasyMockRule;
import org.easymock.EasyMockSupport;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.Rule;
import org.junit.Test;

/**
 * @author chenghongguo
 * @date 2022/1/26
 */
public class ExampleTest extends EasyMockSupport {

    @Rule
    public EasyMockRule rule = new EasyMockRule(this);

    @Mock
    private Collaborator collaborator;

    @TestSubject
    private final ClassTested classTested = new ClassTested();

    @Test
    public void addDoc() {
        classTested.setCollaborator(collaborator);
        collaborator.documentAdded("new doc");
        replayAll();
        // classTested.addDoc("new Docc");
        // verifyAll();
    }

}
