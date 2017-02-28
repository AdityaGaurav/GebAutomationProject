package specs

import geb.driver.CachingDriverFactory
import geb.spock.GebSpec
import pages.HomePage
import pages.LoginPage
import pages.MobileDescriptionPage
import pages.SamsungMobilePage

/**
 * Created by adityag on 2/24/17.
 */
class LoginPageSpec extends GebSpec {

    def setup() {
//       browser.driver.javascriptEnabled = false
    }

    def cleanup() {
        CachingDriverFactory.clearCache()
    }

    def "perform login operation"() {
        setup:
        to LoginPage

        when:
        waitFor { at LoginPage }
        loginIntoApplication("", "")

        then:
        true

        when:
        waitFor{at HomePage}
        clickOnElectroniceLink()

        then:
        true

        when:
        waitFor {at SamsungMobilePage}
        refineSearche()

        then:
        true

       when:
       waitFor {at MobileDescriptionPage}
       addToCart()

        then:
        true

    }
}
