package testPackage

import geb.spock.GebSpec
import pages.*

class FirstGebSpockTestCase extends GebSpec{

    //Specification class is going to have multiple number of feature methods

    def "Fill Contact us form and click on Submit button"(){
        // Feature method is going have some short of blocks those blocks are like given, when then

        given:
        println("We are in given block")

        when:
        //call page using to method

        to ContactUsPage
        //driver.manage().window().maximize()

		"enter name"("Twinkle")
		"Enter email"("dd.test@abodeqa.com")
		"Enter Comment in comment textarea"("Comment is nothing we are testing")

        and:
        "Click on submit button"()

        then:
        at MessageSubmittedPage
        //println title
    }
}


