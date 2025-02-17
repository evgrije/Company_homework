public class Managers {
    private String name;
    private String surname;

    public Managers(String name, String surname) {
        if (name != null && !name.isEmpty()){
            this.name = name;
        }

        if (surname != null && !surname.isEmpty()){
            this.surname = surname;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
