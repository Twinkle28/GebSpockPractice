package testPackage

import geb.spock.GebSpec
import pages.MouseHoverPage

class MouseHoverSpec extends GebSpec{

    def "We are going to see Hover example"() {

        given:
        to MouseHoverPage

        when: "We are going to Hover on Contribute & then lick on CLA"
        "Hover on Contribute & Click on CLA"()

        then:
        println("Performed Mouse Hovering successfully")
    }
}
