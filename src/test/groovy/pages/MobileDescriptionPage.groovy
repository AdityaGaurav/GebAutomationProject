package pages

import geb.Page
import modules.MobileDescriptionPageModule

/**
 * Created by adityag on 2/27/17.
 */
class MobileDescriptionPage extends Page {

    static at ={mobileDescriptionPageModule.buyNoWButton.displayed}

    static content = {
          mobileDescriptionPageModule {module MobileDescriptionPageModule}
    }

    def addToCart(){
        mobileDescriptionPageModule.buyNoWButton.click()
        mobileDescriptionPageModule.continueButton.click()
//        mobileDescriptionPageModule.deliverHereButton.click()

    }
}
