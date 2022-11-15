package util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GetPropertiesYomail {
    private static GetPropertiesYomail getPropertiesYomail = null;
    private String browserYomail;
    private String hostYomail;
    private String userYomail;
    private String pwdYomail;

    private GetPropertiesYomail(){
        Properties properties = new Properties();
        String nameFile="todoly.properties";
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(nameFile);
        if(inputStream!= null){
            try {
                properties.load(inputStream);
                browserYomail=properties.getProperty("browser");
                hostYomail=properties.getProperty("host");
                userYomail=properties.getProperty("user");
                pwdYomail=properties.getProperty("pwd");

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static GetPropertiesYomail getInstance(){
        if (getPropertiesYomail == null)
            getPropertiesYomail =new GetPropertiesYomail();
        return getPropertiesYomail;
    }

    public String getBrowser() {
        return browserYomail;
    }

    public String getHost() {
        return hostYomail;
    }

    public String getUser() {
        return userYomail;
    }

    public String getPwd() {
        return pwdYomail;
    }
}
