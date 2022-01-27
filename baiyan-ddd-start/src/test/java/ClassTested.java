/**
 * @author chenghongguo
 * @date 2022/1/26
 */
public class ClassTested {
    private Collaborator collaborator;

    public void setCollaborator(Collaborator collaborator) {
        this.collaborator = collaborator;
    }

    public void addDoc(String title) {
        collaborator.documentAdded(title);
    }
}
