package testSuitTodoIst;

import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pagetodoist.MainPageCreateProject;
import util.GetPropertiesTodoPage;

public class TestLoginTodoIst extends TestBaseTodoIst  {
    private static String projectName = "projecto";
    @Test
    public void loginPageTodo(){
        loginSeccionTodo.logInButton.click();
        loginSeccionTodo.inputEmail.setText(user);
        loginSeccionTodo.inputPasswd.setText(pwd);
        loginSeccionTodo.btnLogIn.click();
        loginSeccionTodo.loginIcon.click();
        Assertions.assertEquals(GetPropertiesTodoPage.getInstance().getUser(),loginSeccionTodo.emailUserLogo.getText());
    }
    @Test
    public void createProjectMainPage(){
        loginSeccionTodo.logInButton.click();
        loginSeccionTodo.inputEmail.setText(user);
        loginSeccionTodo.inputPasswd.setText(pwd);
        loginSeccionTodo.btnLogIn.click();
        mainPageCreateProject.createNewProjectBtn.click();
        mainPageCreateProject.projectName.setText(projectName);
        mainPageCreateProject.colorSelectOpen.click();
        mainPageCreateProject.colorSelection.click();
        mainPageCreateProject.viewProject.click();
        mainPageCreateProject.addBtnProject.click();
        Assertions.assertTrue(mainPageCreateProject.existLabel(projectName));
    }
    @Test
    public void deleteProject(){
        loginSeccionTodo.logInButton.click();
        loginSeccionTodo.inputEmail.setText(user);
        loginSeccionTodo.inputPasswd.setText(pwd);
        loginSeccionTodo.btnLogIn.click();
        mainPageCreateProject.createNewProjectBtn.click();
        mainPageCreateProject.projectName.setText(projectName);
        mainPageCreateProject.colorSelectOpen.click();
        mainPageCreateProject.colorSelection.click();
        mainPageCreateProject.viewProject.click();
        mainPageCreateProject.addBtnProject.click();
        deleteProject.moreOptionProject.click();
        deleteProject.deleteProjectone.click();
        deleteProject.confirmacionDelete.click();
        Assertions.assertFalse(mainPageCreateProject.existLabel(projectName));
        //deleteProject.subMenuProjectDelete(projectName);
    }
}
