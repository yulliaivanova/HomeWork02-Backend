package app.project;

public class Tasks {
    private int id;
    private String name;

    public Tasks(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void executionOfTheTask(){
        System.out.println("Выполнение задачи: "+ name);
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

    @Override
    public String toString() {
        return "Tasks{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
