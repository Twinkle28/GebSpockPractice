package pages

import geb.Page
import org.openqa.selenium.Keys

class ContactUsKeyboardAction  extends Page {

    static url = "https://abodeqa.com/contact-us/"

    static content = {

        nameField { $("#g1280-name") }
        emailField { $("#g1280-email") }
        websiteField { $("#g1280-website") }
        commentField { $("#contact-form-comment-g1280-comment") }
        submitButton { $("button.pushbutton-wide") }
    }

    static at = {
        title == "Contact Us | Abode QA"
    }

    def fillForm() {

        nameField.value "Twinkle Kumari"
        emailField.value "dd.test@abodeqa.com"
        websiteField.value "https://www.easemytrip.com"

        //CTRL + A
        interact {
            keyDown(Keys.CONTROL)
            sendKeys("A")
        }

        //CTRL + C
        interact {
            keyDown(Keys.CONTROL)
            sendKeys("C")
        }

        commentField.click()

        //CTRL + V
        interact {
            keyDown(Keys.CONTROL)
            sendKeys("V")
        }

        submitButton.click()
    }
}