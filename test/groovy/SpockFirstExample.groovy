import spock.lang.Specification

class SpockFirstExample extends Specification{

    def "We are going to see max value using Math class"()
    {
        expect:
        Math.max(20,30) == 30
    }
}