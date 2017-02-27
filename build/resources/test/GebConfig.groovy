import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.phantomjs.PhantomJSDriver
import org.openqa.selenium.remote.DesiredCapabilities

/**
 * Created by adityag on 2/23/17.
 */
waiting {
    timeout = 60

}

environments {

    // run via “./gradlew chromeTest”
    // See: http://code.google.com/p/selenium/wiki/ChromeDriver
    chrome {

        driver = { new ChromeDriver() }
    }

    // run via “./gradlew firefoxTest”
    // See: http://code.google.com/p/selenium/wiki/FirefoxDriver
    firefox {
        def capability = new DesiredCapabilities()
        capability = DesiredCapabilities.firefox()
        driver = { new FirefoxDriver(capability) }
    }

    phantomJs {
        driver = { new PhantomJSDriver() }
    }

}

// To run the tests with all browsers just run “./gradlew test”

//Define the URL, want to open in browser
baseUrl = "https://www.flipkart.com/"