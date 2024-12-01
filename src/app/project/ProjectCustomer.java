package app.project;

public class ProjectCustomer {
    private int id;
    private String name;
    private String email;

    public ProjectCustomer(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public void printCustomerDetails(){
        System.out.println("Заказчик проекта: " + name + " " + id + " " + email);
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ApplicationWithSpring{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
