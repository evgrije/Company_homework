import java.util.List;

public class Teams extends Company{
    private Managers manager;
    private List<QA> listOfQa;
    private List<Developers> listOfDevelopers;

    public Managers getManager() {
        return manager;
    }

    public void setManager(Managers manager) {
        this.manager = manager;
    }

    public List<QA> getListOfQa() {
        return listOfQa;
    }

    public void setListOfQa(List<QA> listOfQa) {
        this.listOfQa = listOfQa;
    }

    public List<Developers> getListOfDevelopers() {
        return listOfDevelopers;
    }

    public void setListOfDevelopers(List<Developers> listOfDevelopers) {
        this.listOfDevelopers = listOfDevelopers;
    }
}
