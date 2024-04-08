import spock.lang.*

class SpecificationClass extends Specification{

    //instance fields
    @Shared obj = new SumOfTwoNumber()

    def "Feature method one"()
    {
        given:
        obj
    }

    def "Feature method two"()
    {
        given:
        obj
    }
}