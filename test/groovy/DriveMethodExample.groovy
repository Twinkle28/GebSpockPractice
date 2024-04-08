import geb.Browser

Browser.drive {

    go("/hotels/")

    $("#htl_dates").click()

}

