import spock.lang.Specification

class SpockBlock extends Specification{

    def "feature method with block"(){
        setup:
        def a= 3
        def b= 5
        def obj = new SumOfTwoNumber()

        when:
        def sum = obj.adder(a,b)

        then:
        sum == 8

        when:
        def list = []
        list.add(6)
        list.add(2)
        println list.get(5)

        then:
        thrown(IndexOutOfBoundsException)
        println "Finally we have thrown the exception"
        list.size() == 2

        expect:
        Math.max(20,30) == 30

        cleanup:
        println "Releasing object memory"
    }
}
