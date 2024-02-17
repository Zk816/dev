package Person;
public class Employee extends Person {
    private int EmpId;
    private String Name;
    private String Login;
    private int Password;
    private int Balance;

    public Employee(int EmpId, String Name, String Login, int Password, int Balance) {
        super(EmpId, Name, Login, Password, Balance);

    }

    public Employee(int id, String name, String login, int password, int balance, int cusId, String name1, String login1, int password1, int balance1) {
        super(id, name, login, password, balance);
        EmpId = cusId;
        Name = name1;
        Login = login1;
        Password = password;
        Balance = balance;
    }

    public int getCusId() {
        return EmpId;
    }

    public void setCusId(int cusId) {
        EmpId = cusId;
    }

    @Override
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    @Override
    public int getPassword() {
        return Password;
    }

    public void setPassword(int password) {
        Password = password;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }
}

