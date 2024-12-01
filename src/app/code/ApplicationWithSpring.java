package app.code;

import app.project.ProjectCustomer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class ApplicationWithSpring {
    public static void main(String[] args) {
        AbstractApplicationContext context =new
                AnnotationConfigApplicationContext("app.config");

        ProjectCustomer projectCustomer =context.getBean(ProjectCustomer.class);
        projectCustomer.printCustomerDetails();
    }


}
