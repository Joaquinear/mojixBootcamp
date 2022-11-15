package pagetodoist;

import control.Button;
import control.ClickRigth;
import org.openqa.selenium.By;

public class DeleteProject {
    Button deleteProject = new Button(By.xpath("//div[normalize-space()='Delete task']"));
    public Button moreOptionProject = new Button(By.xpath("//button[@aria-label='Project options menu']"));
    public Button deleteProjectone = new Button(By.xpath("//div[normalize-space()='Delete project']"));
    public Button confirmacionDelete = new Button(By.xpath("//span[normalize-space()='Delete']"));
    public void subMenuProjectDelete(String nameProject){
        ClickRigth project = new ClickRigth(By.xpath("//span[normalize-space()='"+nameProject+"']"));
        project.acctionClickRight();
        deleteProject.click();
    }

}
