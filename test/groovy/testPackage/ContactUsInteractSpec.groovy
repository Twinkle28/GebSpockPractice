package testPackage

import geb.spock.GebSpec
import pages.ContactUsKeyboardAction

class ContactUsInteractSpec extends GebSpec {
    def featureMethod() {
        given:
        to ContactUsKeyboardAction
        driver.manage().window().maximize()

        when:
        fillForm()

        then:
        println("Performed keyboard Actions successfully")
    }
}