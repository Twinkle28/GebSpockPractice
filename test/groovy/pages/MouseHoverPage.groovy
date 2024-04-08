package pages

import geb.Page

class MouseHoverPage extends Page {

    static url = "https://jqueryui.com/"

    static content = {
        contribute {$("a", text: "Contribute")}
        cla {$("a", text: "CLA")}
    }

    def "Hover on Contribute & Click on CLA"() {

        interact {
            moveToElement(contribute)
        }

        cla.click()
    }
}
