import java.util.List;

public class Main {
    public static void main (String[] args){
        Company company = new Company();
        company.setCompanyName("Appsec.Hub");

        QA qa1 = new QA("Petr", "Petrov");
        QA qa2 = new QA("Fedor", "Lol");
        Teams teamQa = new Teams();
        teamQa.setListOfQa(List.of(qa1, qa2));

        Developers developer1 = new Developers("Sasha", "Fedorov");
        Developers developer2 = new Developers("Cat", "Sova");
        Teams teamDeveloper = new Teams();
        teamDeveloper.setListOfDevelopers(List.of(developer1, developer2));

        Managers manager1 = new Managers("Valya", "Rat");
        Teams teamManager = new Teams();
        teamManager.setManager(manager1);


    }
}
