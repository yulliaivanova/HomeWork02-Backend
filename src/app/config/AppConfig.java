package app.config;

import app.project.Project;
import app.project.ProjectCustomer;
import app.project.Tasks;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;


@Configuration
public class AppConfig {
    @Bean
   public ProjectCustomer projectCustomer(){
        return new ProjectCustomer(2020, "English app", "gerda88823@)gmail.com");
    }
//    @Bean
//    public Project project(){
//        return new Project(21, "English language app", Arrays.asList(task1, task2,task3);
//    }
//    @Bean
//    public Tasks tasks(){
//        return new Tasks()
//    }


}
