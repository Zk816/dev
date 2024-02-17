package Person;


public class Person {
    private int Id;
    private String Name;
    private String Login;
    private int Password;

    public Person(int id, String name, String login, int password, int balance) {
        this.Id = id;
        this.Name = name;
        this.Login = login;
        this.Password = password;
    }

    public Person() {

    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public String getLogin() {
        return Login;
    }

    public int getPassword() {
        return Password;
    }
}


