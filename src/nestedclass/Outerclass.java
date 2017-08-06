package nestedclass;

public class Outerclass {
	InnerA innerA = new InnerA();
	InnerB innerB = new InnerB();
	InnerC innerC = new InnerC();
	InnerD innerD = new InnerD();
	
		
		
	public void outterMethod() {
		System.out.println("This is outter method");
		innerA.innerAMethod();
		innerC.innerCMethod();
	}
	private class InnerA{
		private void innerAMethod () {
			System.out.println("this is from innerA Method");
		}
	}
	
	
	private class InnerB {
		private void innerBMethod () {
			System.out.println("this is from inner B Method");
		}
	}

	private class InnerC {
		private void innerCMethod () {
			System.out.println("this is C");
		}
	}
	private class InnerD {
		private void innerDMethod () {
			System.out.println("THis is D");
		}
	}
}