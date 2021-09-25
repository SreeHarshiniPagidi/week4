package soap.designpattern;

public class SoapIteratorTest {

	public static void main(String[] args) {
		SoapFactoryImplementation soapFactory = new SoapFactoryImplementation();
		Iterator itr= soapFactory.getIterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}
