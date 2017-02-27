package pages

import geb.Page
import modules.HomePageModule
import modules.LoginPageModule

/**
 * Created by adityag on 2/23/17.
 */
class HomePage extends Page {

    static at = { title.startsWith("Online Shopping") }

    static content = {
        homePageModule { module HomePageModule }
    }

    def clickOnElectroniceLink() {
        waitFor { homePageModule.electronicsLink.displayed }
        //sleep(5000)
            interact {
                moveToElement(homePageModule.electronicsLink)
            }
            waitFor {homePageModule.samsungLink.displayed}

        homePageModule.samsungLink.click()


    }

}




