import spock.lang.*

class FeatureMethodExample extends Specification{

    def "We are going to add two no."()
    {
        given:
        def obj = new SumOfTwoNumber()

        when: "when we are going to call adder method"
        def sum = obj.adder(2,3)

        then:
        sum == 5
    }
}
