
package main;

import controller.ProjectController;
import java.sql.Connection;
import java.util.List;
import model.Project;
import util.ConnectionFactory;

public class Main {
    
    public static void main(String[] args) {
        // ToDoApp code application logic here
        
        //Connection c = ConnectionFactory.getConnection();
        
        //ConnectionFactory.closeConnection(c);
        
        ProjectController projectController = new ProjectController();
        
        Project project = new Project();
        project.setName("Projeto 2");
        project.setDescription("abc");
        project.setCreatedAt(new java.util.Date());
        project.setUpdatedAt(new java.util.Date());
        projectController.save(project);
        
//        project.setName("Novo nome do projeto de teste");
//        projectController.update(project);
//        
//        List<Project> projects = projectController.getAll();
//        System.out.println("Total de projetos = " + projects.size());
        
        
        
    }
}
