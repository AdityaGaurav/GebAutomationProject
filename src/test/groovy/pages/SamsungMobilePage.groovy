package pages

import geb.Page
import geb.module.Select
import modules.SamsungMobilePageModule

/**
 * Created by adityag on 2/24/17.
 */
class SamsungMobilePage extends Page {

    static at = { $('.KG9X1F h1', text: contains('Samsung Mobiles'))}

    static content = {
        samasungMobile { module SamsungMobilePageModule }
    }

    def refineSearche(){
//        waitFor(samasungMobile.minDropDown)
        def select = samasungMobile.minDropDown.module(Select)
        select.selected = '2000'

//        waitFor(samasungMobile.maxDropDown)
        select = samasungMobile.maxDropDown.module(Select)
        select.selected = '10000'

//        waitFor(samasungMobile.priceHighToLow)
        samasungMobile.priceHighToLow.click()

        samasungMobile.firstMobileLink.click()

    }

}
