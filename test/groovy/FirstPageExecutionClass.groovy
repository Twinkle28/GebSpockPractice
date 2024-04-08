import geb.Browser
import pages.ContactUsPage

Browser.drive{

    to ContactUsPage

   // driver.manage().window().maximize()

    println currentUrl

    "enter name"("Twinkle Kumari")
}
