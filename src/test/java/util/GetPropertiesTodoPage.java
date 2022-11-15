package util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GetPropertiesTodoPage {
     private static GetPropertiesTodoPage getPropertiesTodoPage = null;
     private String browser;
     private String host;
     private String user;
     private String pwd;

     private GetPropertiesTodoPage(){
         Properties properties = new Properties();
         String nameFile="todoist.properties";
         InputStream inputStream = getClass().getClassLoader().getResourceAsStream(nameFile);
         if(inputStream!= null){
             try {
                 properties.load(inputStream);
                 browser=properties.getProperty("browserTodo");
                 host=properties.getProperty("hostTodo");
                 user=properties.getProperty("userTodo");
                 pwd=properties.getProperty("pwdTodo");

             } catch (IOException e) {
                 throw new RuntimeException(e);
             }
         }
     }

     public static GetPropertiesTodoPage getInstance(){
         if (getPropertiesTodoPage == null)
             getPropertiesTodoPage =new GetPropertiesTodoPage();
         return getPropertiesTodoPage;
     }

    public String getBrowser() {
        return browser;
    }

    public String getHost() {
        return host;
    }

    public String getUser() {
        return user;
    }

    public String getPwd() {
        return pwd;
    }
}
