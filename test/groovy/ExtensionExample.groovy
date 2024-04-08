import spock.lang.Ignore
import spock.lang.IgnoreRest
import spock.lang.Issue
import spock.lang.Specification
import spock.lang.Timeout

class ExtensionExample extends Specification{
    @Issue("http://Userstory 2")
    def "feature 1"()
    {
        given:
        println "we are in feature 1"
    }

   // @Ignore
    def "feature 2"()
    {
        given:
        println "we are in feature 2"
    }

    //@IgnoreRest
    def "feature 3"()
    {
        given:
        println "we are in feature 3"
    }

    @Timeout(2)
    def "feature 4"()
    {
        given:
        println "we are in feature 4"
    }
}
