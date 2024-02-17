import Person.Person;

import java.sql.*;

interface PersonFactory {
    Person createPerson();
}

class EmployeeFactory implements PersonFactory {
    public Person createPerson() {
        return new Employee();
    }
}

class CustomerFactory implements PersonFactory {
    public Person createPerson() {
        return new Customer();
    }
}

class Employee extends Person {
    public Employee(int id, String name, String login, int password, int balance) {
        super(id, name, login, password, balance);
    }

    public Employee() {
        super();
    }

    public static void employeeMenu() {
        System.out.print("Enter login: ");
        String Login = Main.scan.nextLine();
        System.out.print("Enter password: ");
        int Password = Main.scan.nextInt();

        Connection conn = null;
        Statement stmt = null;
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "ggg816");
            String check_login = "SELECT * FROM \"Employee\" WHERE \"Login\" = '" + Login + "' AND \"Password\" = '" + Password + "';";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(check_login);
            if (rs.next()) {
                System.out.println("Login successful");
                int option = 0;
                do {
                    System.out.println("1. List all items");
                    System.out.println("2. Add new items");
                    System.out.println("3. Remove items");
                    System.out.println("4. Exit");
                    System.out.print("Enter option: ");

                    option = Main.scan.nextInt();
                    Main.scan.nextLine();

                    switch (option) {
                        case 1:
                            Main.getAllItems();
                            break;
                        case 2:
                            Main.addNewItem();
                            break;
                        case 3:
                            Main.removeItem();
                            break;
                    }
                } while (option != 4);
            } else {
                System.out.println("Login failed");
            }
        } catch (SQLException se) {
            se.printStackTrace();
        } finally {
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }


}

class Customer extends Person {
    public Customer(int id, String name, String login, int password, int balance) {
        super(id, name, login, password, balance);
    }

    public Customer() {

    }

    public static void customerMenu() {
        System.out.print("Enter login: ");
        String Login = Main.scan.nextLine();
        System.out.print("Enter password: ");
        int Password = Main.scan.nextInt();

        Connection conn = null;
        Statement stmt = null;

        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "ggg816");
            stmt = conn.createStatement();
            String check_login = "SELECT * FROM \"Customer\" WHERE \"Login\" = '" + Login + "' AND \"Password\" = '" + Password + "';";
            ResultSet rs = stmt.executeQuery(check_login);
            if (rs.next()) {
                System.out.println("Login successful");
                int option ;
                do {
                    System.out.println("1. List all items");
                    System.out.println("2. Add new items");
                    System.out.println("3. Remove items");
                    System.out.println("4. Buy items");
                    System.out.println("5. Exit");
                    System.out.print("Enter option: ");

                    option = Main.scan.nextInt();
                    Main.scan.nextLine();

                    switch (option) {
                        case 1:
                            Main.getAllItems();
                            break;
                        case 2:
                            Main.addNewItem();
                            break;
                        case 3:
                            Main.removeItem();
                            break;
                        case 4:
                            Main.buyItem();
                            break;
                        case 5:
                            break;
                        default:
                            System.out.println("Invalid option. Please try again.");
                            break;
                    }
                } while (option != 5);

            } else {
                System.out.println("Login failed");
            }
        } catch (SQLException se) {
            se.printStackTrace();
        } finally {
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }

}
