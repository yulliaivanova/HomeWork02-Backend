package app.code;

import app.project.Project;
import app.project.ProjectCustomer;
import app.project.Tasks;
import org.springframework.scheduling.config.Task;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {


        Tasks task1 = new Tasks(1, "Make a target audience analysis");
        Tasks task2 = new Tasks(2, "Create an application visualization");
        Tasks task3 = new Tasks(3, "Draw up a detailed implementation plan");


        Project project = new Project(21, "English language app", Arrays.asList(task1, task2, task3));

        ProjectCustomer projectCustomer =
                new ProjectCustomer(2020, "English app", "gerda88823@)gmail.com");
        projectCustomer.printCustomerDetails();
//        projectCustomer.setProject(Project);

    }




}
