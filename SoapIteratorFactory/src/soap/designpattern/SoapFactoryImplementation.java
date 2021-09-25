package soap.designpattern;

public class SoapFactoryImplementation implements SoapCollection{
    public String soapDetails[]= {
    							"Soap used in Free Standing Bath",
    							"Soap used in Hand Bath",
    							"Soap used in ShowerBath"
    							  };
	@Override
	public Iterator getIterator() {
		return new SoapFactoryIterator();
	}
	
	private class SoapFactoryIterator implements Iterator
	{
		int index = 0;
		@Override
		public boolean hasNext() {
			if(index<soapDetails.length)
				return true;
			else
				return false;
		}

		@Override
		public Object next() {
			if(this.hasNext())
				return soapDetails[index++];
			else
				return null;
		}
		
	}
	

}
