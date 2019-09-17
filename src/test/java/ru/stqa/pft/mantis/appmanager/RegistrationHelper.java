package ru.stqa.pft.mantis.appmanager;

import org.openqa.selenium.By;

public class RegistrationHelper extends HelperBase{

//    private final ApplicationManager app;
//    private WebDriver driver;

    public RegistrationHelper(ApplicationManager app) {
        super(app);
    }

    public void start(String username, String email) {
        driver.get(app.getProperty("web.baseUrl") + "/signup_page.php");
//        type(By.name("username"), username);
//        type(By.name("email"), email);
//        click(By.cssSelector("input[value='Signup']"));
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("email")).sendKeys(email);
        click(By.cssSelector("input[type='submit']"));
    }

    public void finish(String confirmationLink, String password) {
        driver.get(confirmationLink);
        type(By.name("password"), password);
        type(By.name("password_confirm"), password);
        click(By.cssSelector("input[value='Update User']"));
    }
}
