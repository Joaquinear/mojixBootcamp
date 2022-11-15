package control;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import session.Session;

public class ClickRigth extends Control{

    public ClickRigth(By locator) {
        super(locator);
    }
    public void acctionClickRight(){
        Actions actions = new Actions(Session.getInstance().getBrowser());
        actions.contextClick(this.control).perform();
    }
}
