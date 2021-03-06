import java.util.ArrayList;

public class Person {

    // int no;
    private String id;
    private String name;
    private String surname;
    private String title;
    private String role;
    private String gender;
    protected ArrayList<String> actions = new ArrayList<String>();

    // constructor
    public Person(String id, String name, String surname, String title, String role, String gender) {
        setId(id);
        setName(name);
        setSurname(surname);
        setGender(gender);
        setRole(role);
        setTitle(title);
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getters
    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getGender() {
        return gender;
    }

    public String getRole() {
        return role;
    }

    public String getTitle() {
        return title;
    }

    public String getFullName() {
        return title + ". " + name + " " + surname;
    }

    public ArrayList<String> getActions() {
        return actions;
    }

    public void addAction(String action) {
        actions.add(action);
    }

    public void displayActions() {
        for (String action : actions) {
            System.out.println(action);
        }
    }

    public void viewPersonDetails() {
        System.out.println("---------------------------");
        System.out.println("Full Name :" + getFullName());
        System.out.println("ID Card Number :" + getID());
        System.out.println("Sex :" + getGender());
        System.out.println("Role :" + getRole());
        System.out.println("Last Actions :");
        displayActions();
        System.out.println("---------------------------");
    }

}
