package pages

import geb.Page

class ContactUsPage extends Page{

    static url = "/contact-us/"
    //currentURL = baseURL+static URL

    //At Checker

    static at ={
        title == "Contact Us | Abode QA"
        $("h1.entry-title").isDisplayed()
       // println "Title Displayed"
    }

    static content ={
        // <navigatorName ><options map> <actual navigator>

        nameField(wait: true){	$("#g1280-name") }
        emailField(wait: true) { $("#g1280-email") }
        commentField(wait: true){ $("#contact-form-comment-g1280-comment") }
        submitButton(wait: true) { $("button.pushbutton-wide") }

        //Options Map
        /* wait : true
         * required : false
         */
    }

    def "enter name"(nameString){
        nameField.value(nameString)
        assert nameField.value() == nameString
    }

    def "Enter email"(email)
    {
        emailField.value(email)
        assert emailField.value() == email
    }

    def "Enter Comment in comment textarea"(comment){
        commentField.value(comment)
    }

    def "Click on submit button"()
    {
        submitButton.click()
    }


}
