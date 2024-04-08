import geb.Browser
import org.openqa.selenium.chrome.ChromeDriver

def browser = new Browser(driver : new ChromeDriver())

browser.go("http://udemy.com")

println "Navigated to Udemy Website"

browser.close()