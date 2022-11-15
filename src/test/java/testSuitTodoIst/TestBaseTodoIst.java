package testSuitTodoIst;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pagetodoist.DeleteProject;
import pagetodoist.LoginSeccionTodo;
import pagetodoist.MainPageCreateProject;
import pageyopmail.LoginSeccion;
import session.Session;
import util.GetPropertiesTodoPage;

public class TestBaseTodoIst {
    LoginSeccionTodo loginSeccionTodo = new LoginSeccionTodo();
    MainPageCreateProject mainPageCreateProject = new MainPageCreateProject();
    DeleteProject deleteProject = new DeleteProject();
    String user = GetPropertiesTodoPage.getInstance().getUser();
    String pwd = GetPropertiesTodoPage.getInstance().getPwd();
    @BeforeEach
    public void openBrowser(){
        // todo create property file
        Session.getInstance().getBrowser().get(GetPropertiesTodoPage.getInstance().getHost());
    }
    @AfterEach
    public void closeBrowser(){
        Session.getInstance().closeSession();
    }
}
