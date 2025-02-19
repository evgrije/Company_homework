public class QA extends Teams{
    private String name;
    private String surname;

    public QA(String name, String surname) {
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
            System.out.println("Молодец, ты понял" + "-" + name);
        } else {
            System.out.println("Поле вообще то обязательное");
        }

    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname != null && !surname.isEmpty()){
            this.surname = surname;
            System.out.println("Молодец, ты прям понял" + "-" + surname);
        } else {
            System.out.println("Ну сколько повторять :(");
        }
    }

}
