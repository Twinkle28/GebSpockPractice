package testPackage

import geb.spock.GebSpec
import pages.DragAndDropPage

class DragAndDropSpec extends GebSpec{

    def dragAndDropFeatureMethod(){
        given:
        to DragAndDropPage
        driver.manage().window().maximize()

        when:
        dragElement()

        then:
        println("Element is dragged from its position to second one")
    }
}
