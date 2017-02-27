package pages

import geb.Page
import modules.HomePageModule
import modules.LoginPageModule

/**
 * Created by adityag on 2/23/17.
 */
class LoginPage extends Page {

    static at = { title.startsWith("Online Shopping") }

    static content = {
        loginPageModule { module LoginPageModule }
        homePageModule { module HomePageModule }

//        clickLoginLink{module(LoginPageModule.loginLink).click()}
//        enterUserName {module(LoginPageModule.enterUserID) }
//        enterPassword { module(LoginPageModule.enterPassword) }
//        clickLoginButton { module(LoginPageModule.loginButton).click() }

    }

    def loginIntoApplication(String userName, String password) {
        waitFor { loginPageModule.loginLink.click() }


        loginPageModule.enterUserID << userName
        loginPageModule.enterPassword << password
        loginPageModule.loginButton.click()

    }

}
