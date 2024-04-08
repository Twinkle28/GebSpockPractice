import spock.lang.Specification

class SpockFixtureMethod extends Specification{

    def setupSpec()
    {
        println "we are in setup spec"
    }

    def setup()
    {
        println "we are in setup fixture"
    }

    def "Feature method one"()
    {
        given:
        println "we are in Feature method one"
    }

    def "Feature method two"()
    {
        given:
        println "we are in Feature method two"
    }

    def "Feature method 3"()
    {
        given:
        println "we are in Feature method 3"
    }

    def cleanup()
    {
        println "we are in cleanup fixture method"
    }

    def cleanupSpec()
    {
        println "we are in cleanup spec"
    }

}
