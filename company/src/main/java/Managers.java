public class Managers extends Teams{
    private String name;
    private String surname;

    public Managers(String name, String surname) {
            this.name = name;
            setName(name);

            this.surname = surname;
            setSurname(surname);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()){
            this.name = name;
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname != null && !surname.isEmpty()){
            this.surname = surname;
        }
    }
}
