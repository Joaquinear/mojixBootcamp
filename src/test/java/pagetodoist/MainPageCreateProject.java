package pagetodoist;

import control.Button;
import control.Control;
import control.Label;
import control.TextBox;
import org.openqa.selenium.By;

public class MainPageCreateProject {
    //public Button openMenu = new Button(By.xpath("//button[@aria-label='Main menu']"));
    public Button createNewProjectBtn = new Button(By.xpath("//button[@aria-label='Add project']//*[name()='svg']"));
    public TextBox projectName = new TextBox(By.id("edit_project_modal_field_name"));
    public Button colorSelectOpen = new Button(By.xpath("//span[@class='color_dropdown_select__name']"));
    public Button colorSelection = new Button(By.xpath("//span[normalize-space()='Sky Blue']"));
    public Button viewProject = new Button(By.xpath("//div[@class='edit_project_modal__board_preview']"));
    public Button addBtnProject = new Button(By.xpath("//button[text()='Add']"));
    //public Control driver = new Control();
    public MainPageCreateProject(){}

    public boolean existLabel(String projecto){
        Label labelProyect = new Label(By.xpath("//h1/span[text()='"+projecto+"']"));
        return labelProyect.isControlDisplayed();
    }

}
