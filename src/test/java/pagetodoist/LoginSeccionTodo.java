package pagetodoist;

import control.Button;
import control.Label;
import control.TextBox;
import org.openqa.selenium.By;

public class LoginSeccionTodo {
    public Button logInButton = new Button(By.xpath("//ul/li/a[@href='/auth/login']"));
    public TextBox inputEmail = new TextBox(By.xpath("//input[@type='email']"));
    public TextBox inputPasswd = new TextBox(By.xpath("//input[@type='password']"));
    public Button btnLogIn = new Button(By.xpath("//button[@type='submit']"));
    public Button loginIcon = new Button(By.xpath("//button[@aria-haspopup='menu']/div/img"));
    public Label emailUserLogo = new Label(By.xpath("//p[@class='user_menu_email']"));

    public void login(String user, String pwd){
        inputEmail.setText(user);
        inputPasswd.setText(pwd);
        btnLogIn.click();
    }
}
